package com.martinez.leetcode.editor.en;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  TwoSum twoSum = new TwoSum();

  @Test
  void case1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] solution = twoSum.solution(nums, target);
    boolean ans =
        Arrays.equals(new int[]{0, 1}, solution) || Arrays.equals(new int[]{1, 0}, solution);
    assertTrue(ans);
  }

  @Test
  void case2() {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] solution = twoSum.solution(nums, target);
    boolean ans =
        Arrays.equals(new int[]{1, 2}, solution) || Arrays.equals(new int[]{2, 1}, solution);
    assertTrue(ans);
  }

  @Test
  void case3() {
    int[] nums = {3, 3};
    int target = 6;
    int[] solution = twoSum.solution(nums, target);
    boolean ans =
        Arrays.equals(new int[]{0, 1}, solution) || Arrays.equals(new int[]{1, 0}, solution);
    assertTrue(ans);
  }
}