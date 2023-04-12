package toys_game;

import java.util.ArrayList;
import java.util.Scanner;

import toys_game.Unit.Toy;

public class View {

    Scanner in;

    public void view() {

        in = new Scanner(System.in);
        System.out.println("***************************************************************");
        System.out.println("Добро пожаловать на розыгрыш призов!");
        System.out.println("***************************************************************");
        System.out.println("Нажмите Enter чтобы начать.");
        in.nextLine();
        System.out.println("Формируем список игрушек для выдачи.");
        System.out.println("***************************************************************");
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

    public void displayToyQuantity(Toy toy, int awSize, int mSize) {
        System.out.println("***************************************************************");
        System.out.printf("Осталось %s\n", toy.getInfo());

        System.out.printf("Ожидают выдачи: %s шт.\n", awSize);
        System.out.printf("Всего осталось: %s шт.\n", mSize);
        System.out.println("***************************************************************");
    }

    public void displayBeforeSetQuantity(int quantity) {
        System.out.println("***************************************************************");
        System.out.printf("Было %s шт.\n", quantity);
    }

    public void displayWin(Toy toy) {
        System.out.println("***************************************************************");
        System.out.printf("Вы выиграли  %s игрушку.\n", toy);
        System.out.println("***************************************************************");
    }
}
