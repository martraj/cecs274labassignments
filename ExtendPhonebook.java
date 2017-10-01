package lab_assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class ExtendPhonebook {

	/**
	 * creates a copy of an old phone book but includes additional storage
	 * @param oldPhonebook - an array of strings holding the contacts
	 * @param additional - the number of additional contacts that will be added
	 * */
	public static String[] extendPhonebook(String[] oldPhonebook, int additional){
		
		String[] tempContacts = Arrays.copyOf(oldPhonebook, oldPhonebook.length+additional); 
		oldPhonebook = tempContacts;
		return oldPhonebook;
		
	}
	
	
	
	//pass-by-value: pass a copy of the original data stored in the variable (JAVA)
	//pass-by-reference: pass the original data
	
	/**
	 * prints the phone book
	 * @param contacts - an array of strings holding the contacts
	 * */
	public static void printPhonebook(String[] contacts){
		System.out.println("-------------------PHONEBOOK-----------------------");
		int i =1;
		for(String contact : contacts){ //This is an enhanced for-loop, where at each iteration an array entry 
			//is given the handle 'contact'. Used ONLY for access
			System.out.printf("%d. %s\n", i, contact);
			i++;
		}
		System.out.println("\n");
	}
	
	/**
	 * removes a contact from the phone book
	 * @param contacts - an array of strings
	 * @param removeIdx - an int holding the index of the contact to be removed
	 * @return 
	 * */


	public static void main(String[] args){
		// --------- INTRO
		System.out.print("Welcome to your phonebook.  How many contacts would you like to store? ");
		Scanner in = new Scanner(System.in);
		int numContacts = Integer.parseInt(in.nextLine().trim());
		
		//INITIAL DATA STORAGE
		String[] contacts = new String[numContacts];
		for(int i = 0; i < numContacts; i++){
			System.out.print("Enter a name & number: "); //Asking for contact input
			contacts[i] = in.nextLine().trim(); //Storing input into the i-th location of the array
		}
		
		// VERIFICATION OF INPUT
		System.out.println("These are the contacts you stored.");
		printPhonebook(contacts);
		
		// MENU OPTIONS
		String menu = "1. Add more contacts.\n2. Delete a contact.\n3. Print the phonebook.\n4. Exit the program.\n";
		int selection;

		do{
			
			System.out.print("Select an item from the following options: \n" + menu);
			selection = Integer.parseInt(in.nextLine().trim());
			
			if(selection == 1){
				//Add more contacts
				System.out.print("Enter the number of additional contacts: ");
				int addtl = Integer.parseInt(in.nextLine().trim());
				contacts = extendPhonebook(contacts, addtl);
				
				for(int i = numContacts; i<contacts.length; i++){
					//add the new contacts
					System.out.print("Enter name & number: ");
					contacts[i] = in.nextLine().trim(); //storing new contacts
					numContacts++; //update the number of contacts
				}
			}
			else if(selection == 2){
				//Delete a contact
				
			}
			else if(selection == 3){
				//Print the phone book
				printPhonebook(contacts);
			}
			else if(selection < 1 || selection > 4){
				System.out.print("Invalid selection.  Please try again.");
				selection = Integer.parseInt(in.nextLine().trim());
			}
			
		}while(selection != 4);
		
	}

}
