package com.kata.template;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    void given_when_then() {
        // given
        int expectedResult = 2;

        // when
        int actualResult = 1 + 1;

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
