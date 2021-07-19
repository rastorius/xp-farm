package com.kata.buildtower;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tower builder tests")
class TowerBuilderTest {

    @Test
    @DisplayName("1 -> [\"*\"]")
    void testForOne() {
        // given
        int n = 1;
        List<String> expectedResult = List.of("*");

        // when
        List<String> actualResult = TowerBuilder.buildTower(n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("2 -> [\" * \", \"***\"]")
    void testForTwo() {
        // given
        int n = 2;
        List<String> expectedResult = List.of(" * ", "***");

        // when
        List<String> actualResult = TowerBuilder.buildTower(n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
