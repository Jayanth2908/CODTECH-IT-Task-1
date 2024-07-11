import java.util.Scanner;
public class Task1
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First number:");
		double a=scanner.nextDouble();
		System.out.println("Enter the Second number:");
		double b=scanner.nextDouble();
		System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
		
		
		System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
		
		double result=0;
		
		switch(choice){
			case 1:
			result=a+b;
			System.out.println("The Addition of"+a+"and"+b+"is:"+result);
			break;
			case 2:
			result=a-b;
			System.out.println("The Subtraction of"+a+"and"+b+"is:"+result);
			break;
			case 3:
			result=a*b;
			System.out.println("The Multiplication of"+a+"and"+b+"is:"+result);
			break;
			case 4:
			if(b!=0){
			result=a/b;
			System.out.println("The Division of"+a+"and"+b+"is:"+result);
			}
			else{
				System.out.println("Error!The Denominator should not be zero");
			}
			break;
			default:
			System.out.println("Invalid Choice!");
		}
	}
}

			