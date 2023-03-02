package com.martinez.leetcode.editor.en;

/**
 * LeetCode 141. Easy Linked List
 */
public class LinkedListCycle {

  public class Solution {

    public boolean hasCycle(ListNode head) {
      if (head == null) {
        return false;
      }
      ListNode slow = head;
      ListNode fast = head.next;

      while (fast != null && fast.next != null) {
        if (fast == slow) {
          return true;
        }
        slow = slow.next;
        fast = fast.next.next;
      }
      return false;
    }
  }

  class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
