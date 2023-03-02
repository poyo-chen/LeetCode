package com.martinez.leetcode.editor.en;

/**
 * LeetCode 328. Medium Linked List
 */
public class OddEvenLinkedList {

  public static void main(String[] args) {

  }

  static class Solution {

    public ListNode oddEvenList(ListNode head) {
      // 1. 檢查節點不為空
      if (head == null) {
        return null;
      }
      // 2. 宣告基數節點指針、偶數節點指針、偶數鏈表頭節點
      ListNode odd = head;
      ListNode even = head.next;
      ListNode evenHead = head.next;

      // 因even走得較快，且走兩隔，故須確認 even and even.next != null
      while (even != null && even.next != null) {
        // 3. 將 odd.next 指向下一個基數節點
        odd.next = odd.next.next;
        // 4. 將 even.next 指向下一個偶數數節點
        even.next = even.next.next;

        // 5. 移動指針，odd.next 已經指向下一個基數節點，故不用指向 odd.next.next;
        odd = odd.next;
        // 6. 偶數節點亦同
        even = even.next;

      }

      // 7. 串接基偶數鏈表
      odd.next = evenHead;

      return head;
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
