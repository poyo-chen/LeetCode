package com.martinez.leetcode.editor.en;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ThreeSumTest {

  @Test
  void case1() {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    int[][] expected = {{-1, -1, 2}, {-1, 0, 1}};
    List<List<Integer>> actualList = new ThreeSum().threeSum(nums);
    int[][] actual = actualList.stream()
        .map(rowList -> rowList.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
    assertArrayEquals(expected, actual);
  }

  @Test
  void case2() {
    int[] nums = {0,0,0};
    int[][] expected = {{0,0,0}};
    List<List<Integer>> actualList = new ThreeSum().threeSum(nums);
    int[][] actual = actualList.stream()
        .map(rowList -> rowList.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
    assertArrayEquals(expected, actual);
  }

  @Test
  void case3() {
    int[] nums = {0,1,1};
    int[][] expected = {};
    List<List<Integer>> actualList = new ThreeSum().threeSum(nums);
    int[][] actual = actualList.stream()
        .map(rowList -> rowList.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
    assertArrayEquals(expected, actual);
  }

  @Test
  void case4() {
    int[] nums = {0,0,0,0};
    int[][] expected = {{0,0,0}};
    List<List<Integer>> actualList = new ThreeSum().threeSum(nums);
    int[][] actual = actualList.stream()
        .map(rowList -> rowList.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);
    assertArrayEquals(expected, actual);
  }
}