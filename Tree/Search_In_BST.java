
import java.util.*;
import java.io.*;

class Solution {
	//CREATE YOUR MAIN FUNCTION 
	public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        else if(root.val == val)
            return root;
        else if(root.val > val)
            return searchBST(root.left,val);
        else 
            return searchBST(root.right,val);
    }
}