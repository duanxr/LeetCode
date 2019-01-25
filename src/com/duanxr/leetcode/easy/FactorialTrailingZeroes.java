package com.duanxr.leetcode.easy;

/**
 * @author Duanran 2019/1/25 0025
 */
public class FactorialTrailingZeroes {

  /**
   * Given an integer n, return the number of trailing zeroes in n!.
   *
   * Example 1:
   *
   * Input: 3
   *
   * Output: 0
   *
   * Explanation: 3! = 6, no trailing zero.
   *
   * Example 2:
   *
   * Input: 5
   *
   * Output: 1
   *
   * Explanation: 5! = 120, one trailing zero.
   *
   * Note: Your solution should be in logarithmic time complexity.
   *
   * 给定一个整数 n，返回 n! 结果尾数中零的数量。
   *
   * 示例 1:
   *
   * 输入: 3
   *
   * 输出: 0
   *
   * 解释: 3! = 6, 尾数中没有零。
   *
   * 示例 2:
   *
   * 输入: 5
   *
   * 输出: 1
   *
   * 解释: 5! = 120, 尾数中有 1 个零.
   *
   * 说明: 你算法的时间复杂度应为 O(log n) 。
   */
  class Solution {

    public int trailingZeroes(int n) {
      int result = 0;
      while (n != 0) {
        n = n / 5;
        result += n;
      }
      return result;
    }
  }
}
