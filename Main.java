package toys_game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import toys_game.Unit.Constructor;
import toys_game.Unit.Doll;
import toys_game.Unit.Robot;
import toys_game.Unit.Toy;

public class Main {

    public static ArrayList<Toy> awaitingIssuance = new ArrayList<>();

    public static void main(String[] args) {

        View consoleView = new View();
        consoleView.view();
        
        Robot r1 = new Robot("Iron man", 5, "On the body");
        Robot r2 = new Robot("Max", 1, "On the body");

        Doll d1 = new Doll("Эльза", 7, "Articulated");

        Constructor c1 = new Constructor("Magic Castle", 3, 6739, "High");

        consoleView.displayToyDescription(r1);
        consoleView.displayToyDescription(r2);
        consoleView.displayToyDescription(d1);
        consoleView.displayToyDescription(c1);

    }

    public static void play() {
    }

    public static void savePlayResultToFile() {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("toys.txt");
            // Добавляет в файл данные
            fileWriter.append("Toys");
            fileWriter.flush();
        } catch (IOException e) {
            // Выведет в консоль сообщение об исключении
            System.out.println(e.getMessage());
        }
    }
}
