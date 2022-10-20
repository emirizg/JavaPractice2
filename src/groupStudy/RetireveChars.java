package groupStudy;

import java.util.Scanner;

public class RetireveChars {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String letters = "",
                digits = "",
                specials = "";

        for (int i = 0; i < str.length(); i++) {

            if ( str.charAt(i) >= 48 && str.charAt(i) <= 57 ){
                digits+=str.charAt(i);
            } else if ( (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||  (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                letters+=str.charAt(i);
            }else {
                specials+=str.charAt(i);
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);

    }

}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */