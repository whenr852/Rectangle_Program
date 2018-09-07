//Billy Henry
//Date: 9/6/2018
//Rectangle.java
//Asks user for height/width and calculates perimeter/area/length of diagonal

import java.util.Scanner;

public class Rectangle {

	
	public static void main(String[] args) 
	{
	Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the height of a rectangle: ");
		double Height = userInput.nextDouble();
		
		System.out.println("Enter the width of a rectangle: ");
		double Width = userInput.nextDouble();
		
		double Perimeter = (2*Height) + (2*Width);
		double Area = Height*Width;
		double Diagonal = Math.sqrt((Height*Height)+(Width*Width)); 
		
		System.out.println("The perimeter of the rectangle is: " + Perimeter);
		System.out.println("The area of the rectangle is: " + Area);
		System.out.println("The length of the diagonal is: " + Diagonal);
		
		userInput.close();
	}
	
}
