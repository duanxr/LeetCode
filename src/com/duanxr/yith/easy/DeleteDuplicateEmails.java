package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class DeleteDuplicateEmails {

  /**
   * Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.
   *
   * +----+------------------+
   * | Id | Email            |
   * +----+------------------+
   * | 1  | john@example.com |
   * | 2  | bob@example.com  |
   * | 3  | john@example.com |
   * +----+------------------+
   * Id is the primary key column for this table.
   * For example, after running your query, the above Person table should have the following rows:
   *
   * +----+------------------+
   * | Id | Email            |
   * +----+------------------+
   * | 1  | john@example.com |
   * | 2  | bob@example.com  |
   * +----+------------------+
   * Note:
   *
   * Your output is the whole Person table after executing your sql. Use delete statement.
   *
   * 编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。
   *
   * +----+------------------+
   * | Id | Email            |
   * +----+------------------+
   * | 1  | john@example.com |
   * | 2  | bob@example.com  |
   * | 3  | john@example.com |
   * +----+------------------+
   * Id 是这个表的主键。
   * 例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:
   *
   * +----+------------------+
   * | Id | Email            |
   * +----+------------------+
   * | 1  | john@example.com |
   * | 2  | bob@example.com  |
   * +----+------------------+
   *  
   *
   * 提示：
   *
   * 执行 SQL 之后，输出是整个 Person 表。
   * 使用 delete 语句。
   *
   */
  private String solution = "DELETE P1 FROM Person P1,Person P2 WHERE P1.Email = P2.Email AND P1.Id > P2.Id";
}
