package system;

import java.util.ArrayList;
import java.util.Scanner;


public class LoginMenu {

    static String username;
    static int answer;

    public static void LoginMenu(Scanner input, ArrayList<User> users) {


        answer = 1;

        while (answer != 0) {
            System.out.println("Login menu");
            System.out.println("Press 1 to login ");
            System.out.println("Press 2 to create a new user ");
            System.out.println("Press 0 to go to main menu ");


            answer = input.nextInt();

            switch (answer) {
                case 1:
                    login(input);
                    break;
                case 2:
                    create(input);
                    break;
                case 0:
                    System.out.println("Redirecting to main menu...");
                    break;
            }
        }
    }

    static void login(Scanner input){

        boolean loggedIn = false;

        while(!loggedIn) {
            System.out.println("LOG IN");

            System.out.print("Username: ");
            String usernameInput = input.next();

            System.out.print("Password: ");
            String passwordInput = input.next();

            User user = UserRepo.getUserByUsername(usernameInput);

            loggedIn = validateLogin(user, passwordInput);

        }

        System.out.println("you are logged in as " + username + "\n");
        System.out.println("Redirecting to main menu..."+ "\n");

    }

    static boolean validateLogin(User user, String passwordInput){
        if(user != null){
            if(user.password.equals(passwordInput)){
                username = user.username;
                answer = 0;
                return true;
            }else{
                System.out.println("\n"+"Wrong user name or password");
            }
        }else{
            System.out.println("\n"+"Wrong user name or password");
        }
        System.out.println();
        return false;
    }

    public static void create(Scanner input){

        System.out.println("Creating new user: "+"\n");

        System.out.println("insert first name: ");
        String firstname = input.next();
        System.out.println("insert last name: ");
        String lastname = input.next();
        System.out.println("insert social security number: ");
        int socalSecurityNumber = input.nextInt();
        System.out.println("insert your gender: ");
        String gender = input.next();
        System.out.println("insert username: ");
        String userName = input.next();
        System.out.println("insert password: ");
        String password = input.next();
        System.out.println("insert your phone number: ");
        int phoneNumber = input.nextInt();

        User user = new User(firstname, lastname, socalSecurityNumber, gender, userName, password, phoneNumber);
        System.out.println(user);
        UserRepo userRepo = new UserRepo();
        userRepo.create(user);
    }
}
