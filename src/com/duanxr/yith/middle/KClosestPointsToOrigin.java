package com.duanxr.yith.middle;

import java.util.PriorityQueue;

/**
 * @author 段然 2021/3/8
 */
public class KClosestPointsToOrigin {

  /**
   * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
   *
   * The distance between two points on the X-Y plane is the Euclidean distance (i.e, √(x1 - x2)2 + (y1 - y2)2).
   *
   * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
   *
   *  
   *
   * Example 1:
   *
   *
   * Input: points = [[1,3],[-2,2]], k = 1
   * Output: [[-2,2]]
   * Explanation:
   * The distance between (1, 3) and the origin is sqrt(10).
   * The distance between (-2, 2) and the origin is sqrt(8).
   * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
   * We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
   * Example 2:
   *
   * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
   * Output: [[3,3],[-2,4]]
   * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
   *  
   *
   * Constraints:
   *
   * 1 <= k <= points.length <= 104
   * -104 < xi, yi < 104
   *
   * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
   *
   * （这里，平面上两点之间的距离是欧几里德距离。）
   *
   * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
   *
   *  
   *
   * 示例 1：
   *
   * 输入：points = [[1,3],[-2,2]], K = 1
   * 输出：[[-2,2]]
   * 解释：
   * (1, 3) 和原点之间的距离为 sqrt(10)，
   * (-2, 2) 和原点之间的距离为 sqrt(8)，
   * 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
   * 我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
   * 示例 2：
   *
   * 输入：points = [[3,3],[5,-1],[-2,4]], K = 2
   * 输出：[[3,3],[-2,4]]
   * （答案 [[-2,4],[3,3]] 也会被接受。）
   *  
   *
   * 提示：
   *
   * 1 <= K <= points.length <= 10000
   * -10000 < points[i][0] < 10000
   * -10000 < points[i][1] < 10000
   *
   */
  class Solution {

    public int[][] kClosest(int[][] points, int K) {
      int[][] result = new int[K][2];
      PriorityQueue<PointClass> priorityQueue = new PriorityQueue<>();

      for (int[] point : points) {
        priorityQueue.add(new PointClass(point));
      }

      for (int i = 0; i < K; i++) {
        result[i] = priorityQueue.poll().getPoint();
      }
      return result;
    }

    public class PointClass implements Comparable<PointClass> {

      private int[] point;

      PointClass(int[] point) {
        this.point = point;
      }

      public int getDistancePow() {
        int x = point[0];
        int y = point[1];
        return x * x + y * y;
      }

      public int[] getPoint() {
        return point;
      }

      @Override
      public int compareTo(PointClass o) {
        return this.getDistancePow() - o.getDistancePow();
      }
    }
  }
}
