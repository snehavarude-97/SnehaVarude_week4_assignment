/*Q.3 Implement a program that handles multiple exceptions (e.g., ArithmeticException,
NullPointerException) and uses custom exceptions.*/
package week4;
	//Custom Exception Class
	class CustomException extends Exception {
		public CustomException(String message) {
			super(message);
		}
	}
public class ExceptionHandlingDemo {
	
	// Method that may throw built-in and custom exceptions
    public static void riskyOperation(int divisor, String name) throws CustomException {
        if (name == null) {
            throw new NullPointerException("Name cannot be null.");
        }
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        if (name.length() < 5) {
            throw new CustomException("Name must be at least 5 characters long.");
        }
        // Simulating some operation
        int result = 100 / divisor;
        System.out.println("Result: " + result);
    }

	public static void main(String[] args) {
		 int[] divisors = {10, 0};
	        String[] names = {"John", null, "Alice"};

	        for (int divisor : divisors) {
	            for (String name : names) {
	                try {
	                    System.out.println("\nProcessing: Divisor = " + divisor + ", Name = " + name);
	                    riskyOperation(divisor, name);
	                } catch (ArithmeticException e) {
	                    System.out.println("Caught ArithmeticException: " + e.getMessage());
	                } catch (NullPointerException e) {
	                    System.out.println("Caught NullPointerException: " + e.getMessage());
	                } catch (CustomException e) {
	                    System.out.println("Caught CustomException: " + e.getMessage());
	                } catch (Exception e) {
	                    System.out.println("Caught Exception: " + e.getMessage());
	                }
	            }
	        }
	}
}
