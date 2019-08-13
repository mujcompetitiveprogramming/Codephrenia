import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String args[])throws IOException {
		IO io = new IO();
		StringBuilder out = new StringBuilder("");
		
		int t = io.ni();
		
		while(t-->0) {
		    int n = io.ni();
        long l = 1, r = 3;
        long m;

        /*
          The pattern goes like this:
          Cycle1  Cycle2 Cycle3
          ABC     AABBCC AAABBBCCC ...
          We see that after 1 complete cycle, the length of each sub-segment increases by 1, ie,
          in every cycle, A's frequency was 1, then 2 and so on.
          Similarly for all other characters.
          Now, it is clear that every cycle-length is a multiple of 3.

          So the indexe of each cycle will go like this:
          [1,3], [4, 9], ...
          [last_cycle_end+1, last_cycle_end + (3* (last_cycle_length+1)) ]

          We just need to find a cycle where our index lies.
          After finding that cycle, we divide by 3 and check in which sub-range 
          of cycle will we find our required N exactly.
        */

        // find cycle
        while(!(l<=n && n<=r)) {
          m = (r-l+1)/3;
          m = m*2*3;
          l = r + 1;
          r = l + m - 1;
        }

        // find target sub-range to identify the person
        m = (r-l+1)/3;
        long p1 = l + m -1;
        long p2 = l + m*2 - 1;
        
        String res = "";
        if(n<=p1) res = "Akash";
        else if(n<=p2) res = "Shikhar";
        else res = "Kalpaj";
        out = out.append(res+"\n");
		}		
    System.out.print(out);
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