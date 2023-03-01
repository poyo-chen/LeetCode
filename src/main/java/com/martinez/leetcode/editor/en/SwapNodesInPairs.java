package com.martinez.leetcode.editor.en;


/**
 * LeetCode 24. Medium Linked List
 */
public class SwapNodesInPairs {

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.swapPairs(new ListNode(0));
  }

  /**
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode()
   * {} ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
   * this.next = next; } }
   */
  static class Solution {

    public ListNode swapPairs(ListNode head) {
//      先檢查頭節點，及下個節點不為空(因遞迴需使用頭節點及下個節點)
      if (head == null || head.next == null) {
        return head;
      }
//      使用快慢指針，倆倆pair交換位置
      ListNode slow = head;
      ListNode fast = head.next;
//      fast的下個節點為下一組pair的slow，反覆指向最後一組
//      當指向最後一組時會回傳null，依序反轉整個鏈
//      將slow指向前一組fast，後一組fast指向slow 完成反轉
      slow.next = swapPairs(fast.next);
      fast.next = slow;
//      回傳fast，繼續下一組pair
      return fast;
    }
  }

  static class Solution2 {

    public ListNode swapPairs(ListNode head) {
//TODO
      return null;
    }
  }

  static class ListNode {

    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

  }
}
