package com.thoughtworks.tdd;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        String result = new String();
        if (String.valueOf(number).indexOf("3") > -1) {
            return "Fizz";
        } else {
            if (number % 3 == 0) {
                result = result.concat("Fizz");
            }
            if (number % 5 == 0) {
                result = result.concat("Buzz");
            }
            if (number % 7 == 0) {
                result = result.concat("Whizz");
            }
            return "".equals(result) ? String.valueOf(number) : result;
        }
    }
}
