package model;

import data.ChoiceNumbers;
import data.LuckyDip;
import data.RandomNumbers;
import java.util.Arrays;


public class CheckWin {

    final ChoiceNumbers choiceNumbers = new ChoiceNumbers ( );
    final RandomNumbers randomNumbers = new RandomNumbers ( );
    final LuckyDip luckyDip = new LuckyDip ( );

    void checkWinChoice() {
        int[] choiceNums = choiceNumbers.readNumbers ( );
        Arrays.sort ( choiceNums );
        int[] randNums = randomNumbers.randomNums ( );
        Arrays.sort ( randNums );
        int count = 0;
        System.out.println ( "choice numbers" );
        System.out.println ( Arrays.toString ( choiceNums ) );
        System.out.println ( "generated numbers" );
        System.out.println ( Arrays.toString ( randNums ) );
        for (int i = 0; i < 6; i++) {

            count = getAnInt ( choiceNums , randNums , count , i );
        }
        System.out.print ( "Hits: " );
        System.out.println ( count + "\n" );
    }

    private int getAnInt(int[] choiceNums , int[] randNums , int count , int i) {
        if ( choiceNums[ i ] == randNums[ i ] ) {
            System.out.println ( "Win data.Numbers !!!" );
            System.out.print ( choiceNums[ i ] + " : " );
            System.out.println ( randNums[ i ] );
            count++;
        }
        return count;
    }

    void checkWinLuckyDip() {
        int[] luckyDipRNum = luckyDip.randomNums ( );
        Arrays.sort ( luckyDipRNum );
        int[] randNums = randomNumbers.randomNums ( );
        Arrays.sort ( randNums );

        int count = 0;
        System.out.println ( "lucky dip numbers" );
        System.out.println ( Arrays.toString ( luckyDipRNum ) );
        System.out.println ( "generated numbers" );
        System.out.println ( Arrays.toString ( randNums ) );
        for (int i = 0; i < 6; i++) {
            count = getCount ( luckyDipRNum , randNums , count , i );
        }
        System.out.print ( "Hits: " );
        System.out.println ( count + "\n" );

    }

    private int getCount(int[] luckyDipRNum , int[] randNums , int count , int i) {
        if ( luckyDipRNum[ i ] == randNums[ i ] ) {

            System.out.println ( "Win data.Numbers !!!" );
            System.out.print ( luckyDipRNum[ i ] + " : " );
            System.out.println ( randNums[ i ] );
            count++;
        }
        return count;
    }
}




