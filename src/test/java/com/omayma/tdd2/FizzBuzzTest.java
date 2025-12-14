package com.omayma.tdd2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FizzBuzzTest {
    @Test
    void fizzBuzz_de_1_retourn_1(){

        assertEquals("1",FizzBuzz.de(1));
    }
    @Test
    void fizzBuzz_de_2_retourn_2(){

        assertEquals("2",FizzBuzz.de(2));
    }
    @Test
    void fizzBuzz_de_3_retourn_fizz(){

        assertEquals("Fizz",FizzBuzz.de(3));
    }
    @Test
    void fizzBuzz_de_5_retourn_buzz(){

        assertEquals("Buzz",FizzBuzz.de(5));
    }
    @Test
    void fizzBuzz_de_15_retourn_fizzbuzz(){

        assertEquals("FizzBuzz",FizzBuzz.de(15));
    }
    @ParameterizedTest
    @ValueSource(ints ={1,2,3,4,5,6,7,8,9,10,15,20})
    void fizzbuzz_test_parametre(int n){
        assertNotNull(FizzBuzz.de(n));
    }

}
