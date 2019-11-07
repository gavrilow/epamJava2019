/**
1. Letter.
Написать программу игры в угадывание букв.
Пользователь должен угадать загаданную программой латинскую букву вводя свой вариант буквы с клавиатуры.
Если пользователь угадал букву, программа выводит сообщение о выигрыше и количестве попыток пользователя.
Если буква не угадана, программа предлагает ввести другую букву. При этом программа выводит подсказки. Если пользователь ввел букву меньше загаданной – вывести сообщение об этом (например, «Too low!»).
Аналогично при вводе буквы больше загаданной (например, «Too high!»).
Если введена не латинская буква – предложить пользователю внимательно ознакомиться с правилами игры.
Программа должна быть не чувствительна к регистру введенной пользователем буквы. Например, при загаданной букве ‘G’ ответы пользователя ‘G’ или ‘g’ в равной степени считаются правильными.
Игра продолжается до выигрыша пользователя.
**/

import java.util.Random;
import java.util.Scanner;

public class Letter {
    public static void main(String[] LetterGame) {
        System.out.println("START GAME. Computer chose letter.");
        char guess = 0;
        Random r = new Random();
        char letter = (char) (r.nextInt(26) + 'a');
        //System.out.println("Random: " + letter); // show random letter, hide

        while (guess != letter) {
            System.out.printf("Guess letter: ");
            Scanner input = new Scanner(System.in);
            guess = Character.toLowerCase(input.next().charAt(0));
            if (!Character.isLetter(guess)) {
                System.out.println("Enter latin letter only");
            } else if (guess == letter) {
                System.out.println("YOU WIN!");
            } else if (guess > letter) {
                System.out.println("To HIGH, try again");
            } else if (guess < letter) {
                System.out.println("To LOW, try again");
            }
        }
    }
}
