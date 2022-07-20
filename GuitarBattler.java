import java.util.Scanner;

public class GuitarBattler {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to GuitarBattler!");
        System.out.println();
        System.out.println("Please enter a character name:");
        String player1Name = userInput.nextLine();
        Character player1 = new Character(player1Name);



    }

}
