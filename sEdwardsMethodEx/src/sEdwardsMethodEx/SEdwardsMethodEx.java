/**
 * 
 */
package sEdwardsMethodEx;
import java.util.Scanner;


/**
 * @author edthe
 *
 */
public class SEdwardsMethodEx {

	public static void addCalc(int num1, int num2)
	{
		int total;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second numner: ");
		num2 = input.nextInt();
		
		total = num1 + num2;
		
		System.out.println(total);
	}
	
	public static void subCalc(int num1, int num2)
	{
		int total;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = input.nextInt();
		
		total = num1 - num2;
		
		System.out.println(total);
		
	}
	
	public static void mulCalc(int num1, int num2)
	{
    int total;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	num1 = input.nextInt();
	
	System.out.println("Enter the second number: ");
	num2 = input.nextInt();
	
	total = num1 * num2;
	
	System.out.println(total);
	
	}
	
	public static void divCalc(int num1, int num2)
	{
		int total;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = input.nextInt();
		
		total = num1 / num2;
		
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int num1 = 0;
		    int num2 = 0;
			String answer;
			Scanner input = new Scanner(System.in);
			System.out.println("What calculation is being preformed? Add, Subtract, Multiply, or Divide?");
			answer = input.next();
			switch(answer) {
			case"A":
				addCalc(num1, num2);
				break;
			case"S":
				subCalc(num1, num2);
				break;
			case"M":
				mulCalc(num1, num2);
				break;
			case"D":
			    divCalc(num1, num2);
			    break;
			case"X":
				break;
				default:
					System.out.print("error");
			}
			}
		
		}
		




