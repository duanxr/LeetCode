package com.duanxr.yith.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Duanran 2019/1/31 0031
 */
public class FindAllAnagramsInAString {

  /**
   * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
   *
   * Strings consists of lowercase English letters only and the length of both strings s and p will
   * not be larger than 20,100.
   *
   * The order of output does not matter.
   *
   * Example 1:
   *
   * Input:
   *
   * s: "cbaebabacd" p: "abc"
   *
   * Output:
   *
   * [0, 6]
   *
   * Explanation:
   *
   * The substring with start index = 0 is "cba", which is an anagram of "abc".
   *
   * The substring with start index = 6 is "bac", which is an anagram of "abc".
   *
   * Example 2:
   *
   * Input:
   *
   * s: "abab" p: "ab"
   *
   * Output:
   *
   * [0, 1, 2]
   *
   * Explanation:
   *
   * The substring with start index = 0 is "ab", which is an anagram of "ab".
   *
   * The substring with start index = 1 is "ba", which is an anagram of "ab".
   *
   * The substring with start index = 2 is "ab", which is an anagram of "ab".
   *
   * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
   *
   * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
   *
   * 说明：
   *
   * 字母异位词指字母相同，但排列不同的字符串。
   *
   * 不考虑答案输出的顺序。
   *
   * 示例 1:
   *
   * 输入:
   *
   * s: "cbaebabacd" p: "abc"
   *
   * 输出:
   *
   * [0, 6]
   *
   * 解释:
   *
   * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
   *
   * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
   *
   * 示例 2:
   *
   * 输入:
   *
   * s: "abab" p: "ab"
   *
   * 输出:
   *
   * [0, 1, 2]
   *
   * 解释: 起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
   *
   * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
   *
   * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
   */
  class Solution {

    public List<Integer> findAnagrams(String s, String p) {
      int length = p.length();
      int[] pcount = new int[26];
      for (char c : p.toCharArray()) {
        pcount[c - 'a']++;
      }
      List<Integer> result = new ArrayList<>();
      char[] chars = s.toCharArray();
      int[] scount = new int[26];
      int left = 0;
      for (int i = 0; i < chars.length; i++) {
        if (i - left < length) {
          scount[chars[i] - 'a']++;
        } else {
          scount[chars[left++] - 'a']--;
          scount[chars[i] - 'a']++;
        }
        if (Arrays.equals(scount, pcount)) {
          result.add(left);
        }
      }
      return result;
    }
  }
}
