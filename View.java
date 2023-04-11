package toys_game;

import java.util.ArrayList;
import java.util.Scanner;

import toys_game.Unit.Toy;

public class View {

    Scanner in;

    public void view() {

        in = new Scanner(System.in);
        System.out.println("Добро пожаловать на розыгрыш призов!");
        System.out.println("Нажмите Enter чтобы начать.");
        in.nextLine();
        System.out.println("Формируем список игрушек для выдачи.");

    }

    public void displayToyDescription(Toy toy) {
        System.out.println(toy);
    }

    public void displayAllToys(ArrayList<Toy> data) {
        if (data.isEmpty()){
            System.out.println("---------------Список игрушек пуст---------------");
        } else {
            System.out.println("---------------Cписок игрушек---------------");
            
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i).toString());
            }
        }
    }

    public void displayToyDispense(Toy toy) {
        System.out.printf("Вы получаете в качестве приза: %s", toy);
    }

    public void displayToyQuantity(Toy toy) {
        System.out.printf("Осталось %s  игрушек на складе.", toy);
    }
}
