package com.kata.trianglearea;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleAreaCalculatorTest {

    @Test
    @DisplayName("When you calculate the area of a 1 length triangle then should return 0.5")
    void givenLength1Triangle_whenCalculateArea_thenShouldReturnHalf() {
        // given
        String triangle = ".\n. .";
        float expectedArea = 0.5F;

        // when
        float area = TriangleAreaCalculator.t_area(triangle);

        // then
        assertThat(area).isEqualTo(expectedArea);
    }
}
