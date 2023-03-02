package com.martinez.leetcode.editor.en;


import java.util.List;

/**
 * LeetCode 24. Medium Linked List
 */
public class SwapNodesInPairs {

  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.swapPairs(new ListNode(0));
  }

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

      // 1. 設定一個虛擬頭節點
      ListNode listNode = new ListNode(-1);

      // 2. 將頭節點串接在後面
      listNode.next = head;

      // 4. 設置一個指針節點，控制鏈表作業的節點
      ListNode prevNode = listNode;

      // 5. 迴圈依序整理head鏈表
      while (head != null && head.next != null) {

        // 6. 紀錄需反轉的兩個節點
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        // 7. 交換節點
        prevNode.next = secondNode;
        firstNode.next = secondNode.next;
        secondNode.next = firstNode;

        // 8. 切換指針節點
        prevNode = firstNode;
        head = firstNode.next;
      }

      // 3. 回傳虛擬頭節點後的鏈表
      return listNode.next;
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
