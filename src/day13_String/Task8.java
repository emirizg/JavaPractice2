package day13_String;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your credentials: ");
        String user=input.next();
        String pass=input.next();

        String username="Cydeo";
        String password="WoodenSpoon";

        if (username.equals(user) && password.equals(pass)){
            System.out.println("Logged in.");
        }else {
            System.out.println("Incorrect username or password");
        }

        input.close();
    }

}
/*

8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */