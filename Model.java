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

    public void delete(Toy toy) {
        allToys.remove(toy);
    }

    public void savePlayResultToFile() {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(this.path);
            // Добавляет в файл данные
            for (int i = 0; i < allToys.size(); i++) {
                fileWriter.append(allToys.get(i).toString() + "\n");
            }

            fileWriter.flush();
        } catch (IOException e) {
            // Выведет в консоль сообщение об исключении
            System.out.println(e.getMessage());
        }
    }
}
