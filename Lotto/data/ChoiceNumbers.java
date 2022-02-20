package data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChoiceNumbers extends Numbers {

    final Scanner io = new Scanner ( System.in );

    public ChoiceNumbers() {
        super ( );
    }

    public int[] readNumbers() {
        int[] choice = new int[ getNumbers ( ) ];
        for (int i = 0; i < choice.length; i++) {
            System.out.println ( "enter a number: " + (i + 1) );
            int numbers;
            numbers = getAnInt ( );
            numbers = getNumbers ( choice , numbers );
            choice[ i ] = numbers;
        }
        return choice;
    }

    private int getAnInt() {
        int numbers;
        while (true) {
            try {
                numbers = io.nextInt ( );
                break;
            } catch (InputMismatchException e) {
                System.out.println ( "enter correct number not a letter or a character" );
                io.next ( );
            }
        }
        return numbers;
    }
    // Validation
    private int getNumbers(int[] choice , int numbers) {
        for (int j = 0; j < choice.length; j++) {
            // Here, code checks if same number and her range 1 -49;
            if ( numbers == choice[ j ] || numbers < getMinNumbers ( ) || numbers > getMaxNumbers ( ) ) {
                while (true) {
                    try {
                        System.out.println ( "enter the correct (not the same, range 1 - 49) number: " );
                        // If number is same, another number choose.
                        numbers = io.nextInt ( );
                        j--; // restart the loop
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println ( "enter correct number not a letter or a character" );
                        io.next ( );
                    }
                }
            }
        }
        return numbers;
    }
}


