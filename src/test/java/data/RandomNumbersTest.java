package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumbersTest extends RandomNumbers {

    RandomNumbers randomNumbers = new RandomNumbers ( );

    @Test
    void testRandomNums() {
        int loops = 100_000;
        int[] currentRandomInt = randomNumbers.randomNums ( );

        while (loops > 0) {
            for (int i = 0; i < currentRandomInt.length; i++) {
                assertTrue ( currentRandomInt[ i ] >= 1 || currentRandomInt[ i ] <= 49 );
                loops--;
            }
        }
    }
}