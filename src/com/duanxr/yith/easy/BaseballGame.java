package com.duanxr.yith.easy;

import java.util.LinkedList;

/**
 * @author 段然 2021/3/8
 */
public class BaseballGame {

  /**
   * You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
   *
   * At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
   *
   * An integer x - Record a new score of x.
   * "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
   * "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
   * "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
   * Return the sum of all the scores on the record.
   *
   *  
   *
   * Example 1:
   *
   * Input: ops = ["5","2","C","D","+"]
   * Output: 30
   * Explanation:
   * "5" - Add 5 to the record, record is now [5].
   * "2" - Add 2 to the record, record is now [5, 2].
   * "C" - Invalidate and remove the previous score, record is now [5].
   * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
   * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
   * The total sum is 5 + 10 + 15 = 30.
   * Example 2:
   *
   * Input: ops = ["5","-2","4","C","D","9","+","+"]
   * Output: 27
   * Explanation:
   * "5" - Add 5 to the record, record is now [5].
   * "-2" - Add -2 to the record, record is now [5, -2].
   * "4" - Add 4 to the record, record is now [5, -2, 4].
   * "C" - Invalidate and remove the previous score, record is now [5, -2].
   * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
   * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
   * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
   * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
   * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
   * Example 3:
   *
   * Input: ops = ["1"]
   * Output: 1
   *  
   *
   * Constraints:
   *
   * 1 <= ops.length <= 1000
   * ops[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
   * For operation "+", there will always be at least two previous scores on the record.
   * For operations "C" and "D", there will always be at least one previous score on the record.
   *
   * 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
   *
   * 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：
   *
   * 整数 x - 表示本回合新获得分数 x
   * "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
   * "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
   * "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
   * 请你返回记录中所有得分的总和。
   *
   *  
   *
   * 示例 1：
   *
   * 输入：ops = ["5","2","C","D","+"]
   * 输出：30
   * 解释：
   * "5" - 记录加 5 ，记录现在是 [5]
   * "2" - 记录加 2 ，记录现在是 [5, 2]
   * "C" - 使前一次得分的记录无效并将其移除，记录现在是 [5].
   * "D" - 记录加 2 * 5 = 10 ，记录现在是 [5, 10].
   * "+" - 记录加 5 + 10 = 15 ，记录现在是 [5, 10, 15].
   * 所有得分的总和 5 + 10 + 15 = 30
   * 示例 2：
   *
   * 输入：ops = ["5","-2","4","C","D","9","+","+"]
   * 输出：27
   * 解释：
   * "5" - 记录加 5 ，记录现在是 [5]
   * "-2" - 记录加 -2 ，记录现在是 [5, -2]
   * "4" - 记录加 4 ，记录现在是 [5, -2, 4]
   * "C" - 使前一次得分的记录无效并将其移除，记录现在是 [5, -2]
   * "D" - 记录加 2 * -2 = -4 ，记录现在是 [5, -2, -4]
   * "9" - 记录加 9 ，记录现在是 [5, -2, -4, 9]
   * "+" - 记录加 -4 + 9 = 5 ，记录现在是 [5, -2, -4, 9, 5]
   * "+" - 记录加 9 + 5 = 14 ，记录现在是 [5, -2, -4, 9, 5, 14]
   * 所有得分的总和 5 + -2 + -4 + 9 + 5 + 14 = 27
   * 示例 3：
   *
   * 输入：ops = ["1"]
   * 输出：1
   *  
   *
   * 提示：
   *
   * 1 <= ops.length <= 1000
   * ops[i] 为 "C"、"D"、"+"，或者一个表示整数的字符串。整数范围是 [-3 * 104, 3 * 104]
   * 对于 "+" 操作，题目数据保证记录此操作时前面总是存在两个有效的分数
   * 对于 "C" 和 "D" 操作，题目数据保证记录此操作时前面总是存在一个有效的分数
   *
   */
  class Solution {
    public int calPoints(String[] ops) {
      LinkedList<Integer> stack = new LinkedList<>();
      for (String op : ops) {
        if ("+".equals(op)) {
          int s = 0;
          int c = 0;
          boolean f = false;
          if (!stack.isEmpty()) {
            s=stack.pop();
            c=s;
            f=true;
          }
          if (!stack.isEmpty()) {
            c+=stack.peek();
          }if(f) {
            stack.push(s);
          }
          stack.push(c);
        } else if ("D".equals(op)) {
          if (!stack.isEmpty()) {
            stack.push(stack.peek() * 2);
          }
        } else if ("C".equals(op)) {
          stack.pop();
        } else {
          stack.push(Integer.valueOf(op));
        }
      }
      int r = 0;
      while (!stack.isEmpty())
      {
        r+=stack.pop();
      }
      return r;
    }
  }
}
