package com.omayma.tdd2;

public class FizzBuzz {
    public static String de(int nbre){
        String res="";
        if (nbre % 3 == 0) return "Fizz";
        if (nbre % 5 == 0) return "Buzz";
        return res.isEmpty()?
                String.valueOf(nbre):res;

    }
}
