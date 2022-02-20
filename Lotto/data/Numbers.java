package data;

public class Numbers {

    private final int numbers;
    private final int minNumbers;
    private final int maxNumbers;


    Numbers() {
        this.numbers = PlayingConditions.NUMBERS.getValue ( );
        this.minNumbers = PlayingConditions.MIN_NUMBERS.getValue ( );
        this.maxNumbers = PlayingConditions.MAX_NUMBERS.getValue ( );
    }

      int getNumbers() {
        return numbers;
    }

    int getMinNumbers() {
        return minNumbers;
    }

    int getMaxNumbers() {
        return maxNumbers;
    }
}