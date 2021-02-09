package housePainting;

import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int costPersqft = 0;
		int length = 40;
		int width = 15;
		int height = 25;
		int numOfWindows = 10;
		int lengthOfWindows = 4;
		int widthOfWindow = 2;
		int numOfDoors = 2;
		int lengthOfDoor = 6;
		int widthOfDoor = 3;
		double surfaceArea = 2684;
		double totalEstimateCost = 13420;
				
	    System.out.println("Please enter the cost per square foot: ");
		costPersqft = in.nextInt();
		System.out.println("Please enter the length of the house: ");
		length = in.nextInt();
		System.out.println("Please enter the width of the house: ");
		width = in.nextInt();
		System.out.println("Please enter the height of the house: ");
		height = in.nextInt();
		System.out.println("Please enter the number of windows: ");
		numOfWindows = in.nextInt();
		System.out.println("Please enter the length of a window: ");
		lengthOfWindows = in.nextInt();
		System.out.println("Please enter the width of a window: ");
		widthOfWindow = in.nextInt();
		System.out.println("Please enter the number of doors: ");
		numOfDoors = in.nextInt();
		System.out.println("Please enter the length of a door: ");
		lengthOfDoor = in.nextInt();
		System.out.println("Please enter the width of a door: ");
		widthOfDoor = in.nextInt();
		
		System.out.println("Total surface area is " + (length + height+ width + numOfWindows + lengthOfWindows + widthOfWindow + numOfDoors + lengthOfDoor + widthOfDoor)); 
		
		System.out.println("Total cost is " + (surfaceArea*costPersqft));
		
	}

}
