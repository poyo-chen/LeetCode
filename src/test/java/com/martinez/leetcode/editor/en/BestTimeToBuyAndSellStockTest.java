package com.martinez.leetcode.editor.en;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

  @Test
  void case1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int expected = 5;
    int actual = new BestTimeToBuyAndSellStock().maxProfit(prices);
    assertEquals(expected, actual);
  }

  @Test
  void case2() {
    int[] prices = {7, 6, 4, 3, 1};
    int expected = 0;
    int actual = new BestTimeToBuyAndSellStock().maxProfit(prices);
    assertEquals(expected, actual);
  }

}