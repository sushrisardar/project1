package assignment1;

import java.util.Scanner;
class elec_bill
{
	public static void main (String args[])
	{
		Scanner S = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int unit= S.nextInt();
        double x;
        double charge;
        if(unit<=100)
        {
           charge = 1.20;
        }
        else if (unit>=100 && unit<=300) 
        {
           charge = 2;
        } 
        else 
        {
           charge = 3;
        }
        x = (double) (charge*unit);
        System.out.println("The electricity bill is : "+x);
	}
}

