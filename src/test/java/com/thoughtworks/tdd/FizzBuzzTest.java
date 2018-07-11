package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {
    @Test
    public void should_return_1_when_call_fizzbuzz_when_input_is_1(){
        //given
        int number=1;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String result =fizzBuzz.fizzBuzz(number);
        //then
        assertThat(result,is("1"));
    }

    @Test
    public void should_return_Fizz_when_call_fizzbuzz_when_input_is_3(){
        //given
        int number=3;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //when
        String result =fizzBuzz.fizzBuzz(number);
        //then
        assertThat(result,is("Fizz"));
    }
}
