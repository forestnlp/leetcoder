package com.leetcode.tree.q94;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.tree.TreeNode;


public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> travels = new ArrayList<Integer>();
    	helper(root,travels);
    	return travels;
    }
    
    public void helper(TreeNode root,List<Integer> travels) {
    	if(root==null) return;
    	helper(root.left,travels);
    	travels.add(root.val);
    	helper(root.right,travels);
    }
}
