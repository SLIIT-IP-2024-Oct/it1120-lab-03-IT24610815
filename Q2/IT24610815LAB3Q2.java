import java.util.Scanner;
public class IT24610815LAB3Q2{
	public static void main(String [] args){
	Scanner Input = new Scanner(System.in);
	System.out.print("Enter the monthly salary: ");
	double Msalary = Input.nextDouble();
	System.out.print("Enter the number of hours: ");
	int hours = Input.nextInt();
	System.out.print("Enter the OT hourly rate: ");
	int hourlyrate = Input.nextInt();
	int OT_Amount = hours*hourlyrate;
	double TotalSalary = Msalary + OT_Amount;
	System.out.print("The Total salary including OT is: "+ TotalSalary);
	}
}