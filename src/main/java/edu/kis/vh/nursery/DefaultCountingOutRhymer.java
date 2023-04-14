package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBER_OF_ELEMENTS = 12;
    public static final int TOTAL_VALUE = -1;
    public static final int FULL_ARRAY = 11;
    public static final int CALL_ERR = -1;
    private final int[] numbers = new int[NUMBER_OF_ELEMENTS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == FULL_ARRAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return CALL_ERR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return CALL_ERR;
        return numbers[total--];
    }

}
