package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Models.House;
import Models.Room;
import Models.Villa;

public class ShowController {

	public static void showAllVilla() {
		List<Villa> villaList = new ArrayList<>();
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Villa.csv");
		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileReader);
			String line;
	        String[] temp;
	        Villa villa;
	        while ((line = buffRead.readLine()) != null) {
	            temp = line.split(",");
	            villa = new Villa(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3])
	            		,Integer.parseInt(temp[4]),temp[5],temp[6],Double.parseDouble(temp[7]),Integer.parseInt(temp[8]));
	            villaList.add(villa);
	        }
	        for(Villa villa_print: villaList) {
	        	villa_print.showInfor();
	        }
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
	}

	public static void showAllHouse() {
		List<House> houseList = new ArrayList<>();
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\House.csv");
		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileReader);
			String line;
	        String[] temp;
	        House house;
	        while ((line = buffRead.readLine()) != null) {
	            temp = line.split(",");
	            house = new House(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3])
	            		,Integer.parseInt(temp[4]),temp[5],temp[6],Integer.parseInt(temp[7]));
	            houseList.add(house);
	        }
	        for(House house_print: houseList) {
	        	house_print.showInfor();
	        }
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		
	}

	public static void showAllRoom() {
		List<Room> roomList = new ArrayList<>();
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Room.csv");
		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileReader);
			String line;
	        String[] temp;
	        Room room;
	        while ((line = buffRead.readLine()) != null) {
	            temp = line.split(",");
	            room = new Room(temp[0],temp[1],Double.parseDouble(temp[2]),Double.parseDouble(temp[3])
	            		,Integer.parseInt(temp[4]),temp[5],temp[6]);
	            roomList.add(room);
	        }
	        for(Room room_print: roomList) {
	        	room_print.showInfor();
	        }
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		
	}

}
