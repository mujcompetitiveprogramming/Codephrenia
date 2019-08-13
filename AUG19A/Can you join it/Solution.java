import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[])throws IOException {
		IO io = new IO();
		StringBuilder out = new StringBuilder("");
		
		int t = io.ni();
    char[] a, b;
    char x;
    int res;
    int prefixLen, suffixLen, subLen, maxSubLenA, maxSubLenB;
		
		while(t-->0) {
		   a = io.n().toCharArray();
       b = io.n().toCharArray();
       x = io.n().charAt(0);

       /*
        We can split A anywhere we want. Hence, we need to insert B where
        we get maximum consecutive character-chain of X in A.
        Now, we get 2 options, have start of B connected with chain in A,
        or end of B connected with chain in A. 
        We can simply compare whichever gives the greater answer.

        However, there is an edge case. There is a possibility that there is a
        chain in B that is a substring, and is not a prefix/suffix of B,
        that is also greater than the chain in A.
        We calculate this length separately and compare to find the greatest answer.
       */
       
       maxSubLenA = maxSubLen(a, x);
       maxSubLenB = maxSubLen(b, x);

       prefixLen = 0;
       for(int i=0;i<b.length && b[i]==x;i++) 
         prefixLen++;
       
       suffixLen = 0;
       for(int i=b.length-1;i>=0 && b[i]==x;i--)
          suffixLen++;

       res = (int)Math.max(prefixLen, suffixLen) + maxSubLenA;
       res = (int)Math.max(res, maxSubLenB);

       out = out.append(res+"\n");
		}

    System.out.print(out);		
	}

  // returns maximum length substring in a[] that contains only X
  static int maxSubLen(char[] a, char x) {
      
      int subLen = 0;
      int maxSubLen = 0;
      for(int i=0;i<a.length;i++) {
        if(a[i] == x) {
          subLen++;
        } else {
          maxSubLen = (int)Math.max(subLen, maxSubLen);
          subLen = 0;
        }
      }

      maxSubLen = (int)Math.max(subLen, maxSubLen);
      return maxSubLen;
  }
}

// Input-Output Tempalte
class IO {
	private BufferedReader br;
	private StringTokenizer st;

	String n()throws IOException {
    if(br == null) 
      br = new BufferedReader(new InputStreamReader(System.in));
    if(st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	int ni()throws IOException { return Integer.parseInt(n()); }
	double nd()throws IOException { return Double.parseDouble(n()); }
	long nl()throws IOException { return Long.parseLong(n()); }

	int[] nia(int n)throws IOException { 
		int[] a = new int[n];
		for(int i=0;i<n;i++) a[i] = ni();
		return a;
	}

	long[] nla(int n)throws IOException {
		long[] a = new long[n];
		for(int i=0;i<n;i++) a[i] = nl();
		return a;
	}

	double[] nda(int n)throws IOException {
		double[] a = new double[n];
		for(int i=0;i<n;i++) a[i] = nd();
		return a;
	}

	String[] nsa(int n)throws IOException {
    String[] arr = new String[n];
    for(int i=0;i<n;i++)
      arr[i] = n();
    
    return arr;
  }
}