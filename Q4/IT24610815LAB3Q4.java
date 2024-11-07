import java.util.Scanner;
public class IT24610815LAB3Q4{
	public static void main(String [] args){
	Scanner Input = new Scanner(System.in);
	System.out.print("Enter a five-digit number: ");
	int number = Input.nextInt();
	if (number <10000 || number>99999){
		System.out.println("Enter Correct Number");
	}else{
	int digit1 = number/10000;
	int digit2 = (number % 10000)/1000;
	int digit3 = (number % 1000)/100;
	int digit4 = (number % 100)/10;
	int digit5 = number % 10;
	System.out.print(digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5);
	}
	}
}