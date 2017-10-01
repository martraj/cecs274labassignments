package lab_assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuestList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//get initial party info
		System.out.print("Let's get this party started! Enter the date of your event: ");
		String date = in.nextLine().trim();
		
		System.out.print("Good. Now, what would you like to call your event? ");
		String event = in.nextLine().trim();
		
		System.out.print("What is the maximum number of guest allowed? ");
		int maxGuests = Integer.parseInt(in.nextLine().trim());
		
		System.out.println("Thank you.  Please enter the name of each guest followed by ENTER.  When you are done, enter DONE.");
		
		ArrayList<String> names = new ArrayList<String>(); //stores guest names
		
		boolean isDone = false;
		//do-while keeps running to get guest names until user enters "DONE"
		do{
			System.out.print("Guest name: ");
			String name = in.nextLine().trim();
			if(name.equals("DONE")){
				isDone = true;
			}
			else{
				names.add(name);
			}
		}while(!isDone);
		
		//print out information
		System.out.printf("This is the information on your %s event...", event);
		System.out.printf("\nDate: %s\nMaximum Num. of Guests: %s", date, maxGuests);
		System.out.printf("\nCurrent Num. of Guests: %d", names.size());
		System.out.println("\nCurrent Guests: ");
		//print out all names on separate lines
		for(int i=0; i<names.size(); i++){
			System.out.println(names.get(i));
		}
		
		System.out.println("Have a fun party!");
	}

}
