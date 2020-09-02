package controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import exception.BirthdayException;
import exception.EmailException;
import exception.GenderException;
import exception.IdCardException;
import exception.NameException;

public class AddController {
	 public static final String COMMA = ",";
	 public static final String ROOM_ID_REGEX = "^SVRO-[0-9]{4}";
	 public static final String HOUSE_ID_REGEX = "^SVHO-[0-9]{4}";
	 public static final String VILLA_ID_REGEX = "^SVVL-[0-9]{4}";
	 public static final String NAME_SERVICE_REGEX = "^[A-Z]{1}[a-z0-9]+$";
	 public static final String FREE_SERVICE_INCLUDED_REGEX = "^massage|karaoke|food|drink|car";
	 public static final String NAME_CUSTOMER_REGEX = "^[A-Z]([a-z]*)(\\s[A-Z]([a-z]*))*";
	 public static final String EMAIL_REGEX= "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
	 public static final String GENDER_REGEX= "^Male|Female|Unknow";
	 public static final String ID_CARD_REGEX= "^[0-9]{3}\s[0-9]{3}\s[0-9]{3}";
	 public static final String BIRTHDAY_REGEX= "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19\\d\\d)|2000|2001|2002|$";
	 public static Scanner scanner = new Scanner(System.in);
	 public static boolean validate(String regex, String Match) {
			Pattern pattern = Pattern.compile(Match);
			Matcher  matcher = pattern.matcher(regex);
			return matcher.matches();
		}
	 public static void addNewRoom() {
		 //scanner.skip("\\R");
		 String nameServices;
			do {
				System.out.println("input name servives:");
				 nameServices = scanner.nextLine();				
			}while(!validate(nameServices,NAME_SERVICE_REGEX));
	
		
		String id ;
		do {
			System.out.println("input id:");
			id = scanner.nextLine();		
		}while(!validate(id,ROOM_ID_REGEX));

		
		Double usedArea;
		do {
			System.out.println("input used area:");
			usedArea = scanner.nextDouble();
				
		}while(usedArea<30);
		
		
		Double rentCost ;
		do {
			System.out.println("input rent cost:");
			rentCost = scanner.nextDouble();
				
		}while(rentCost<0);
		
		
		int numberOfPeople ;
		
		do {
			System.out.println("input number of people:");
			numberOfPeople = scanner.nextInt();
				
		}while(numberOfPeople<=0||numberOfPeople>=20);
		
		
		String typeOfRent;
		do {
			System.out.println("input type of rent:");
			typeOfRent  = scanner.nextLine();
				
		}while(!validate(typeOfRent,NAME_SERVICE_REGEX));
		
		
		
		String freeServiceIncluded;
		do {
			System.out.println("input freeServiceIncluded:");
			freeServiceIncluded = scanner.nextLine();
				
		}while(!validate(freeServiceIncluded,FREE_SERVICE_INCLUDED_REGEX));
		
		
		Room room = new Room(id,nameServices,usedArea,rentCost,numberOfPeople,typeOfRent,freeServiceIncluded);
		
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Room.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
           StringBuilder stringBuilder = new StringBuilder();
           stringBuilder.append(room.getNameServices()).append(COMMA).append(room.getId()).append(COMMA).append(room.getUsedArea());
           stringBuilder.append(COMMA).append(room.getRentCost()).append(COMMA).append(room.getNumberOfPeople()).append(COMMA).append(room.getTypeOfRent()).append(COMMA).append(room.getFreeServiceIncluded());
           stringBuilder.append("\n");
           buffWrite.write(stringBuilder.toString());
           buffWrite.flush();
           buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	 //
	 public static void addNewHouse() {
		 String nameServices;
			do {
				System.out.println("input name servives:");
				 nameServices = scanner.nextLine();				
			}while(!validate(nameServices,NAME_SERVICE_REGEX));
	
		
		String id ;
		do {
			System.out.println("input id:");
			id = scanner.nextLine();		
		}while(!validate(id,HOUSE_ID_REGEX));

		
		Double usedArea;
		do {
			System.out.println("input used area:");
			usedArea = scanner.nextDouble();
				
		}while(usedArea<30);
		
		
		Double rentCost ;
		do {
			System.out.println("input rent cost:");
			rentCost = scanner.nextDouble();
				
		}while(rentCost<=0);
		
		
		int numberOfPeople ;
		
		do {
			System.out.println("input number of people:");
			numberOfPeople = scanner.nextInt();
				
		}while(numberOfPeople<=0||numberOfPeople>20);
		
		
		String typeOfRent;
		do {
			System.out.println("input type of rent:");
			typeOfRent  = scanner.nextLine();
				
		}while(!validate(typeOfRent,NAME_SERVICE_REGEX));
		
		
		String standardRoom ;
		do {
			System.out.println("input standard Room:");
			standardRoom  = scanner.nextLine();
				
		}while(!validate(standardRoom,NAME_SERVICE_REGEX));
		
	
		int numberOfFloor ;
		do {
			System.out.println("input number Of Floor:");
			numberOfFloor  = scanner.nextInt();
				
		}while(numberOfFloor<=0);
		
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
		 String nameServices;
			do {
				System.out.println("input name servives:");
				 nameServices = scanner.nextLine();				
			}while(!validate(nameServices,NAME_SERVICE_REGEX));
	
		
		String id ;
		do {
			System.out.println("input id:");
			id = scanner.nextLine();		
		}while(!validate(id,VILLA_ID_REGEX));

		
		Double usedArea;
		do {
			System.out.println("input used area:");
			usedArea = scanner.nextDouble();
				
		}while(usedArea<30);
		
		
		Double rentCost ;
		do {
			System.out.println("input rent cost:");
			rentCost = scanner.nextDouble();
				
		}while(rentCost<=0);
		
		
		int numberOfPeople ;
		
		do {
			System.out.println("input number of people:");
			numberOfPeople = scanner.nextInt();
				
		}while(numberOfPeople<=0||numberOfPeople>=20);
		
		
		String typeOfRent;
		do {
			System.out.println("input type of rent:");
			typeOfRent  = scanner.nextLine();
				
		}while(!validate(typeOfRent,NAME_SERVICE_REGEX));
		
	
		String standardRoom ;
		do {
			System.out.println("input standard Room:");
			standardRoom  = scanner.nextLine();
				
		}while(!validate(standardRoom,NAME_SERVICE_REGEX));
		
	
		double poolArea;
		do {
			System.out.println("input poolArea:");
			 poolArea = scanner.nextDouble();
				
		}while(poolArea<30);
		
		
		int numberOfFloor ;
		do {
			System.out.println("input number Of Floor:");
			numberOfFloor = scanner.nextInt();
				
		}while(numberOfFloor<=0);
		
		Villa villa = new Villa(nameServices, id,   usedArea,  rentCost,  numberOfPeople,
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
	 // this function is use to add customer
	public static void addNewCustomer() {
		// input name of customer
		String nameCustomer;
		do {
			try {
				System.out.println("input name of customer:");
				nameCustomer= scanner.nextLine();
				if(validate(nameCustomer,NAME_CUSTOMER_REGEX)) {
					break;
				}else {
					throw new NameException();
				}
			}catch(NameException e){
				System.out.println(e.getMessage());
			}
			
		}while(true);
		//input email
		String email;
		do {
			try {
				System.out.println("input email:");
				email= scanner.nextLine();
				if(validate(email,EMAIL_REGEX)) {
					break;
				}else {
					throw new EmailException();
				}
			}catch(EmailException e){
				System.out.println(e.getMessage());
			}
			
		}while(true);
		//input gender
		String gender;
		do {
			try {
				System.out.println("input gender:");
				gender= scanner.nextLine();
				if(validate(gender,GENDER_REGEX)) {
					break;
				}else {
					throw new GenderException();
				}
			}catch(GenderException e){
				System.out.println(e.getMessage());
			}
			
		}while(true);
		
		//input idCard
		String idCard;
		do {
			try {
				System.out.println("input id card:");
				idCard= scanner.nextLine();
				if(validate(idCard,ID_CARD_REGEX)) {
					break;
				}else {
					throw new IdCardException();
				}
			}catch(IdCardException e){
				System.out.println(e.getMessage());
			}
			
		}while(true);
		// input birthday
		String birthday;
		do {
			try {
				System.out.println("input birthday:");
				birthday= scanner.nextLine();
				if(validate(birthday,BIRTHDAY_REGEX)) {
					break;
				}else {
					throw new BirthdayException();
				}
			}catch(BirthdayException e) {
				System.out.println(e.getMessage());
				
			}
			
		}while(true);
		
		System.out.println("input phone number:");
		String phoneNumber= scanner.nextLine();
		
		System.out.println("input type Of Customer:");
		String typeOfCustomer= scanner.nextLine();
		
		
		System.out.println("input address:");
		String address= scanner.nextLine();
		
		Customer customer = new Customer( nameCustomer, birthday, gender, idCard, phoneNumber,
				 email, typeOfCustomer, address);
		
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Customer.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(customer.getNameCustommer()).append(COMMA).append(customer.getBirthday()).append(COMMA).append(customer.getGender())
          .append(COMMA).append(customer.getIdCard()).append(COMMA).append(customer.getPhoneNumber()).append(COMMA).append(customer.getEmail())
          .append(COMMA).append(customer.getTypeOfCustomer()).append(COMMA).append(customer.getAddress()).append("\n");
          buffWrite.write(stringBuilder.toString());
          buffWrite.flush();
          buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}

	}
	public static void addBooking(Customer customer) {
		File file= new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Booking.csv");
		try {
			FileWriter fileWriter = new FileWriter(file,true);
		    BufferedWriter buffWrite = new BufferedWriter(fileWriter);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(customer.getNameCustommer()).append(COMMA).append(customer.getBirthday()).append(COMMA).append(customer.getGender())
          .append(COMMA).append(customer.getIdCard()).append(COMMA).append(customer.getPhoneNumber()).append(COMMA).append(customer.getEmail())
          .append(COMMA).append(customer.getTypeOfCustomer()).append(COMMA).append(customer.getAddress()).append(COMMA).append(customer.getServicesUse()).append("\n");
          buffWrite.write(stringBuilder.toString());
          buffWrite.flush();
          buffWrite.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
