package com.duanxr.yith.middle;

/**
 * @author 段然 2021/3/8
 */
public class SumOfSquareNumbers {

  /**
   *
   * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
   *
   *  
   *
   * Example 1:
   *
   * Input: c = 5
   * Output: true
   * Explanation: 1 * 1 + 2 * 2 = 5
   * Example 2:
   *
   * Input: c = 3
   * Output: false
   * Example 3:
   *
   * Input: c = 4
   * Output: true
   * Example 4:
   *
   * Input: c = 2
   * Output: true
   * Example 5:
   *
   * Input: c = 1
   * Output: true
   *  
   *
   * Constraints:
   *
   * 0 <= c <= 231 - 1
   *
   *
   * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
   *
   *  
   *
   * 示例 1：
   *
   * 输入：c = 5
   * 输出：true
   * 解释：1 * 1 + 2 * 2 = 5
   * 示例 2：
   *
   * 输入：c = 3
   * 输出：false
   * 示例 3：
   *
   * 输入：c = 4
   * 输出：true
   * 示例 4：
   *
   * 输入：c = 2
   * 输出：true
   * 示例 5：
   *
   * 输入：c = 1
   * 输出：true
   *  
   *
   * 提示：
   *
   * 0 <= c <= 231 - 1
   *
   */

  class Solution {

    public boolean judgeSquareSum(int c) {
      for (int i = 0; i <= Math.floor(Math.sqrt(c)); i++) {
        int n = c - (i * i);
        double square = Math.sqrt(n);
        if (Math.floor(square) == square)
        {
          return true;
        }
      }
      return false;
    }
  }
}
