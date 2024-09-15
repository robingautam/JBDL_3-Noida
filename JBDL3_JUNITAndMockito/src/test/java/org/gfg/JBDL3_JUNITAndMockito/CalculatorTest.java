package org.gfg.JBDL3_JUNITAndMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,4);

        Assertions.assertEquals(7,result);


    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(3,4);

        Assertions.assertEquals(-1,result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3,4);

        Assertions.assertEquals(12,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,9,1,11,13})
    void isOdd(int num){
        Calculator calculator = new Calculator();
        boolean result = calculator.isOdd(num);

        Assertions.assertEquals(true,result);
    }

    @ParameterizedTest
    @MethodSource("getNumberList")
    void isOddWithMethod(int num){
        Calculator calculator = new Calculator();
        boolean result = calculator.isOdd(num);

        Assertions.assertEquals(true,result);
    }

    public static List<Integer> getNumberList(){
        return Arrays.asList(1,3,7,9,13,11);
    }


    @ParameterizedTest
   // @CsvSource({"2,5,10","8,1,9","6,4,10"})
    @CsvFileSource(resources = "/testcases_jbdl.csv", numLinesToSkip = 1)
    void testSum(int a, int b, int expected){
        Calculator calculator = new Calculator();
        int result = calculator.add(a,b);

        Assertions.assertEquals(expected,result);
    }
}