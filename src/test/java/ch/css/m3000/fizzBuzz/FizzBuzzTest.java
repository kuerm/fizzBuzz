package ch.css.m3000.fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class FizzBuzzTest {
    @Test
    void fizzBuzzWhen2() {

        String actual = fizzBuzz(2);

        String expected = "1, 2";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzWhenInput1() {
        int input = 1;

        String actual = fizzBuzz(input);

        String expected = "1";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void fizzBuzzWhenInputIsBelow1() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fizzBuzz(0));
    }

    @Test
    void fizzBuzzWhenInputIs3ThenReturnFizz() {
        int input = 3;

        String actual = fizzBuzz(input);

        String expected = "1, 2, fizz";
        assertThat(actual).isEqualTo(expected);
    }

    private String fizzBuzz(int input) {
        if (input < 1) {
            throw new IllegalArgumentException("Only numbers > 1 are allowed. Your Input was %d".formatted(input));
        }
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) {
                result.append("fizz, ");
            } else {
                result.append("%d, ".formatted(i));
            }
        }
        result.delete(result.length() - 2, result.length());

        return result.toString();
    }
}
