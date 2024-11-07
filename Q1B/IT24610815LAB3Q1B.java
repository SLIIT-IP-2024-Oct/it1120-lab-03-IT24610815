import java.util.Scanner;
public class IT24610815LAB3Q1B{
	public static void main(String [] args){
	Scanner Input = new Scanner(System.in);
	System.out.print("Enter the price of 1Kg of rice:");
	double price = Input.nextDouble();
	System.out.print("Enter the number of kilograms you want to buy:");
	double nofkilo = Input.nextDouble();
	double TotalAmount = price*nofkilo;
	double discount = TotalAmount*10/100;
	TotalAmount = TotalAmount-discount;
	System.out.println("The Total amount is:"+TotalAmount);
	}
}