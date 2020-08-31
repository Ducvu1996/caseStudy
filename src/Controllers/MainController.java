package controllers;

import java.util.Scanner;

public class MainController {
 
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		boolean exit = false;
		displayMainMenu();
		while(true) {
			System.out.println("input a choice");
			choice= scanner.nextInt();
			switch(choice) {
				case 1:
					addNewServies(); 
					break;
				case 2:
					showServies();
					break;
				case 7: 
					System.out.println("exited!");
					exit = true;
	                break;
				 default:
		                System.out.println("invalid! please choose action in below menu:");
		                break;
		            }
		         if (exit) {
		              break;
		          }
		        displayMainMenu();  
			}
		
	}
	
	public static void displayMainMenu() {
		System.out.println("1.	 Add New Services\r\n" + 
				"2.	Show Services\r\n" + 
				"3.	Add New Customer\r\n" + 
				"4.	Show Information of Customer\r\n" + 
				"5.	Add New Booking\r\n" + 
				"6.	Show Information of Employee\r\n" + 
				"7.	Exit\r\n" + 
				"======================================");
	}
	private static void showServies() {
		System.out.println("1.	Show all Villa\r\n" + 
				"2.	Show all House\r\n" + 
				"3.	Show all Room\r\n" + 
				"4.	Show All Name Villa Not Duplicate\r\n" + 
				"5.	Show All Name House Not Duplicate\r\n" + 
				"6.	Show All Name Name Not Duplicate\r\n" + 
				"7.	Back to menu\r\n" + 
				"8.	Exit\r\n" + 
				"");
		int choice; 
		System.out.println("input a choice");
		choice= scanner.nextInt();
		switch(choice) {
			case 1: 
				ShowController.showAllVilla();
				break;
			case 2:
				ShowController.showAllHouse();
				break;
			case 3:
				ShowController.showAllRoom();
				break;
			case 4:
				break;
			case 8:
				System.out.println("exited!");
                break;
			 default:
	            System.out.println("invalid! please choose action in below menu:");
	            break;
	        
		}

		
	}
	private static void addNewServies() {
		System.out.println("1.	Add New Villa\r\n" + 
				"2.	Add New House\r\n" + 
				"3.	Add New Room\r\n" + 
				"4.	Back to menu\r\n" + 
				"5.	Exit\r\n" + 
				"==================================");
		
		int choice; 
		choice= scanner.nextInt();
		switch(choice) {
			case 1: 
				AddController.addNewVilla();
				break;
			case 2:
				AddController.addNewHouse();
				break;
			case 3:
				AddController.addNewRoom();
				break;
			case 4:
			case 5:
				System.out.println("exited!");
                break;
			 default:
	            System.out.println("invalid! please choose action in below menu:");
	            break;
	        
		}
	}
	
}
