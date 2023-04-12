package toys_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import toys_game.Unit.Constructor;
import toys_game.Unit.Doll;
import toys_game.Unit.Robot;
import toys_game.Unit.Toy;

public class Main {

    final static Integer TOYSSIZE = 30;
    final static Integer AWATINGSIZE = 15;
    public static ArrayList<Toy> awaitingIssuance = new ArrayList<>();
    private static View consoleView = new View();
    private static Model model = new Model("prizetoys.txt");

    public static void main(String[] args) {
        consoleView.view();
        play();
    }

    public static void play() {

        List<String> constructorNames = Arrays.asList("Magic Castle", "Магнитный конструктор",
                "Космические Войны Штурмовик-коммандер", "Металлический конструктор", "Мягкие кирпичики мини");
        List<String> robotNames = Arrays.asList("Железный человек", "Супер робот", "Трансформер", "Валли", "Тобот");
        List<String> dollNames = Arrays.asList("Рози", "Эльза", "Даша", "Русалочка", "Золушка", "Baby born");

        // Constructors
        generateToys(1, constructorNames);
        
        // Robots
        generateToys(2, robotNames);
        
        // Dolls
        generateToys(3, dollNames);
        

        // Checking the size of the created toy collection
        int modelSize = model.size();

        if (modelSize > TOYSSIZE) {
            int subtract = modelSize - TOYSSIZE;
            for (int i = 0; i < subtract; i++) {
                int idx = modelSize - subtract - i;
                model.delete(idx);
            }
        }
        if (TOYSSIZE > modelSize) {
            System.out.println("Нехватает элементов");
        }
        // Prize-winning toys expecting deliveries
        toFillTheAwaitingIssuanceList(getUniqIndexes());
        // Get prize toy
        Toy toy = getPrizeToy();

        awaitingIssuance.remove(toy);
        model.deleteByToy(toy);
        
        // Save to file
        model.savePlayResultToFile(toy);
        
        int beforeSetQuantity = toy.getQuantity();
        
        toy.setQuantity(toy.getQuantity() - 1);
        
        consoleView.displayWin(toy);
        
        consoleView.displayBeforeSetQuantity(beforeSetQuantity);

        
        consoleView.displayToyQuantity(toy, awaitingIssuance.size(), model.size());


    }

    public static void generateToys(Integer whatCreate, List<String> names) {
        int number = 0;
        Random rnd = new Random();
        List<String> complexityList = Arrays.asList("Высокая", "Средняя", "Низкая");
        List<String> controlTypeList = Arrays.asList("На поверхности", "Пульт");
        List<String> featuresList = Arrays.asList("На шарнирах", "Мягкая");
        List<Float> toysDropRates = Arrays.asList(0.2f, 0.6f);

        if ((whatCreate.equals(1)) || (whatCreate.equals(2))) {
            // To avoid rounding error
            number = Math.round(TOYSSIZE * toysDropRates.get(0)) + 1;
        } else {
            number = Math.round(TOYSSIZE * toysDropRates.get(1));
        }

        while (number > 0) {
            // To make some copies of identical toys
            // For example, 5 robots the Iron person
            String rndName = getRandomData(names);
            String rndComplexity = getRandomData(complexityList);
            String cType = getRandomData(controlTypeList);
            String rndFeature = getRandomData(featuresList);

            int numberOfDetails = rnd.nextInt(10000);

            int rndQuantity = (rnd.nextInt(number) == 0) ? 1 : rnd.nextInt(number);

            for (int i = 0; i < rndQuantity; i++) {
                switch (whatCreate) {
                    case 3:
                        model.add(new Doll(rndName, rndQuantity, rndFeature));
                        break;
                    case 2:
                        model.add(new Robot(rndName, rndQuantity, cType));
                        break;
                    default:
                        model.add(new Constructor(rndName, rndQuantity, numberOfDetails, rndComplexity));
                        break;
                }

            }
            number -= rndQuantity;

        }

    }

    private static String getRandomData(List<String> data) {
        int idx = new Random().nextInt(data.size());
        String rndString = data.get(idx);

        return rndString;
    }

    public static void toFillTheAwaitingIssuanceList(HashSet<Integer> indexes) {
        // Add to the list of prize toys
        for (int i : indexes) {
            awaitingIssuance.add(model.getToyByIdx(i));
        }

    }

    public static HashSet<Integer> getUniqIndexes() {
        // Get the indexes of prize toys
        HashSet<Integer> indexes = new HashSet<>();

        while (AWATINGSIZE > indexes.size()) {
            int idx = new Random().nextInt(model.size());
            indexes.add(idx);
        }

        return indexes;
    }

    private static Toy getPrizeToy() {
        // We always get the first toy from the waiting list
        int idx = 1;
        return awaitingIssuance.get(idx);
    }
}
