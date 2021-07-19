package com.kata.buildtower;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tower builder tests")
class TowerBuilderTest {

    @Test
    @DisplayName("1 -> [\"*\"]")
    void givenN1_whenBuildTower_thenShouldReturnCorrectList() {
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
    void givenN2_whenBuildTower_thenShouldReturnCorrectList() {
        // given
        int n = 2;
        List<String> expectedResult = List.of(" * ", "***");

        // when
        List<String> actualResult = TowerBuilder.buildTower(n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("3 -> [\"  *  \", \" *** \", \"*****\"]")
    void givenN3_whenBuildTower_thenShouldReturnCorrectList() {
        // given
        int n = 3;
        List<String> expectedResult = List.of("  *  ", " *** ", "*****");

        // when
        List<String> actualResult = TowerBuilder.buildTower(n);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
