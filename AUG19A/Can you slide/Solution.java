import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[])throws IOException {
		IO io = new IO();
		StringBuilder out = new StringBuilder("");
		
		int t = io.ni();
		
		while(t-->0) {
		    int n = io.ni(), k = io.ni();
		    int[] a = io.nia(n);

        /*
          The idea is to create a window of length k
          and keep finding sum of all possible k-length windows
          by moving this window to the right,
          by removing the first element and adding the next element in the window.
        */
   
        /*
          First, find the sum of first k consecutive numbers
          Store this sum as maximum value
        */
		    long max = 0;
		    for(int i=0;i<k;i++) max += a[i];
        
        /*
          Next, find the sum of next window(k length window)
          by removing the first element in current window
          and adding the next element in current window

          The answer is the maximum of these window-sums
        */
		    long sum = max;
		    for(int rm=0, add=k;add<n;add++, rm++) {
		        sum = sum - a[rm] + a[add];
		        max = (long)Math.max(sum, max);
		    }
		    
		    System.out.println(max);
		}		
	}
}

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
