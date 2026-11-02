package kz.learning.hello;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    @Test
    public void addTest() {
        assertThat(new Calculator().add(2, 3)).isEqualTo(5);
    }

    @Test
    public void percentOfTest() {
        assertThat(new Calculator().percentOf(199, 15)).isEqualTo(29);
    }
}
