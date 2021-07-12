package com.kata.overtheroad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tests for over the road value calculator")
class OverTheRoadCalculatorTest {

    @Test
    @DisplayName("When calculating over the road for address 1 and n 1 then should return 2")
    void givenAddress1N1_whenOverTheRoad_thenShouldReturn2() {
        // given
        long address = 1L;
        long n = 1L;
        long expectedResult = 2L;

        // when
        long actualResult = OverTheRoadCalculator.overTheRoad(address, n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("When calculating over the road for address 2 and n 1 then should return 1")
    void givenAddress2N1_whenOverTheRoad_thenShouldReturn1() {
        // given
        long address = 2L;
        long n = 1L;
        long expectedResult = 1L;

        // when
        long actualResult = OverTheRoadCalculator.overTheRoad(address, n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
