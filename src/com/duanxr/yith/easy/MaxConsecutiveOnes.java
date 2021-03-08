package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class MaxConsecutiveOnes {

  /**
   * Given a binary array, find the maximum number of consecutive 1s in this array.
   *
   * Example 1:
   * Input: [1,1,0,1,1,1]
   * Output: 3
   * Explanation: The first two digits or the last three digits are consecutive 1s.
   *     The maximum number of consecutive 1s is 3.
   * Note:
   *
   * The input array will only contain 0 and 1.
   * The length of input array is a positive integer and will not exceed 10,000
   *
   * 给定一个二进制数组， 计算其中最大连续 1 的个数。
   *
   *  
   *
   * 示例：
   *
   * 输入：[1,1,0,1,1,1]
   * 输出：3
   * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
   *  
   *
   * 提示：
   *
   * 输入的数组只包含 0 和 1 。
   * 输入数组的长度是正整数，且不超过 10,000。
   *
   */
  class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
      int max = 0;
      int count = 0;
      for (int n : nums) {
        if (n == 1) {
          max = Math.max(max, ++count);
        } else {
          count = 0;
        }
      }
      return max;
    }
  }
}
