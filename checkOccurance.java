package problems;

import java.util.Scanner;

public class checkOccurance {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 
	 int val[] =new int[5];
	 for(int i=0;i<val.length;i++)
	 {
		 System.out.println("Enter your "+i+1+"value");
		 val [i]=sc.nextInt();
	 }
	 
	 System.out.println("Enter your value which you want to search for:");
	 
	 int check=sc.nextInt();
	 boolean flag=false;
	 for(int i=0;i<val.length;i++)
	 {
		
		 if(val[i]==check)
		 {
			 flag=true;
			 break;
		 }
		 
	 }
	 if(flag==true)
	 {
		 System.out.println("value is present ");
	 }
	 else
	 {
		 System.out.println("value is not present ");
	 }
}
}
