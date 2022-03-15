import java.util.Scanner;
public class MainClass 
{	
	public static void main(String[] args)
	{
		//Step 1 & step 2
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your sentence");	
		String name = s.nextLine();
		
		System.out.println("Enter Length");
		int length = s.nextInt();
		
		System.out.println("Enter Width");
		int width = s.nextInt();
		
		
		//step 5
		LogicClass_Backend lcb = new LogicClass_Backend(name);
		LogicClass_Backend l = new LogicClass_Backend(length, width);
		
		//step7
		System.out.println("UpperCase: "+ lcb.to_Upper());
		System.out.println("Lower case: " + lcb.to_Lower());
		System.out.println("Area: " + l.Area());
		System.out.println("Perimeter: " + l.Perimeter());
		System.out.println("Hi, this is Brandon");
		
	}

}
