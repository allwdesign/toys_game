package toys_game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import toys_game.Unit.Toy;

public class Model {
    public static ArrayList<Toy> allToys = new ArrayList<>();
    public String path;

    public Model(String path) {
        this.path = path;
    }

    public void add(Toy toy) {
        allToys.add(toy);
    }

    public void delete(int idx) {
        allToys.remove(idx);
    }
    public void deleteByToy(Toy toy) {
        allToys.remove(toy);
    }

    public Integer size() {
        return allToys.size();
    }
    public Toy getToyByIdx(int idx) {
        return allToys.get(idx);
        
    }


    public void savePlayResultToFile(Toy toy) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(this.path);
            // Adds data to a file
            fileWriter.append(toy.toString() + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            // Prints an exception message to the console
            System.out.println(e.getMessage());
        }
    }
}
