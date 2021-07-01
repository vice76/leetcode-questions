
import java.util.*;
import java.io.*;

class Solution {
	//CREATE YOUR MAIN FUNCTION 
	public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode nwroot=new TreeNode(root.val);
        nwroot.right=invertTree(root.left);
        nwroot.left=invertTree(root.right);
        return nwroot;
    }
}