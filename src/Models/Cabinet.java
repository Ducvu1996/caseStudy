package Models;


import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import controllers.ShowController;

public class Cabinet {
	private static Stack<Employee> stackEmployee= new Stack<>();
	private static Scanner scanner = new Scanner(System.in);
	static {
		Map<String,Employee> mapEmployee=ShowController.showEmployee();
	
		for(Map.Entry<String, Employee> employeeEntry:mapEmployee.entrySet()) {
			stackEmployee.push(employeeEntry.getValue());
		}
	}
	private static Employee getFileOfEmployee(String nameEmployee) {
		Employee employee=null;
		while(!stackEmployee.isEmpty()) {
			
			employee= stackEmployee.pop();
			if(employee.getNameEmployee().equals(nameEmployee)) {
				return employee;
			}
			employee=null;
		}
		
		return employee;
	}
	public static void findFileOfEmployee(){
		System.out.println("Input name of Employee you wanna find");
		String nameEmployee = scanner.nextLine();
		Employee employee = getFileOfEmployee(nameEmployee);
		if(employee!=null) {
			System.out.println("File Employee:"+employee.toString());
		}else {
			System.out.println("File employee is not found");
		}
	}
	
}
