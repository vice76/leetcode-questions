
import java.util.*;
import java.io.*;

class Solution {
	//CREATE YOUR MAIN FUNCTION 
	public int helper(TreeNode root,int mx){
        if(root==null)
            return 0;
        mx=Math.max(root.val,mx);
        return (mx<=root.val?1:0) + helper(root.left,mx)+helper(root.right,mx);
    }
    public int goodNodes(TreeNode root) {
        int mx=Integer.MIN_VALUE;
        return helper(root ,mx);
    }
}