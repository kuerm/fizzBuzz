package ch.css.m3000.fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    void fizzBuzzWhen2() {

        String actual = dada(2);

        String expected = "1, 2";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzWhenInput1() {
        int input = 1;

        String actual = dada(input);

        String expected = "1";
        assertThat(actual).isEqualTo(expected);
    }

    private String dada(int input) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            result.append("%d, ".formatted(i));
        }
        result.delete(result.length() - 2, result.length());

        return result.toString();
    }
}
