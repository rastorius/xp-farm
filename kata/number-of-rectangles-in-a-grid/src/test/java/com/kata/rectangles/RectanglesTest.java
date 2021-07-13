package com.kata.rectangles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Unit tests for rectangles in a grid calculator")
class RectanglesTest {

    @ParameterizedTest(name = "{0} x {1} -> {2}")
    @CsvSource({"1,1,1", "1,2,3", "2,1,3", "2,2,9"})
    @DisplayName("When calculate rectangles for a m x n grid then should return expected value")
    void givenGrid_whenNumberOfRectangles_thenShouldReturnCorrectValue(int m, int n, int expectedResult) {
        assertThat(Rectangles.numberOfRectangles(m, n))
                .isEqualTo(expectedResult);
    }
}
