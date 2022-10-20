package groupStudy;

public class FrequencyChar {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        int frequency = 0;

        String[] arr = str.split("");

        for (String eachChar : arr) {

            frequency=0;
            for (String s : arr) {

                if (eachChar.equals(s)){
                    frequency++;
                }

            }

            if (!result.contains(eachChar)){
                result+=eachChar;
                result+=frequency;
            }

        }

        System.out.println(result);


    }

}
/*
4. Write a program that can find the frequency of the characters from a
string
 Ex:
str = "aabcccd";
output:
a2b1c3d1 --> a2b1c3d1
Hint: if you find out how to find the frequency of one
character, then repeat it for all the remaining characters
 */