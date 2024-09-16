/*Write a program to manage a list of students using ArrayList. Include methods to add, 
 * remove, and display students.*/
package week4;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
	private ArrayList<String> students;
	
	//constructor to initialize Arraylist
	public StudentManager()
	{
		students = new ArrayList<>();
	}
	
	//Method to add student
	public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println(studentName + " has been added.");
    }
	
	//Method to remove a student by name
	public void removeStudent(String studentName) {
        if (students.remove(studentName)) 
        {
            System.out.println(studentName + " has been removed.");
        } 
        else 
        {
            System.out.println(studentName + " not found.");
        }
    }
	
	//Method to display all student
	public void displayStudents()
	{
		if (students.isEmpty()) 
		{
            System.out.println("No students to display.");
        } 
		else 
        {
            System.out.println("List of students:");
            for (String student : students) 
            {
                System.out.println(student);
            }
        }
	}
	
	//Main method for user to interact
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        String command;

        do {
            System.out.println("\nStudent Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            command = scanner.nextLine();
            
            switch (command) {
            case "1":
                System.out.print("Enter student name to add: ");
                String addName = scanner.nextLine();
                manager.addStudent(addName);
                break;
            case "2":
                System.out.print("Enter student name to remove: ");
                String removeName = scanner.nextLine();
                manager.removeStudent(removeName);
                break;
            case "3":
                manager.displayStudents();
                break;
            case "4":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }
    } while (!command.equals("4"));

    scanner.close();
}
}

