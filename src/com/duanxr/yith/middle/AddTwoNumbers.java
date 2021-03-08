package com.duanxr.yith.middle;

import com.duanxr.yith.define.listNode.ListNode;

/**
 * @author 段然 2021/3/8
 */
public class AddTwoNumbers {

  /**
   * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
   *
   * 请你将两个数相加，并以相同形式返回一个表示和的链表。
   *
   * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
   *
   *  
   *
   * 示例 1：
   *
   *
   * 输入：l1 = [2,4,3], l2 = [5,6,4]
   * 输出：[7,0,8]
   * 解释：342 + 465 = 807.
   * 示例 2：
   *
   * 输入：l1 = [0], l2 = [0]
   * 输出：[0]
   * 示例 3：
   *
   * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
   * 输出：[8,9,9,9,0,0,0,1]
   *  
   *
   * 提示：
   *
   * 每个链表中的节点数在范围 [1, 100] 内
   * 0 <= Node.val <= 9
   * 题目数据保证列表表示的数字不含前导零
   *
   *
   *
   * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
   *
   * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
   *
   *  
   *
   * Example 1:
   *
   *
   * Input: l1 = [2,4,3], l2 = [5,6,4]
   * Output: [7,0,8]
   * Explanation: 342 + 465 = 807.
   * Example 2:
   *
   * Input: l1 = [0], l2 = [0]
   * Output: [0]
   * Example 3:
   *
   * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
   * Output: [8,9,9,9,0,0,0,1]
   *  
   *
   * Constraints:
   *
   * The number of nodes in each linked list is in the range [1, 100].
   * 0 <= Node.val <= 9
   * It is guaranteed that the list represents a number that does not have leading zeros.
   *
   */
  class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      return add(l1, l2, false);
    }

    public ListNode add(ListNode l1, ListNode l2, boolean in) {
      if (l1 == null) {
        return add(l2, in);
      }
      if (l2 == null) {
        return add(l1, in);
      }
      ListNode l3;
      ListNode next;
      int sum = l1.val + l2.val;
      if (in) {
        sum++;
      }
      if (sum >= 10) {
        l3 = new ListNode(sum - 10);
        in = true;
      } else {
        l3 = new ListNode(sum);
        in = false;
      }
      next = add(l1.next, l2.next, in);

      l3.next = next;
      return l3;
    }

    public ListNode add(ListNode l1, boolean in) {
      if (l1 == null) {
        if (in) {
          return new ListNode(1);
        }
        return null;
      }
      ListNode l3;
      ListNode next;
      int sum = l1.val;
      if (in) {
        sum++;
      }
      if (sum >= 10) {
        l3 = new ListNode(sum - 10);
        in = true;
      } else {
        l3 = new ListNode(sum);
        in = false;
      }
      next = add(l1.next, in);
      l3.next = next;
      return l3;
    }
  }
}
