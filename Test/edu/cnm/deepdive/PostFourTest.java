package edu.cnm.deepdive;

import static edu.cnm.deepdive.PostFour.post4;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostFourTest {

  private int[][] postParams = {
      {2, 4, 1, 2},
      {4, 1, 4, 2},
      {4, 4, 1, 2, 3},
      {4, 2},
      {4, 4, 3},
      {4, 4},
      {4},
      {2, 4, 1, 4, 3, 2},
      {4, 1, 4, 2, 2, 2},
      {3, 4, 3, 2}

  };

  private int[][] postExpected = {
      {1, 2},
      {2},
      {1, 2, 3},
      {2},
      {3},
      {},
      {},
      {3, 2},
      {2, 2, 2},
      {3, 2}
  };

  @Test
  void postTest() {
    for (int i = 0; i < postParams.length; i++) {
      String actual = Arrays.toString(post4(postParams[i]));
      Assertions.assertEquals(actual, Arrays.toString(postExpected[i]));
    }
  }

}