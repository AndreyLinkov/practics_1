//Игра "Угадай число":
//        * Программа генерирует случайное число.
//        * Пользователь вводит свои попытки.
//        * Программа подсказывает, больше или меньше загаданное число.
//        * Игра заканчивается, когда пользователь угадывает число.

import java.util.Random;
import java.util.Scanner;

public class quess {
    public static void main(String[] args) {
        Random random = new Random();
        int quessNumber = random.nextInt(1, 101);
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the number?: ");
            int numInput = input.nextInt();
            if(numInput>quessNumber) {
                System.out.println("Your number is greater than the guessed number; ");
            } else if(numInput<quessNumber){
                System.out.println("Your number is less than the hidden number");
            } else {
                System.out.println("You guessed it!");
                break;
            }
        } while(true);
        input.close();
    }
}