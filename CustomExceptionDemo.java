// Custom Exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main class
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw exception
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
            System.out.println("Exception class: " + e.getClass().getName());
            System.out.println("Stack trace:");
            e.printStackTrace();
            System.out.println("Cause of the exception: " + e.getCause());
            System.out.println("Localized message: " + e.getLocalizedMessage());
            System.out.println("String representation: " + e.toString());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18 to register.");
        } else {
            System.out.println("Age is valid. Registration successful.");
        }
    }
}