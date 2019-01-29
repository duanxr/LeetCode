package com.duanxr.leetcode.easy;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Duanran 2019/1/29 0029
 */
public class ValidParentheses {

  /**
   * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
   * input string is valid.
   *
   * An input string is valid if:
   *
   * Open brackets must be closed by the same type of brackets.
   *
   * Open brackets must be closed in the correct order.
   *
   * Note that an empty string is also considered valid.
   *
   * Example 1:
   *
   * Input: "()"
   *
   * Output: true
   *
   * Example 2:
   *
   * Input: "()[]{}"
   *
   * Output: true
   *
   * Example 3:
   *
   * Input: "(]"
   *
   * Output: false
   *
   * Example 4:
   *
   * Input: "([)]"
   *
   * Output: false
   *
   * Example 5:
   *
   * Input: "{[]}"
   *
   * Output: true
   *
   * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
   *
   * 有效字符串需满足：
   *
   * 左括号必须用相同类型的右括号闭合。
   *
   * 左括号必须以正确的顺序闭合。
   *
   * 注意空字符串可被认为是有效字符串。
   *
   * 示例 1:
   *
   * 输入: "()"
   *
   * 输出: true
   *
   * 示例 2:
   *
   * 输入: "()[]{}"
   *
   * 输出: true
   *
   * 示例 3:
   *
   * 输入: "(]"
   *
   * 输出: false
   *
   * 示例 4:
   *
   * 输入: "([)]"
   *
   * 输出: false
   *
   * 示例 5:
   *
   * 输入: "{[]}"
   *
   * 输出: true
   */
  class Solution {

    public boolean isValid(String s) {
      LinkedList<Character> stack = new LinkedList<>();
      for (char c : s.toCharArray()) {
        if (isLeft(c)) {
          stack.push(c);
        } else {
          if (stack.isEmpty() || stack.pop() != getLeft(c)) {
            return false;
          }
        }
      }
      return stack.isEmpty();
    }

    private boolean isLeft(char c) {
      switch (c) {
        case '(':
          return true;
        case '{':
          return true;
        case '[':
          return true;
        default:
          return false;
      }
    }

    private char getLeft(char c) {
      switch (c) {
        case ')':
          return '(';
        case '}':
          return '{';
        case ']':
          return '[';
        default:
          return ' ';
      }
    }

  }
}
