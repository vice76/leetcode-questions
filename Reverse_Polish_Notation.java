
import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) {
		{
			String s[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
			System.out.println(evalRPN(s));
		}
		
    public int evalRPN(String[] tokens) {
            Stack<Integer> st = new Stack<Integer>();
            String ops="+-/*";
			for(int i=0;i<tokens.length;i++)
			{
				if(ops.contains(tokens[i]))
				{
					int n1=st.pop();
					int n2=st.pop();
					if(tokens[i].equals("+"))
						st.push(n1+n2);
					else if(tokens[i].equals("-"))
						st.push(n2-n1);
					else if(tokens[i].equals("*"))
						st.push(n1*n2);
					if(tokens[i].equals("/"))
						st.push((int)(n2/n1));
				}
				else
				{
                    int f;
                    StringBuffer sb = new StringBuffer(tokens[i]);
                    try {
                        f= Integer.parseInt(sb.toString());
                        }catch(Exception e) {
                        sb.delete(0, sb.length());
                        sb.append("0");
                        int result = Integer.parseInt(sb.toString());
                        f=result;
                        }
					    st.push(f);
				}
			}
        return st.pop();
    }
}