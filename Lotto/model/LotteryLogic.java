package model;
import dataread.DataReader;
public class LotteryLogic {

    private static final int EXIT = 0;
    private static final int CHOICE_NUMBERS = 1;
    private static final int LUCKY_DIP = 2;
    final DataReader io = new DataReader ( );
    final CheckWin checkWin = new CheckWin ( );

    public void controlLoop() {
        int option;

        do {
            printOptions ( );
            option = io.getInt ( );
            switch (option) {
                case CHOICE_NUMBERS -> checkWin.checkWinChoice ( );
                case LUCKY_DIP -> checkWin.checkWinLuckyDip ( );
                case EXIT -> io.exit ( );
                default -> System.out.println ( "no such options: " );
            }
        } while (option != EXIT);
    }
    private void printOptions() {
        System.out.println ( "options: " );
        System.out.println ( EXIT + " - exit" );
        System.out.println ( CHOICE_NUMBERS + " - choice numbers" );
        System.out.println ( LUCKY_DIP + " - lucky dip numbers" );
    }
}
