/* 1. Letter.
 * Написать программу игры в угадывание букв.
 * Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры.
 * Если пользователь угадал букву, программа выводит сообщение о выигрыше и количестве попыток пользователя.
 * Если буква не угадана, программа предлагает ввести другую букву. При этом программа выводит подсказки. Если пользователь ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»).
 * Аналогично при вводе буквы больше загаданной (например, «Too high!»).
 * Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
 * Программа должна быть не чувствительна к регистру введенной пользователем буквы. Например, при загаданной букве ‘G’ ответы пользователя ‘G’ или ‘g’ в равной степени считаются правильными.
 * Игра продолжается до выигрыша пользователя.
 */

import java.util.Random;
import java.util.Scanner;

public class Letter {
    public static void main(String[] LetterGame) {
        System.out.println("START GAME. Computer chose letter.");
        char guess = 0;
        int result = 0;
        Random r = new Random();
        char letter = (char) (r.nextInt(26) + 'a');
        //System.out.println("Random: " + letter); // show random letter, hide

        while (guess != letter) {
            Scanner input = new Scanner(System.in);
            guess = Character.toLowerCase(input.next().charAt(0));
            if (!Character.isLetter(guess)) {
                result = 1;
            } else if (guess == letter) {
                result = 2;
            } else if (guess > letter) {
                result = 3;
            } else if (guess < letter) {
                result = 4;
            }
            // Messages block
            switch (result) {
                case 0:
                    System.out.printf("Guess letter: ");
                    break;
                case 1:
                    System.out.println("Enter latin letter only");
                    break;
                case 2:
                    System.out.println("YOU WIN!");
                    break;
                case 3:
                    System.out.println("To HIGH, try again");
                    break;
                case 4:
                    System.out.println("To LOW, try again");

            }
        }
    }
}
