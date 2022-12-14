package day10_NestedIf_Ternaries;

public class AgeGroups {

    public static void main(String[] args) {

        int age=83;
        String ageGroup="";
        boolean isValid=age >= 0 && age<=150;

        if (isValid){

            if (age<21){
                ageGroup="Teenager";
            } else if (age>= 21 && age < 55) {
                ageGroup="Adult";
            }else {
                ageGroup="Senior";
            }

        }else {
            ageGroup="Invalid";
        }

        System.out.println(ageGroup);

    }

}
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
