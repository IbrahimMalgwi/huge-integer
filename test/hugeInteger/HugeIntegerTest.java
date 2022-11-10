package hugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    private HugeInteger hugeInteger;
    private HugeInteger hugeInteger1;
    private HugeInteger hugeInteger2;

    @BeforeEach
    void setUp(){
        hugeInteger = new HugeInteger();
        hugeInteger1 = new HugeInteger();
        hugeInteger2 = new HugeInteger();
    }

    @Test
    void testThatIntegerArrayCanBePopulated(){
        //Given that I have a huge Integer
        //When we invoke the parse method
        //Assert that the int array is populated
        var numbers = hugeInteger.getNumbers();
        assertEquals(0, numbers[0]);
        assertEquals(0, numbers[0]);
        hugeInteger.parse("12345");
        assertEquals(1, numbers[0]);
        assertEquals(2, numbers[1]);
        assertEquals(3, numbers[2]);
        assertEquals(4, numbers[3]);
        assertEquals(5, numbers[4]);
    }

    @Test
    void testThatStringRepresentationOfHugeIntegerCanBePrinted(){
        System.out.println(hugeInteger);
    }

    @Test
    void testThatIfArgumentFromMethodParseContainsLetterAnExceptionIsThrown(){
        assertThrows(NumberFormatException.class, () -> hugeInteger.parse("1ab45"));
    }

    @Test
    void testThatIfDigitLengthExceedFortyAnExceptionIsThrown(){
        assertThrows(DigitLengthException.class, () -> hugeInteger.parse("23456789012324657890432456723456789012355"));
    }


    @Test
    void testThatEachCorrespondingIndexOfTheObjectCanBeAdded(){
        hugeInteger1.parse("2334");
        hugeInteger2.parse("5658");
        HugeInteger sum = HugeInteger.addHugeInteger(hugeInteger1, hugeInteger2);
        var numbers = sum.getNumbers();
        assertEquals(7, numbers[0]);
    }

    @Test
    void testThatEachCorrespondingIndexOfTheObjectCanBeSubracted(){
        hugeInteger1.parse("2334");
        hugeInteger2.parse("5658");
        HugeInteger subt = HugeInteger.subtractHugeInteger(hugeInteger1, hugeInteger2);
        var numbers = subt.getNumbers();
        assertEquals(-3, numbers[0]);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1IsGreaterThanHugeInteger2(){
        hugeInteger1.parse("4556");
        hugeInteger2.parse("2334");
        boolean greater = HugeInteger.isGreaterThan(hugeInteger1, hugeInteger2);
        assertTrue(greater);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1IsLessThanHugeInteger2(){
        hugeInteger1.parse("2334");
        hugeInteger2.parse("4556");
        boolean less = HugeInteger.isLessThan(hugeInteger1, hugeInteger2);
        assertTrue(less);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1IsEqualHugeInteger2(){
        hugeInteger1.parse("12345");
        hugeInteger2.parse("73311");
        boolean equal = HugeInteger.isEquals(hugeInteger1, hugeInteger2);
        assertTrue(equal);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1IsNotEqualHugeInteger2(){
        hugeInteger1.parse("12346");
        hugeInteger2.parse("73311");
        boolean equal = HugeInteger.isNotEquals(hugeInteger1, hugeInteger2);
        assertTrue(equal);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1GreaterThanOrEqualHugeInteger2(){
        hugeInteger1.parse("12345");
        hugeInteger2.parse("73311");
        boolean greaterOrEqual = HugeInteger.isGreaterThanOrEquals(hugeInteger1, hugeInteger2);
        assertTrue(greaterOrEqual);
    }

    @Test
    void textThatTrueIsReturnIfHugeInteger1LessThanOrEqualHugeInteger2(){
        hugeInteger1.parse("12343");
        hugeInteger2.parse("73311");
        boolean lessOrEqual = HugeInteger.isLessThanOrEquals(hugeInteger1, hugeInteger2);
        assertTrue(lessOrEqual);
    }


}