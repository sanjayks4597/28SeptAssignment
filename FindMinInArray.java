package problems;

import java.util.Scanner;

public class FindMinInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your 5 values for array:");
		int val[] =new int[5];
		min(val,sc);
	}
	public static void min(int []val,Scanner sc)
	{
		
		 
		 for(int i=0;i<val.length;i++)
		 {
			 
			 val [i]=sc.nextInt();
		 }
		 int min=Integer.MAX_VALUE;
		 for(int i=0;i<val.length;i++)
		 {
			 if(val[i]<min)
			 {
				 min=val[i];
			 }
		 }
		 System.out.println("minum value is:"+min);
	}
	

}
