package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class MonotonicArray {

  /**
   * An array is monotonic if it is either monotone increasing or monotone decreasing.
   *
   * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
   *
   * Return true if and only if the given array A is monotonic.
   *
   *  
   *
   * Example 1:
   *
   * Input: [1,2,2,3]
   * Output: true
   * Example 2:
   *
   * Input: [6,5,4,4]
   * Output: true
   * Example 3:
   *
   * Input: [1,3,2]
   * Output: false
   * Example 4:
   *
   * Input: [1,2,4,5]
   * Output: true
   * Example 5:
   *
   * Input: [1,1,1]
   * Output: true
   *  
   *
   * Note:
   *
   * 1 <= A.length <= 50000
   * -100000 <= A[i] <= 100000
   *
   * 如果数组是单调递增或单调递减的，那么它是单调的。
   *
   * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
   *
   * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
   *
   *  
   *
   * 示例 1：
   *
   * 输入：[1,2,2,3]
   * 输出：true
   * 示例 2：
   *
   * 输入：[6,5,4,4]
   * 输出：true
   * 示例 3：
   *
   * 输入：[1,3,2]
   * 输出：false
   * 示例 4：
   *
   * 输入：[1,2,4,5]
   * 输出：true
   * 示例 5：
   *
   * 输入：[1,1,1]
   * 输出：true
   *  
   *
   * 提示：
   *
   * 1 <= A.length <= 50000
   * -100000 <= A[i] <= 100000
   *
   */
  class Solution {

    public boolean isMonotonic(int[] A) {
      if (A.length <= 1) {
        return true;
      }
      boolean up = true;
      boolean down = true;
      int holder = A[0];
      for (int i : A) {
        if (holder > i) {
          up = false;
        }
        if (holder < i) {
          down = false;
        }
        if (!up && !down) {
          return false;
        }
        holder = i;
      }
      return true;
    }
  }
}
