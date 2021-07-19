package com.kata.buildtower;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Tower builder tests")
class TowerBuilderTest {

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(1, List.of("*")),
                Arguments.of(2, List.of(" * ", "***")),
                Arguments.of(3, List.of("  *  ", " *** ", "*****"))
        );
    }

    @ParameterizedTest(name = "{0} -> {1}")
    @MethodSource("generateData")
    @DisplayName("When you build a tower with given number of floors then should return correct list")
    void givenNumberOfFloors_whenBuildTower_thenShouldReturnCorrectList(int numberOfFloors, List<String> expectedResult) {
        assertThat(TowerBuilder.buildTower(numberOfFloors)).isEqualTo(expectedResult);
    }
}
