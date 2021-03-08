package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class AddDigits {

  /**
   * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
   *
   * Example:
   *
   * Input: 38
   * Output: 2
   * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
   *              Since 2 has only one digit, return it.
   * Follow up:
   * Could you do it without any loop/recursion in O(1) runtime?
   *
   * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
   *
   * 示例:
   *
   * 输入: 38
   * 输出: 2
   * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
   * 进阶:
   * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
   *
   */
  class Solution {

    public int addDigits(int num) {
      if (num == 0) {
        return 0;
      }
      int n = num % 9;
      if (n == 0) {
        return 9;
      }
      return n;
    }
  }
}
