package com.omayma.tdd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
