package hugeInteger;

import java.util.Arrays;

public class HugeInteger {
    private final int[] numbers = new int[40];

    public void parse(String digits) {
        for (int i = 0; i <digits.length() ; i++) {
            //char digit = digit.charAt(i);
            if (Character.isLetter(i)) containsLetter();
            if (digits.length() > 40) exceedLength();
            else StringToInteger(digits, i);
        }
    }

    private void StringToInteger(String digits, int i) {
        for (int j = 0; j <digits.length(); j++) {
            int digitsToInt = Integer.parseInt(String.valueOf(digits.charAt(i)));
            numbers[i] = digitsToInt;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static HugeInteger addHugeInteger(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count = 0;
        HugeInteger hugeInteger = new HugeInteger();
        while (count < 40){
            hugeInteger.numbers[count] = hugeInteger1.numbers[count] + hugeInteger2.numbers[count];
            count++;
        }
        return hugeInteger;
    }

    public static HugeInteger subtractHugeInteger(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        int count = 0;
        HugeInteger hugeInteger = new HugeInteger();
        while (count < 40) {
            hugeInteger.numbers[count] = hugeInteger1.numbers[count] - hugeInteger2.numbers[count];
            count++;
        }
        return hugeInteger;
    }

    public static boolean greaterThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count = 0;

        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;

        for (int i = 0; i < count; i++) {
            hugeInteger1Sum += hugeInteger1.numbers[i];
            hugeInteger2Sum += hugeInteger2.numbers[i];
        }

        if (hugeInteger1Sum > hugeInteger2Sum) {
            return true;
        }
       else return false;
    }

    public static boolean lessThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
        int count = 0;

        int hugeInteger1Sum = 0;
        int hugeInteger2Sum = 0;

        for (int i = 0; i < count; i++) {
            hugeInteger1Sum += hugeInteger1.numbers[i];
            hugeInteger2Sum += hugeInteger2.numbers[i];
        }
        if (hugeInteger1Sum < hugeInteger2Sum) {
            return true;
        }
        else return false;
    }

    public static void isEquals(HugeInteger hugeInteger1, HugeInteger hugeInteger2) {
    }



    private void exceedLength() {
        throw new DigitLengthException("you've exceeded the length");
    }

    private void containsLetter() {
        throw new NumberFormatException("Only digit is allow");
    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }



}
