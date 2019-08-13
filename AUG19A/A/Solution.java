import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[])throws IOException {
		IO io = new IO();
		StringBuilder out = new StringBuilder("");
		
		int t = io.ni();
		
		while(t-->0) {
		  int a = io.ni(), b = io.ni(), c = io.ni();
       
       /*
        Using triangle property:
          sum of any 2 sides of triangle will be greater than the third side
       */
    		boolean f1 = a+b>c,
    		        f2 = b+c>a,
    		        f3 = c+a>b;
    		String res = f1&&f2&&f3 ? "YES":"NO";
    
    		System.out.println(res);  
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
