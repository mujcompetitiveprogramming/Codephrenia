import java.util.*;
import java.io.*;

class Builder {
  public static void main(String[] args)throws IOException {
    IO io = new IO();
    StringBuilder out = new StringBuilder("");
    
    int n = randInt(1000, 2000);
    int m = randInt(1000, 2000);

    int[] p = new int[26];
    for(int i=0;i<26;i++) p[i] = randInt(1000, 100000);

    String x = randString(n);
    String y = randString(m);

    out = out.append(n+" "+m+"\n");
    for(int w : p) out = out.append(w+" ");
    out = out.append("\n"+x+"\n"+y+"\n");
    
    System.out.print(out);

  }

  public static String randString(int len) {
    String str = "";
    for(int i=0;i<len;i++)
      str += randChar();
    return str;
  }

  public static char randChar() {
    return (char)('a' + randInt(0,25));
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