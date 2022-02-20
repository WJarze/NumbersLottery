package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LuckyDipTest extends LuckyDip {

    LuckyDip luckyDip = new LuckyDip ( );

    @Test
    void testRandomNums1() {
        int loops = 100_000;
        int[] currentRandomInt = luckyDip.randomNums ( );

        while (loops > 0) {
            for (int i = 0; i < currentRandomInt.length; i++) {
                assertTrue ( currentRandomInt[ i ] >= 1 || currentRandomInt[ i ] <= 49 );
                loops--;
            }
        }
    }
}