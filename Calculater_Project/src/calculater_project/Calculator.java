package calculater_project;

import java.util.Scanner;

public class Calculator {
	// instance variable
	double num1;
	double num2;
	double num3;
	
	char opration;
	boolean validOpration=true;
	double result=0;
	boolean running=true;
	
	
	public void calculater(){ // method
		
		Scanner scanner = new Scanner(System.in); // scanner class
		
		System.out.println("For exit Choce Oprater as '0'");
		System.out.println("Enter First Number: ");
		num1=scanner.nextDouble(); // select the number
		
		System.out.println("Select opration : [+ , - , * , / , ^ ]:");
		
		
		//       scanner . next() -- string thats y we ad char at method and call 0 index char single
		opration=scanner.next().charAt(0); // select the operation
		if(opration=='0') {System.exit(0);} // if user want to exit 
		
		System.out.println("Enter Second Number");
		num2=scanner.nextDouble(); // select number 2
		
		switch(opration) { // switch case for multiple operation
		
		case '+' ->result=num1+num2; // addition
		case '-' ->result=num1-num2;// Subtraction
		case '*' -> result=num1*num2;// multiplication
		case '^' -> result=Math.pow(num1, num2); // power of number 3^3=3*3*3=27
		case '/' ->{ // division
			if(num2==0) {// if user try to divide number1 to number of 0 // Arithmetic exception will be ocher 
				System.out.println("Can't divide by 0!"); // get massage to user 
				validOpration=false; // don't get result
			}
			else {
				result=num1/num2; // else division
			}
		}
		
		default -> {System.out.println("Enter Valid oprater!"); // for default case 
			validOpration=false; // don't print result 
			}
		}
		
		if(validOpration==true) {System.out.println("Result: "+result); // if validPration is true then print result
		}
		while(running==true) { // while loop for continue operation with result
		System.out.println("Select opration : [+ , - , * , / , ^ ]:");
		
		opration = scanner.next().charAt(0);// get operator for operation with result 
		
		System.out.println("Enter Next number");
		num3=scanner.nextDouble(); // number3 for next operation
		
switch(opration) { // same process
		
		case '+' ->result=result+num3;
		case '-' ->result=result-num3;
		case '*' -> result=result*num3;
		case '^' -> result=Math.pow(result, num3);
		case '/' ->{
			if(num2==0) {
				System.out.println("Can't divide by 0!");
				validOpration=false;
				running=false;
			}
			else {
				result=num1/num2;
			}
		}
		
		default -> {System.out.println("Enter Valid oprater!");
			validOpration=false;
			running=false;}
		}
		
		
if(validOpration==true) {System.out.println("Result: "+result);}
		
		}
		
		
	}
	}


