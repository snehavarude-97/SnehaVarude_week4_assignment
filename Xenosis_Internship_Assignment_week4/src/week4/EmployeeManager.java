/*Q.2 Create a program that uses a HashMap to store and retrieve employee details based 
 * on their employee ID. */
package week4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
	private HashMap<Integer, String> employeeMap;
	
	//Constructor to intilaize the HashMap
	public EmployeeManager()
	{
		employeeMap = new HashMap<>();
	}
	
	//Method to add an employee
	public void addEmployee(int employeeId, String employeeName)
	{
		employeeMap.put(employeeId, employeeName);
        System.out.println("Employee with ID " + employeeId + " has been added.");
	}
	
	// Method to remove an employee by ID
    public void removeEmployee(int employeeId) {
        if (employeeMap.remove(employeeId) != null) {
            System.out.println("Employee with ID " + employeeId + " has been removed.");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }
    
    // Method to retrieve an employee by ID
    public void getEmployee(int employeeId) {
        String employeeName = employeeMap.get(employeeId);
        if (employeeName != null) {
            System.out.println("Employee ID " + employeeId + ": " + employeeName);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    // Method to display all employees
    public void displayEmployees() {
        if (employeeMap.isEmpty()) 
        {
            System.out.println("No employees to display.");
        } 
        else 
        {
            System.out.println("Employee List:");
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) 
            {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
}
    
    
   // Main method to interact with the user
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();
        String command;

        do {
            System.out.println("\nEmployee Manager");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Retrieve Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            command = scanner.nextLine();
            
            switch (command) {
            case "1":
                System.out.print("Enter employee ID: ");
                int addId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter employee name: ");
                String addName = scanner.nextLine();
                manager.addEmployee(addId, addName);
                break;
            case "2":
                System.out.print("Enter employee ID to remove: ");
                int removeId = Integer.parseInt(scanner.nextLine());
                manager.removeEmployee(removeId);
                break;
            case "3":
                System.out.print("Enter employee ID to retrieve: ");
                int getId = Integer.parseInt(scanner.nextLine());
                manager.getEmployee(getId);
                break;
            case "4":
                manager.displayEmployees();
                break;
            case "5":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                break;
        }
    } while (!command.equals("5"));

    scanner.close();
	}
}
