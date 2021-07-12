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

    @Test
    @DisplayName("#1 - When calculating over the road for large address and n then should return correct value")
    void givenLargeAddressLargeN_whenOverTheRoad_thenShouldReturnCorrectValue() {
        // given
        long address = 9999999000L;
        long n = 5000000000L;
        long expectedResult = 1001L;

        // when
        long actualResult = OverTheRoadCalculator.overTheRoad(address, n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("#2 - When calculating over the road for large address and n then should return correct value")
    void givenLargeAddressLargeNReversed_whenOverTheRoad_thenShouldReturnCorrectValue() {
        // given
        long address = 1001L;
        long n = 5000000000L;
        long expectedResult = 9999999000L;

        // when
        long actualResult = OverTheRoadCalculator.overTheRoad(address, n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
