package problems;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter your 10 values for array:");
		 int val[] =new int[10];
		 
		 for(int i=0;i<val.length;i++)
		 {
			 
			 val [i]=sc.nextInt();
		 }
		 int max=Integer.MIN_VALUE;
		 for(int i=0;i<val.length;i++)
		 {
			 if(val[i]>max)
			 {
				 max=val[i];
			 }
		 }
		 System.out.println("maximum value is:"+max);
	}

}
