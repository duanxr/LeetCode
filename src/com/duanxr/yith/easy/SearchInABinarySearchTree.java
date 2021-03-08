package com.duanxr.yith.easy;

import com.duanxr.yith.define.treeNode.TreeNode;

/**
 * @author 段然 2021/3/8
 */
public class SearchInABinarySearchTree {

  /**
   * You are given the root of a binary search tree (BST) and an integer val.
   *
   * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
   *
   *  
   *
   * Example 1:
   *
   *
   * Input: root = [4,2,7,1,3], val = 2
   * Output: [2,1,3]
   * Example 2:
   *
   *
   * Input: root = [4,2,7,1,3], val = 5
   * Output: []
   *  
   *
   * Constraints:
   *
   * The number of nodes in the tree is in the range [1, 5000].
   * 1 <= Node.val <= 107
   * root is a binary search tree.
   * 1 <= val <= 107
   *
   * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
   *
   * 例如，
   *
   * 给定二叉搜索树:
   *
   *         4
   *        / \
   *       2   7
   *      / \
   *     1   3
   *
   * 和值: 2
   * 你应该返回如下子树:
   *
   *       2
   *      / \
   *     1   3
   * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
   *
   */
  class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
      if (root == null) {
        return null;
      } else if (root.val == val) {
        return root;
      } else if (root.val > val) {
        return searchBST(root.left, val);
      } else {
        return searchBST(root.right, val);
      }

    }
  }
}
