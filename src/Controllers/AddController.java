package controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Models.House;
import Models.Room;
import Models.Villa;

public class AddController {
	 public static final String COMMA = ",";
	 public static Scanner scanner = new Scanner(System.in);
	 public static void addNewRoom() {
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
	 public static void addNewHouse() {
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
		 //scanner.skip("\\R");
		String typeOfRent = scanner.nextLine();
		System.out.println("input standard Room:");
		String standardRoom = scanner.nextLine();
		System.out.println("input number Of Floor:");
		int numberOfFloor = scanner.nextInt();
		House house = new House( id, nameServices,  usedArea,  rentCost,  numberOfPeople,
				 typeOfRent, standardRoom, numberOfFloor);
		
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\House.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(house.getNameServices()).append(COMMA).append(house.getId()).append(COMMA).append(house.getUsedArea());
           stringBuilder.append(COMMA).append(house.getRentCost()).append(COMMA).append(house.getNumberOfPeople()).append(COMMA).append(house.getTypeOfRent()).append(COMMA).append(house.getStandardRoom()).append(COMMA).append(house.getNumberOfFloor());
           stringBuilder.append("\n");
           buffWrite.write(stringBuilder.toString());
           buffWrite.flush();
           buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
	 public static void addNewVilla() {
		//scanner.skip("\\R");
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
		System.out.println("input standard Room:");
		String standardRoom = scanner.nextLine();
		System.out.println("input poolArea:");
		double poolArea = scanner.nextDouble();
		System.out.println("input number Of Floor:");
		int numberOfFloor = scanner.nextInt();
		Villa villa = new Villa( id, nameServices,  usedArea,  rentCost,  numberOfPeople,
				 typeOfRent, standardRoom,poolArea, numberOfFloor);
		
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Villa.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(villa.getNameServices()).append(COMMA).append(villa.getId()).append(COMMA).append(villa.getUsedArea())
           .append(COMMA).append(villa.getRentCost()).append(COMMA).append(villa.getNumberOfPeople()).append(COMMA).append(villa.getTypeOfRent())
           .append(COMMA).append(villa.getStandardRoom()).append(COMMA).append(villa.getPoolArea()).append(COMMA).append(villa.getNumberOfFloor()).append("\n");
           buffWrite.write(stringBuilder.toString());
           buffWrite.flush();
           buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}
