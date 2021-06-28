package edu.cnm.deepdive;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array
that come after the last 4 in the original array. The original array will contain at least one 4.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

import java.util.Arrays;

public class PostFour {

  public static void main(String[] args) {
    System.out.println("for the int array [2, 4, 1, 2], the result will be "
    + Arrays.toString(post4(new int[] {2, 4, 1, 2})) + ".");
    System.out.println("for the int array [4, 1, 4, 2], the result will be "
        + Arrays.toString(post4(new int[] {4, 1, 4, 2})) + ".");
    System.out.println("for the int array [4, 4, 1, 2, 3], the result will be "
        + Arrays.toString(post4(new int[] {4, 4, 1, 2, 3})) + ".");
  }

  public static int[] post4(int[] nums) {
    int[] result;
    int count = 0;

    for (int i = nums.length - 1; nums[i] != 4 ; i--) {
      count++;
    }
    result = new int[count];

    for (int i = nums.length - count, j = 0; i < nums.length; i++, j++) {
      result[j] = nums[i];
    }
    return result;
  }

}
