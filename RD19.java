/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int tst=0;tst<t;tst++)
		{
			int n = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			a[i] = in.nextInt();
			Arrays.sort(a);
			int m = 0;
			for(int i=2;i<=a[0];i++){
				if(a[0]%i==0&&a[1]%i==0)
				m=i;
			}
			
			if(m==0) System.out.println(0);
			if(m!=0){
				if(a[0]==1) System.out.println(n-1);
				if(a[0]!=1) System.out.println(-1);
			}
		}
	}
} 
