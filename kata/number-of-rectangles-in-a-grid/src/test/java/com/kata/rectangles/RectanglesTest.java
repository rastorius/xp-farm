package com.kata.rectangles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Unit tests for rectangles in a grid calculator")
class RectanglesTest {

    @Test
    @DisplayName("When calculate rectangles for a 1x1 grid then should return 1")
    void given1x1Grid_whenNumberOfRectangles_thenShouldReturn1() {
        // given
        int m = 1;
        int n = 1;
        int expectedResult = 1;

        // when
        int actualResult = Rectangles.numberOfRectangles(m, n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}