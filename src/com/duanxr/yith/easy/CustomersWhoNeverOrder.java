package com.duanxr.yith.easy;

/**
 * @author 段然 2021/3/8
 */
public class CustomersWhoNeverOrder {

  /**
   * Suppose that a website contains two tables, the Customers table and the Orders table. Write a SQL query to find all customers who never order anything.
   *
   * Table: Customers.
   *
   * +----+-------+
   * | Id | Name  |
   * +----+-------+
   * | 1  | Joe   |
   * | 2  | Henry |
   * | 3  | Sam   |
   * | 4  | Max   |
   * +----+-------+
   * Table: Orders.
   *
   * +----+------------+
   * | Id | CustomerId |
   * +----+------------+
   * | 1  | 3          |
   * | 2  | 1          |
   * +----+------------+
   * Using the above tables as example, return the following:
   *
   * +-----------+
   * | Customers |
   * +-----------+
   * | Henry     |
   * | Max       |
   * +-----------+
   *
   * 某网站包含两个表，Customers 表和 Orders 表。编写一个 SQL 查询，找出所有从不订购任何东西的客户。
   *
   * Customers 表：
   *
   * +----+-------+
   * | Id | Name  |
   * +----+-------+
   * | 1  | Joe   |
   * | 2  | Henry |
   * | 3  | Sam   |
   * | 4  | Max   |
   * +----+-------+
   * Orders 表：
   *
   * +----+------------+
   * | Id | CustomerId |
   * +----+------------+
   * | 1  | 3          |
   * | 2  | 1          |
   * +----+------------+
   * 例如给定上述表格，你的查询应返回：
   *
   * +-----------+
   * | Customers |
   * +-----------+
   * | Henry     |
   * | Max       |
   * +-----------+
   *
   */
  private String solution = "SELECT Customers.name AS Customers \n"
      + "FROM Customers LEFT JOIN Orders ON Customers.Id = Orders.CustomerId \n"
      + "WHERE Orders.CustomerId  IS NULL";
}
