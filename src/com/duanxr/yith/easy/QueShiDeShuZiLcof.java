package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/11
 */
public class QueShiDeShuZiLcof {

  /**
   * English description is not available for the problem.
   *
   * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
   *
   *  
   *
   * 示例 1:
   *
   * 输入: [0,1,3]
   * 输出: 2
   * 示例 2:
   *
   * 输入: [0,1,2,3,4,5,6,7,9]
   * 输出: 8
   *  
   *
   * 限制：
   *
   * 1 <= 数组长度 <= 10000
   *
   */
  class Solution {

    public int missingNumber(int[] nums) {
      int n = nums.length;
      int count = 0;
      for (int num : nums) {
        count += num;
      }
      int sum = 0;
      if (n % 2 == 0) {
        sum = (n + 1) * n / 2;
      } else {
        sum = n * (n - 1) / 2 + n;
      }
      return sum - count;
    }
  }
}
