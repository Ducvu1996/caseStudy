package controllers;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Models.Cabinet;
import Models.Customer;
import Models.Employee;
import Models.House;
import Models.Room;
import Models.Villa;

public class MainController {
 
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
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
				case 3:
					AddController.addNewCustomer();
					break;
				case 4: 
					ShowController.showInformationCustomer();
					break;
				case 5:
					addNewBooking();
					break;
				case 6:
					Map<String,Employee> map=ShowController.showEmployee();
					for (Map.Entry<String, Employee> entry : map.entrySet()) {
				            System.out.println(entry.getKey() + " " + entry.getValue());
				    }
					break;
				case 7:
					ShowController.showQueueCinema();
					break;
				case 8:
					Cabinet.findFileOfEmployee();
					break;
				case 9: 
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
	
	private static void addNewBooking() {
		
		List<Customer> listCustomer=ShowController.showInformationCustomer();
		
		
		System.out.println("choose a customer to booking:");
		int choose= scanner.nextInt();
		Customer customer =listCustomer.get(choose-1);
		
		System.out.println("1.	Booking Villa\r\n" + 
				"2.	Booking House\r\n" + 
				"3.	Booking Room\r\n"  
				);
		int choice; 
		System.out.println("input a choice");
		choice= scanner.nextInt();
		switch(choice) {
			case 1: 
				BookingController.bookingVilla(customer);
				break;
			case 2:
				BookingController.bookingHouse(customer);
				break;
			case 3:
				BookingController.bookingRoom(customer);
				break;
			 default:
	            System.out.println("invalid! please choose action in below menu:");
	            break;
	        
		}
//		
	}

	public static void displayMainMenu() {
		System.out.println("1.	 Add New Services\r\n" + 
				"2.	Show Services\r\n" + 
				"3.	Add New Customer\r\n" + 
				"4.	Show Information of Customer\r\n" + 
				"5.	Add New Booking\r\n" + 
				"6.	Show Information of Employee\r\n" + 
				"7.	Show Queue Customer| Cinema \r\n"+
				"8.	Find file employee\r\n"+
				"9.	Exit\r\n" + 
				"======================================");
	}
	private static void showServies() throws ArrayIndexOutOfBoundsException{
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
				List<Villa> villaList= ShowController.showAllVilla();
				 int numericalOrder=1;
			        for(Villa villa_print: villaList) {
			        	System.out.println(numericalOrder+":"+villa_print.showInfor());
			        	numericalOrder++;
			        }
				break;
			case 2:
				List<House> houseList=ShowController.showAllHouse();
				 numericalOrder=1;
			        for(House house_print: houseList) {
			        	System.out.println(numericalOrder+":"+house_print.showInfor());
			        	numericalOrder++;
			        }
				break;
			case 3:
				List<Room> roomList=ShowController.showAllRoom();
				numericalOrder=1;
			    for(Room room_print: roomList) {
			        	System.out.println(numericalOrder+":"+room_print.showInfor());
			        	numericalOrder++;
			        }
				
				break;
			case 4:
				ShowController.showAllNameVilla();
				break;
			case 5:
				ShowController.showAllNameHouse();
				break;
			case 6:
				ShowController.showAllNameRoom();
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
