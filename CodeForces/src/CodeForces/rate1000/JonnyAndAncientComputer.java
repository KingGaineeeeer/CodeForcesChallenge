// package CodeForces.rate1000;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// /**
//  * rate:1000 URL:http://codeforces.com/problemset/problem/1362/A
//  * 
//  * 
//  */
package CodeForces.rate1000;
import java.util.*;
 
public class JonnyAndAncientComputer
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
 
		while(t-->0)
		{
			long a=s.nextLong();
			long b=s.nextLong();
 
			long c=Math.max(a,b);
			long d=Math.min(a,b);
			long count=0;
 
			while(d<c)
			{
				d=d<<1;
				count++;
			}
 
			if(d==c)
			{
				long val=0;
				val+=count/3;
				count%=3;
				val+=count/2;
				count%=2;
				val+=count;
				System.out.println(val);
			}
			else System.out.println(-1);
			
		}
	}
}



// public class JonnyAndAncientComputer {
//     public static void main(String[] args) {
//         try {
//             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//             // get the number of test cases.
//             int n = Integer.parseInt(reader.readLine());

//             for (int i = 0; i < n; i++) {
//                 String[] nums = reader.readLine().split(" ");
//                 Long a = Long.parseLong(nums[0]);
//                 Long b = Long.parseLong(nums[1]);
//                 // String[] numbers = reader.readLine().split(" ");
//                 if (a < b) {
//                     System.out.println(bitShift(a, b));
//                 } else if (a > b) {
//                     System.out.println(bitShift(b, a));
//                 } else {
//                     System.out.println(0);
//                 }
//             }

//         } catch (NumberFormatException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//     }

//     public static int bitShift(long min, long max) {
//         //int operation = 1;
//         long ret = min;
//         int count = 0;
//         while (ret < max) {

//             ret = ret << 1;

//             count++;
//             // if (count % 3 == 0) {
//             //     operation = count / 3 ;
//             // }
//             if (ret == max) {
//                 return count / 3 + 1;
//             }

//         }
//         return -1;
//     }

// }
