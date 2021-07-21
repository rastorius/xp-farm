package com.kata.mumbling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Mumbling unit tests")
class MumblingTest {

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("A", "A"),
                Arguments.of("d", "D"),
                Arguments.of("zx", "Z-Xx"),
                Arguments.of("PQ", "P-Qq"),
                Arguments.of("nM", "N-Mm")
        );
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @MethodSource("testData")
    @DisplayName("When accum with non-empty input then should return correct string")
    void givenInput_whenMumbling_thenShouldReturnCorrectString(String input, String expectedResult) {
        assertThat(Mumbling.accum(input)).isEqualTo(expectedResult);
    }

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
}
