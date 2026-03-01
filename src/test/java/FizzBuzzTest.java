import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void should_return_n_with_not_multiples_of_3_and_5(){
        assertEquals("11", FizzBuzz.fizzbuzz(11));
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    void should_be_Fizz_with_3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    void should_be_Fizz_with_5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    void should_be_FizzBuzz_with_multiples_of_3_and_5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    void should_be_Fizz_without_3(){
        assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
    }

    @Test
    void should_be_Buzz_without_5(){
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }
    
}
