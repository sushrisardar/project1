package assignment1;


import java.util.Scanner;

public class Passenger 
{
	public static void main(String args[])
	{ 
		int p=0,total_pass=0;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the row.:");
		int row = S.nextInt();
		for(int i=1;i<=row;i++)
		{
			System.out.println("Enter the total passenger in row" + i +":");
			p=S.nextInt();
			total_pass +=p;
		}
		System.out.println("Total number of rows is : " + row);
		System.out.println("Total number of Passengers is " + total_pass);
	}
}
