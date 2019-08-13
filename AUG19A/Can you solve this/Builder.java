import java.util.*;
import java.io.*;

class Builder {
  public static void main(String[] args)throws IOException {
    IO io = new IO();
    StringBuilder out = new StringBuilder("");
    
    int t = 5;
    out = out.append(t+"\n");
    
    while(t-->0) {
        int n = randInt(1, 1000000000);
        out = out.append(n+"\n");
    }
    
    System.out.print(out);

  }
  public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
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