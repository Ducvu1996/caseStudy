package Controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Models.Room;

public class MainController {
    public static final String COMMA = ",";
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choice;
		boolean exit = false;
		displayMainMenu();
		while(true) {
			choice= scanner.nextInt();
			switch(choice) {
				case 1:
					addNewServies(); 
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
				addNewVilla();
				break;
			case 2:
				addNewHouse();
			case 3:
				
				addNewRoom();
				break;
			case 4:
		
		}
		 scanner.skip("\\R");
	
	}
	private static void addNewRoom() {
		 scanner.skip("\\R");
		System.out.println("input name servives:");
		String nameServices = scanner.nextLine();
		
		System.out.println("input id:");
		String id = scanner.nextLine();
		System.out.println("input used area:");
		Double usedArea = scanner.nextDouble();
		System.out.println("input rent cost:");
		Double rentCost = scanner.nextDouble();
		System.out.println("input number of people:");
		int numberOfPeople = scanner.nextInt();
		System.out.println("input type of rent:");
		 scanner.skip("\\R");
		String typeOfRent = scanner.nextLine();
		System.out.println("input freeServiceIncluded:");
		String freeServiceIncluded = scanner.nextLine();
		Room room = new Room(id,nameServices,usedArea,rentCost,numberOfPeople,typeOfRent,freeServiceIncluded);
		
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Room.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(room.getNameServices()).append(COMMA).append(room.getId()).append(COMMA).append(room.getUsedArea());
            stringBuilder.append(COMMA).append(room.getRentCost()).append(COMMA).append(room.getNumberOfPeople()).append(COMMA).append(room.getTypeOfRent());
            stringBuilder.append("\n");
            buffWrite.write(stringBuilder.toString());
            buffWrite.flush();
            buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	private static void addNewHouse() {
		
	}
	private static void addNewVilla() {
		
	}
}
