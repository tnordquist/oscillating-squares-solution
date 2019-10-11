package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GeneratorTest {

  private static final int INPUT_Int_1 = 0;
  private static final int[] EXPECTED_ARR_1 = {};
  private static final int INPUT_INT_2 = 1;
  private static final int[] EXPECTED_ARR_2 = {0};
  private static final int INPUT_INT_3 = 5;
  private static final int[] EXPECTED_ARR_3 = {0, -1, 4, -9, 16};
  private static final int INPUT_INT_4 = 7;
  private static final int[] EXPECTED_ARR_4 = {0, -1, 4, -9, 16, -25, 36};
  private static final int INPUT_INT_5 = 10;
  private static final int[] EXPECTED_ARR_5 = {0, -1, 4, -9, 16, -25, 36, -49, 64, -81};

  @ParameterizedTest
  @MethodSource
  void oscillatingSquares(int input, int[] output) {

    Assertions.assertArrayEquals(output, Generator.oscillatingSquares(input));
  }
    private static Stream<Arguments> oscillatingSquares(){

    return Stream.of(
        Arguments.of(INPUT_Int_1, EXPECTED_ARR_1),
        Arguments.of(INPUT_INT_2, EXPECTED_ARR_2),
        Arguments.of(INPUT_INT_3, EXPECTED_ARR_3),
        Arguments.of(INPUT_INT_4, EXPECTED_ARR_4),
        Arguments.of(INPUT_INT_5, EXPECTED_ARR_5)
    );
    }
  }
