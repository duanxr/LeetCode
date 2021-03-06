package com.duanxr.yith.easy;

/**
 * @author Duanran 2019/3/4 0004
 */
public class CanPlaceFlowers {

  /**
   * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
   * However, flowers cannot be planted in adjacent plots - they would compete for water and both
   * would die.
   *
   * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means
   * not empty), and a number n, return if n new flowers can be planted in it without violating the
   * no-adjacent-flowers rule.
   *
   * Example 1:
   *
   * Input: flowerbed = [1,0,0,0,1], n = 1
   *
   * Output: True
   *
   * Example 2:
   *
   * Input: flowerbed = [1,0,0,0,1], n = 2
   *
   * Output: False
   *
   * Note:
   *
   * The input array won't violate no-adjacent-flowers rule.
   *
   * The input array size is in the range of [1, 20000].
   *
   * n is a non-negative integer which won't exceed the input array size.
   *
   * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
   *
   * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
   *
   * 示例 1:
   *
   * 输入: flowerbed = [1,0,0,0,1], n = 1
   *
   * 输出: True
   *
   * 示例 2:
   *
   * 输入: flowerbed = [1,0,0,0,1], n = 2
   *
   * 输出: False
   *
   * 注意:
   *
   * 数组内已种好的花不会违反种植规则。
   *
   * 输入的数组长度范围为 [1, 20000]。
   *
   * n 是非负整数，且不会超过输入数组的大小。
   */
  class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      for (int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 0 && (i - 1 < 0 || flowerbed[i - 1] == 0) && (i + 1 >= flowerbed.length
            || flowerbed[i + 1] == 0)) {
          flowerbed[i] = 1;
          n--;
          i++;
        }
      }
      return n <= 0;
    }
  }
}
