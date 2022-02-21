package dataread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {


    public int getInt(Scanner io) {

        int number;
        while (true) {
            try {
                number = io.nextInt ( );
                break;
            } catch (InputMismatchException e) {
                System.out.println ( "enter correct number not a letter or a character" );
                io.next ( );
            }
        }
        return number;
    }

    public void exit(Scanner io) {

        io.close ( );
    }

}
