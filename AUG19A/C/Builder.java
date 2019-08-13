import java.util.*;
import java.io.*;

class Builder {
  public static void main(String[] args)throws IOException {
    IO io = new IO();
    StringBuilder out = new StringBuilder("");
    char[] alpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    
    int t = 100;
    out = out.append(t+"\n");
    
    while(t-->0) {
        int aLen = randInt(1000, 10000);
        int bLen = randInt(1000, 10000);
        char K = alpha[randInt(13, 13)];
        for(int i = 0;i<aLen;i++) {
          char x = alpha[randInt(13,13)];
          out = out.append(x);
        }
        out = out.append("\n");

        for(int i = 0;i<aLen;i++) {
          char x = alpha[randInt(13, 13)];
          out = out.append(x);
        }
        out = out.append("\n");
        out = out.append(K+"\n");
    }
    
    System.out.print(out);

  }
  public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
  }
  public static char randChar(int min, int max) {
    return (char)(97 + randInt(min, max));
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