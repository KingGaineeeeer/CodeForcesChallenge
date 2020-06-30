package CodeForces.rate1100;
import java.io.*;
import java.util.*;

// GiveUpしたので下記は正解を掲載

public class KingAnton {

	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
 
	static boolean solve() throws Exception {
		int n = sc.nextInt(), a[] = new int[n], b[] = new int[n];
		TreeSet<Integer> st = new TreeSet<>();
 
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
 

		/** 
		 * trueになる条件：a[i]とb[i]が等しくなること
		 * falseになる条件: a[i]>b[i]のとき、a[0~i]の中に-1があるかどうか。なければfalse
		 * 
		 * */ 

		for (int i = 0; i < n; i++) {
			if (a[i] > b[i] && !st.contains(-1))
				return false;
			if (a[i] < b[i] && !st.contains(1))
				return false;
			st.add(a[i]);
		}
 
		return true;
	}
 
	public static void main(String[] args) throws Exception {
		int tc = sc.nextInt();
		while (tc-- > 0) {
			out.println(solve() ? "YES" : "NO");
		}
		out.close();
	}
}
 
class Scanner {
	StringTokenizer st;
	BufferedReader br;
 
	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}
 
	public Scanner(String file) throws Exception {
		br = new BufferedReader(new FileReader(file));
	}
 
	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
 
	public String nextLine() throws IOException {
		return br.readLine();
	}
 
	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}
 
	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}
 
	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}
}
