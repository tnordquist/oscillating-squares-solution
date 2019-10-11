package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneratorTest {

  int[] testArr = {0, -1, 4, -9, 16, -25, 36, -49, 64, -81, 100, -121, 144, -169};

  @Test
  void oscillatingSquares() {
    for (int i = 0; i < testArr.length; i++) {
      assertEquals(testArr[i], Generator.oscillatingSquares(testArr.length)[i]);
    }
  }
}