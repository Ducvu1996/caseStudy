package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

import Models.Customer;
import Models.Employee;
import Models.House;
import Models.Room;
import Models.Villa;

public class ShowController {

	public static List<Villa> showAllVilla() {
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
//	        
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		return villaList;
	}

	public static List<House> showAllHouse() {
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
//	       
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		return houseList;
	}

	public static List<Room> showAllRoom()   {
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
	  
	        buffRead.close();
	     
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		return roomList;
	}

	public static List<Customer> showInformationCustomer() {
		List<Customer> customerList = new ArrayList<>();
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Customer.csv");
		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileReader);
			String line;
	        String[] temp;
	        Customer customer;
	        while ((line = buffRead.readLine()) != null) {
	            temp = line.split(",");
	            customer = new Customer(temp[0],temp[1],temp[2],temp[3]
	            		,temp[4],temp[5],temp[6],temp[7]);
	            customerList.add(customer);
	        }
	        int numericalOrder=1;
	        Collections.sort(customerList, new SortCustomer());
	        for(Customer customer_print: customerList) {
	        	System.out.println(numericalOrder+":"+customer_print.showInfor());
	        	numericalOrder++;
	        }
	        buffRead.close();
	        
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		return customerList;
	}

	public static void showAllNameVilla() {
		List<Villa> villaList=showAllVilla();
		TreeSet<String> treeSet = new TreeSet<>();
		for(int i=0;i<villaList.size();i++) {
			treeSet.add(villaList.get(i).getNameServices());
		}
		System.out.println("All Name Villa Not Duplicate :");
		for (String nameVilla : treeSet) {
	        System.out.print(nameVilla + "\n");
	    }
	
	}

	public static void showAllNameHouse() {
		List<House> houseList=showAllHouse();
		TreeSet<String> treeSet = new TreeSet<>();
		for(int i=0;i<houseList.size();i++) {
			treeSet.add(houseList.get(i).getNameServices());
		}
		System.out.println("All Name House Not Duplicate:");
		for (String nameHouse : treeSet) {
	        System.out.print(nameHouse + "\n");
	    }
	
	}

	public static void showAllNameRoom() {
		List<Room> roomList=showAllRoom();
		TreeSet<String> treeSet = new TreeSet<>();
		for(int i=0;i<roomList.size();i++) {
			treeSet.add(roomList.get(i).getNameServices());
		}
		System.out.println("All Name Room Not Duplicate:");
		for (String nameRoom : treeSet) {
	        System.out.print(nameRoom + "\n");
	    }
	
	}

	public static Map<String,Employee> showEmployee() {
		Map<String,Employee> map=new HashMap<String,Employee>();
		File file = new File("C:\\Users\\USER\\eclipse-workspace\\CaseStudy\\src\\Data\\Employee.csv");
		try {
			
			FileReader fileReader = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileReader);
			String line;
	        String[] temp;
	        Employee employee;
	        while ((line = buffRead.readLine()) != null) {
	            temp = line.split(",");
	    
	            employee = new Employee(temp[1],Integer.parseInt(temp[2]),temp[3]);
	            map.put(temp[0], employee);
	        }
	       
	        buffRead.close();
	        
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
	        e.printStackTrace();
	    }	
		return map;
	}

	public static void showQueueCinema() {
		Queue<Customer> queueCustomer= new LinkedList<>();
		List<Customer> customerList = new ArrayList<>();
		customerList = showInformationCustomer();
		
		queueCustomer.add(customerList.get(2));
		queueCustomer.add(customerList.get(1));
		queueCustomer.add(customerList.get(0));
		Customer customer=null;
		System.out.println("================================"
				+ "Customers who buy 3D cinema ticket:");
		while(!queueCustomer.isEmpty()) {
			customer=queueCustomer.poll();
			System.out.println(customer.showInfor());
		}
	}

}
