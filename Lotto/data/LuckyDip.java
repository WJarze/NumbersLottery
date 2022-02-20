package data;

import java.util.Random;

public class LuckyDip extends RandomNumbers {

    public LuckyDip() {
        super ( );
    }

    @Override
    public int[] randomNums() {
        int[] luckyDipRand = new int[ getNumbers ( ) ];
        Random random;
        random = new Random ( );
        for (int i = 0; i < luckyDipRand.length; i++) {

            int numbers = random.nextInt ( getMinNumbers ( ) , getMaxNumbers ( ) );

            numbers = getAnInt ( luckyDipRand , random , numbers );

            luckyDipRand[ i ] = numbers;
        }
        return luckyDipRand;
    }
    // Validation
    private int getAnInt(int[] luckyDipRand , Random random , int numbers) {
        int j = 0;
        while (j < luckyDipRand.length) {
            // Here, code checks same random number generated before and her range 1 -49
            if ( luckyDipRand[ j ] == numbers ) {
                // If random number is same and from  range 1 -49, another number generated.
                numbers = random.nextInt ( getMinNumbers ( ) , getMaxNumbers ( ) );
                j--; // restart the loop
            }
            j++;
        }
        return numbers;
    }

}
