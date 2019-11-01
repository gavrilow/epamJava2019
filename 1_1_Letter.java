import java.util.*;

public class Main {
  public static void main(String[] GuessingGame) {
    System.out.println("START GAME. Computer chose letter.");
    char guess=0;
    Random r = new Random();
    char letter = (char)(r.nextInt(26) + 'a');
    System.out.println("Random: " + letter); // show random letter, hide
    
    while (guess != letter) {
      System.out.printf("Guess letter: ");
      Scanner input = new Scanner(System.in);
      guess = Character.toLowerCase(input.next().charAt(0));
      if (!Character.isLetter(guess)) {
        System.out.println("Enter latin letter only"); 
        }
        else
      if (guess == letter) {
        System.out.println("YOU WIN!"); 
        }
        else
      if (guess > letter) {
        System.out.println("To HIGH, try again");
        }
        else
      if (guess < letter) {
        System.out.println("To LOW, try again");
        }
    }    
  }
}
