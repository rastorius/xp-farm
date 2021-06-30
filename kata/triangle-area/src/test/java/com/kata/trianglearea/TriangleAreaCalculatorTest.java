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

    @Test
    @DisplayName("When you calculate the area of a 2 length triangle then should return 2.0")
    void givenLength2Triangle_whenCalculateArea_thenShouldReturn2() {
        // given
        String triangle = ".\n. .\n. . .";
        float expectedArea = 2.0F;

        // when
        float area = TriangleAreaCalculator.t_area(triangle);

        // then
        assertThat(area).isEqualTo(expectedArea);
    }

    @Test
    @DisplayName("When you calculate the area of a 3 length triangle then should return 4.5")
    void givenLength3Triangle_whenCalculateArea_thenShouldReturn4AndAHalf() {
        // given
        String triangle = ".\n. .\n. . .\n. . . .";
        float expectedArea = 4.5F;

        // when
        float area = TriangleAreaCalculator.t_area(triangle);

        // then
        assertThat(area).isEqualTo(expectedArea);
    }
}
