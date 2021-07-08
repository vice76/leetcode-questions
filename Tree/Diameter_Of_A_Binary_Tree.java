
import java.util.*;
import java.io.*;

	//CREATE YOUR MAIN FUNCTION 
	class Solution {
    static class pair{
    int x;
    int y;
    public pair(int a,int b){
      x=a;
      y=b;
    }
    }
    public pair helper(TreeNode root)
    {
        if(root == null)
        {
            pair p=new pair(0,0);
            return p;
        }
        pair leftans=helper(root.left);
        pair rightans=helper(root.right);
        int h=1+Math.max(leftans.x,rightans.x);
        int d=Math.max(leftans.x+rightans.x,Math.max(leftans.y,rightans.y));
        
        pair p=new pair(h,d);
        return p;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        pair p;
        p=helper(root);
        return p.y;
    }
}