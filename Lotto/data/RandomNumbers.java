package data;

import java.util.Random;

public class RandomNumbers extends Numbers {

    public RandomNumbers() {
        super ( );
    }

    public int[] randomNums() {
        int[] rand = new int[ getNumbers ( ) ];
        Random random = new Random ( );
        for (int i = 0; i < rand.length; i++) {
            int numbers = random.nextInt ( getMinNumbers ( ) , getMaxNumbers ( ) );
            numbers = getNumbers ( rand , random , numbers );
            rand[ i ] = numbers;
        }
        return rand;
    }

    // Validation
    private int getNumbers(int[] rand , Random random , int numbers) {
        int j = 0;
        while (j < rand.length) {
            // is it duplicate
            if ( (rand[ j ] == numbers) ) {
                // If duplicate generated new number.
                numbers = random.nextInt ( getMinNumbers ( ) , getMaxNumbers ( ) );
                j--; // restart the loop
            }
            j++;
        }
        return numbers;
    }
}
