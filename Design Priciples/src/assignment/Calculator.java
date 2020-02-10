package assignment;
import java.util.Scanner;

abstract class Operation
{
	int input1;
	int input2;
	abstract void calculate();
}
class Addition extends Operation
{
	Addition(int input1,int input2)
	{
		this.input1=input1;
		this.input2=input2;
	}
	@Override
	void calculate()
	{
		System.out.println("Addition of given numbers is "+(input1+input2));
	}
}
class Subtraction extends Operation
{
	Subtraction(int input1,int input2)
	{
		this.input1=input1;
		this.input2=input2;
	}
	
	@Override
	void calculate()
	{
		System.out.println("Subtraction of given numbers is "+(input1-input2));
	}
}
class Multiplication extends Operation
{
	Multiplication(int input1,int input2)
	{
		this.input1=input1;
		this.input2=input2;
	}
	
	@Override
	void calculate()
	{
		System.out.println("Multiplication of given numbers is "+(input1*input2));
	}
}
class Division extends Operation
{
	Division(int input1,int input2)
	{
		this.input1=input1;
		this.input2=input2;
	}
	
	@Override
	void calculate()
	{
		System.out.println("Division of given numbers is "+(input1/input2));
	}
}

class Conversion
{
	Operation check(String sd,int input1,int input2)
	{
		Operation o;
		if(sd.equalsIgnoreCase("Addition"))
		{
			o=new Addition(input1,input2);
		}
		else if(sd.equalsIgnoreCase("subtraction"))
		{
			o=new Subtraction(input1,input2);
		}
		else if(sd.equalsIgnoreCase("multiplication"))
		{
			o=new Multiplication(input1,input2);
		}
		else if(sd.equalsIgnoreCase("Division"))
		{
			o=new Division(input1,input2);
		}
		else
		{
			o=null;
			System.out.println("INVALID INPUT");
			
		}	
		return o;
	}
}


public class Calculator {

	public static void main(String[] args) {
		try
		{
		int input1,input2;
		Scanner s=new Scanner(System.in);
		String sd;
		//Taking Input from console
		System.out.println("Enter first number");
		input1=s.nextInt();
		System.out.println("Enter second number");
		input2=s.nextInt();
		System.out.println("Enter the operation name");
		sd=s.next()+s.nextLine();
		Operation o;
		Conversion c =new Conversion();
		//conversion of name in to class name
		o=c.check(sd,input1,input2);
		//calculating the result based on desired operation
		o.calculate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
