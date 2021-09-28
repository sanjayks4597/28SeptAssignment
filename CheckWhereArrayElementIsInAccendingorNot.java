package problems;

import java.util.Scanner;

public class CheckWhereArrayElementIsInAccendingorNot {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your 5 values for array:");
			int val[] =new int[5];
			for(int i=0;i<val.length;i++)
			{
				val[i]=sc.nextInt();
			}
			boolean flag=check(val);
			if(flag==true)
			{
				System.out.print(flag);
			}
			else {
				System.out.print(flag);
			}
		}
		public static boolean check(int val[])
		{
			boolean flag=false;
			 for(int i=0;i<val.length-1;i++)
			 {
				 if(val[i]<val[i+1])
				 {
					 flag=true;
				 }
				 else {
					 flag=false;
					 break;
				 }
			 }
			
			return flag;
		}
	

}
