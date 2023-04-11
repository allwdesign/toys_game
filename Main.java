package toys_game;

import java.util.ArrayList;

import toys_game.Unit.Constructor;
import toys_game.Unit.Doll;
import toys_game.Unit.Robot;
import toys_game.Unit.Toy;

public class Main {

    public static ArrayList<Toy> awaitingIssuance = new ArrayList<>();

    public static void main(String[] args) {

        View consoleView = new View();
        Model model = new Model("toys.txt");

        consoleView.view();

        Robot r1 = new Robot("Iron man", 5, "On the body");
        Robot r2 = new Robot("Max", 1, "On the body");

        Doll d1 = new Doll("Эльза", 7, "Articulated");

        Constructor c1 = new Constructor("Magic Castle", 3, 6739, "High");

        consoleView.displayToyDescription(r1);
        consoleView.displayToyDescription(r2);
        consoleView.displayToyDescription(d1);
        consoleView.displayToyDescription(c1);

        model.add(r1);
        model.add(r2);
        model.add(d1);
        model.add(c1);

        consoleView.displayAllToys(Model.allToys);

        model.savePlayResultToFile();

        model.delete(r1);
        model.delete(r2);
        model.delete(d1);
        model.delete(c1);

        consoleView.displayAllToys(Model.allToys);
    }

    public static void play() {
    }

}
