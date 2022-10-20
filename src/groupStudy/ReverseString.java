package groupStudy;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String reversed = "";

        for (int i = str.length()-1; i >= 0 ; i--){

            char ch= str.charAt(i);

            reversed += ch;

        }
        System.out.println("reversed = " + reversed);

    }

}
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */