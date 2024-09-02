import java.util.Scanner;

public class SimpleLoginForm {
    public static void main(String[] args) {
       
        String validUsername = "Leon";
        String validPassword = "pass123";

      
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Welcome again");
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
            System.out.println("Login successful. Welcome, " + enteredUsername + "!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }

     
        scanner.close();
    }
}
