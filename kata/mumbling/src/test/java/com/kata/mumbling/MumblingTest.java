package com.kata.mumbling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Mumbling unit tests")
class MumblingTest {

    @Test
    @DisplayName("When accum with empty input then should return empty string")
    void givenEmptyInput_whenMumbling_thenShouldReturnEmptyString() {
        // given
        String input = "";
        String expectedResult = "";

        // when
        String actualResult = Mumbling.accum(input);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("When accum with a single capital character then should return same character")
    void given1CapitalCharInput_whenMumbling_thenShouldReturnSameChar() {
        // given
        String input = "A";
        String expectedResult = "A";

        // when
        String actualResult = Mumbling.accum(input);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
