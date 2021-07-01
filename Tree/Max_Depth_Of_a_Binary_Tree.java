
import java.util.*;
import java.io.*;

class Solution {
	//CREATE YOUR MAIN FUNCTION 
	public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int mx=1+maxDepth(root.left);
        int mi=1+maxDepth(root.right);
        int ans=Math.max(mx,mi);
        
    }
}