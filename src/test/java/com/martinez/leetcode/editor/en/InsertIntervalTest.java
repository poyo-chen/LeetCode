package com.martinez.leetcode.editor.en;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class InsertIntervalTest {

  InsertInterval insertInterval = new InsertInterval();

  @Test
  void case1() {
    int[][] intervals = {{1, 3}, {6, 9}};
    int[] newInterval = {2, 5};
    int[][] insert = insertInterval.insert(intervals, newInterval);
    System.out.println("arrayString(insert) = " + arrayString(insert));
    assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, insert);
  }

  @Test
  void case2() {
    int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
    int[] newInterval = {4, 8};
    int[][] insert = insertInterval.insert(intervals, newInterval);
    System.out.println("arrayString(insert) = " + arrayString(insert));
    assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, insert);
  }

  @Test
  void case3() {
    int[][] intervals = {};
    int[] newInterval = {5, 7};
    int[][] insert = insertInterval.insert(intervals, newInterval);
    System.out.println("arrayString(insert) = " + arrayString(insert));
    assertArrayEquals(new int[][]{{5, 7}}, insert);
  }

  @Test
  void case4() {
    int[][] intervals = {{1, 5}};
    int[] newInterval = {2, 3};
    int[][] insert = insertInterval.insert(intervals, newInterval);
    System.out.println("arrayString(insert) = " + arrayString(insert));
    assertArrayEquals(new int[][]{{1, 5}}, insert);
  }


  private String arrayString(int[][] array) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    for (int i = 0; i < array.length; i++) {
      stringBuilder.append("[");
      for (int j = 0; j < array[i].length; j++) {
        stringBuilder.append(array[i][j]);
        if (j < array[i].length - 1) {
          stringBuilder.append(", ");
        }
      }
      stringBuilder.append("]");
      if (i < array.length - 1) {
        stringBuilder.append(", ");
      }
    }
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}