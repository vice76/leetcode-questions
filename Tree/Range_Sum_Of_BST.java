
import java.util.*;
import java.io.*;

class Solution {
	//CREATE YOUR MAIN FUNCTION 
	private int sum=0;
    public int helper(TreeNode root, int low, int high){
        if(root==null)
            return 0;
        if(root.val >=low && root.val<=high)
        {
            sum+=root.val;
        } 
        helper(root.left,low,high);
        helper(root.right,low,high);
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root,low,high);
    }
}