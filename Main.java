package toys_game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Main {

    public static ArrayList<Toy> awaitingIssuance = new ArrayList<>();
    
    public static void main() {}      
        

    public static void play() {} 
    

    public static void savePlayResultToFile() {
        FileWriter fileWriter = null;
        
        try {
            fileWriter = new FileWriter("toys.txt");
            //Добавляет в файл данные
            fileWriter.append("Toys");
            fileWriter.flush();
        } catch (IOException e) {
            //Выведет в консоль сообщение об исключении
            System.out.println(e.getMessage());
        }
    }
}
