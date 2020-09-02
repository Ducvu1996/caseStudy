package controllers;

import java.util.List;
import java.util.Scanner;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

public class BookingController {
	public static Scanner scanner = new Scanner(System.in);

	public static void bookingVilla(Customer customer) {
		List<Villa> villaList=ShowController.showAllVilla();
		 int numericalOrder=1;
	        for(Villa villa_print: villaList) {
	        	System.out.println(numericalOrder+":"+villa_print.showInfor());
	        	numericalOrder++;
	        }
		System.out.println("choose a villa to booking:");
		int choice= scanner.nextInt();
		customer.setServicesUse(villaList.get(choice-1));
		System.out.println(villaList.get(choice-1).showInfor());
		AddController.addBooking(customer);
		
	}

	public static void bookingHouse(Customer customer) {
		List<House> houseList=ShowController.showAllHouse();
		 int numericalOrder=1;
	        for(House house_print: houseList) {
	        	System.out.println(numericalOrder+":"+house_print.showInfor());
	        	numericalOrder++;
	        }
		System.out.println("choose a house to booking:");
		int choice= scanner.nextInt();
		customer.setServicesUse(houseList.get(choice-1));
		System.out.println(houseList.get(choice-1).showInfor());
		AddController.addBooking(customer);
		
	}

	public static void bookingRoom(Customer customer) {
		List<Room> roomList=ShowController.showAllRoom();
		int numericalOrder=1;
	    for(Room room_print: roomList) {
	        	System.out.println(numericalOrder+":"+room_print.showInfor());
	        	numericalOrder++;
	        }
		System.out.println("choose a room to booking:");
		int choice= scanner.nextInt();
		customer.setServicesUse(roomList.get(choice-1));
		System.out.println(roomList.get(choice-1).showInfor());
		AddController.addBooking(customer);
		
	}

}
