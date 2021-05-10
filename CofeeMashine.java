import java.util.Scanner;

public class CofeeMashine {
    public static void main(String[] args) {

        int americano = 100;
        int milk = 50;
        int water = 20;
        int tia = 50;
        int capuchino = 120;
        int espresso = 60;

        System.out.println("__________________Кофемашина___________________");
        System.out.print("Введите сумму: ");
        Scanner inputPrice = new Scanner(System.in);
        int price = inputPrice.nextInt();
        System.out.println("Вы внесли: " + price + "руб. ");
        System.out.println();

        boolean canBuySomething = false;

        if (price >= americano) {
            System.out.println("Вы можете купить американо");
            canBuySomething = true;
        }

        if (price >= milk) {
            System.out.println("Вы можете купить молоко");
            canBuySomething = true;
        }

        if (price >= water) {
            System.out.println("Вы можете купить воду");
            canBuySomething = true;
        }

        if (price >= tia) {
            System.out.println("Вы можете купить чай");
            canBuySomething = true;
        }

        if (price >= capuchino) {
            System.out.println("Вы можете купить капучино");
            canBuySomething = true;
        }

        if (price >= espresso) {
            System.out.println("Вы можете купить эспрессо");
            canBuySomething = true;
        }

        if (canBuySomething == false){
            System.out.println("Внесите больше денег");
        }


    }
}