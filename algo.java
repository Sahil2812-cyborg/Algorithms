
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class algo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int count=0;
		    while(x%3!=0 || y%3!=0){
		        x = Math.abs(x-y);
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
