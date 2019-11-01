//import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] Card21) {
    System.out.println("START GAME. Computer chose cards.");
    char guess=0;
    //Random r = new Random();
    int aCard1 = (int)(Math.random() * 10) + 1;
    int aCard2 = (int)(Math.random() * 10) + 1;
    int aCard3 = (int)(Math.random() * 10) + 1;
    int aCard4 = (int)(Math.random() * 10) + 1;
    int aSum1 = aCard1 + aCard2;
    int aSum2 = aSum1 + aCard3;
    System.out.println("AI Card 1: " + aCard1);
    System.out.println("AI Card 2: " + aCard2);
    System.out.println("  AI    sum: " + aSum1);
    int hCard1 = (int)(Math.random() * 10) + 1;
    int hCard2 = (int)(Math.random() * 10) + 1;
    int hCard3 = (int)(Math.random() * 10) + 1;
    int hCard4 = (int)(Math.random() * 10) + 1;
    int hSum1 = hCard3 + hCard4;
    System.out.println("Human Card 1: " + hCard1);
    System.out.println("Human Card 2: " + hCard2);
    System.out.println("  HUMAN sum: " + hSum1);

    while ((aCard1 + aCard2) <= 21) {
      if (aSum1 == 21) {
        System.out.println("AI have 21"); 
        }
        else
      if (aSum1 > 21) {
        System.out.println("AI LOST!"); 
        }
        else
      if (aSum1 < 21) {
        System.out.println("AI take card3" + aCard3);
        }
        else
      if (aSum2 == 21) {
        System.out.println("AI have 21");
        }
           else
      if (aSum2 > 21) {
        System.out.println("AI LOST!");
        }
    }    
   
    /**
    while (guess != card1) {
      System.out.printf("Guess card1: ");
      Scanner input = new Scanner(System.in);
      guess = Character.toLowerCase(input.next().charAt(0));
      if (!Character.iscard1(guess)) {
        System.out.println("Enter latin card1 only"); 
        }
        else
      if (guess == card1) {
        System.out.println("YOU WIN!"); 
        }
        else
      if (guess > card1) {
        System.out.println("To HIGH, try again");
        }
        else
      if (guess < card1) {
        System.out.println("To LOW, try again");
        }
    }    
    **/
  }
}
