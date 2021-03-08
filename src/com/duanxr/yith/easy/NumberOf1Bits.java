package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class NumberOf1Bits {

  /**
   * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
   *
   * Note:
   *
   * Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
   * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
   *  
   *
   * Example 1:
   *
   * Input: n = 00000000000000000000000000001011
   * Output: 3
   * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
   * Example 2:
   *
   * Input: n = 00000000000000000000000010000000
   * Output: 1
   * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
   * Example 3:
   *
   * Input: n = 11111111111111111111111111111101
   * Output: 31
   * Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
   *  
   *
   * Constraints:
   *
   * The input must be a binary string of length 32.
   *  
   *
   * Follow up: If this function is called many times, how would you optimize it?
   *
   * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
   *
   *  
   *
   * 提示：
   *
   * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
   * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
   *  
   *
   * 进阶：
   *
   * 如果多次调用这个函数，你将如何优化你的算法？
   *  
   *
   * 示例 1：
   *
   * 输入：00000000000000000000000000001011
   * 输出：3
   * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
   * 示例 2：
   *
   * 输入：00000000000000000000000010000000
   * 输出：1
   * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
   * 示例 3：
   *
   * 输入：11111111111111111111111111111101
   * 输出：31
   * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
   *  
   *
   * 提示：
   *
   * 输入必须是长度为 32 的 二进制串 。
   *
   */
  class Solution {
    public int hammingWeight(int n) {
      /*int r = 0;
      while (n>0)
      {
        if(n%2==1)
        {
          r++;
        }
        n=n>>1;
      }
      return r;*/
      int r = 0;
      for(char c : Integer.toBinaryString(n).toCharArray())
      {
        if(c=='1')
        {
          r++;
        }
      }
      return r;
    }
  }
}
