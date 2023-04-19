package assignment1;


import java.util.Scanner;
public class Group 
{
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the roll number : ");
		int roll=S.nextInt();
		if(roll%2==0)
		{
			if(roll%4==0)
				System.out.println("Emerald Group");
			else
				System.out.println("Perl Group");
		}
		else 
		{
			if(roll==3 || roll%4==3 )
				System.out.println("Ruby Group");
			else if(roll==1 || roll%4==1)
				System.out.println("Sapphire Group");
		}
	}
}