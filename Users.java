import java.util.Scanner;
public abstract class Users {
    private Scanner scanner = new Scanner(System.in);
    //We are looking to have everyone make an account to shop at the store//
    //admin also need an account to login into//
    public Users(){}

    public String setCreds(){
    System.out.println("Please set your password and username so we can give you credentials!");

    System.out.println("This will be your username, please enter it?");
    String username = scanner.nextLine();
    
    System.out.println("This will be your password, please enter it? Also it must be greater than 10 characters");
    String password = scanner.nextLine();
    while (password.length() <= 10) {
        System.out.println("Error: password is too brief");
        password = scanner.nextLine();
    }
        return ("Username: " + username + ", Password: " + password);
    
    }
}
