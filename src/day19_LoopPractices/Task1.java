package day19_LoopPractices;

public class Task1 {

    public static void main(String[] args) {
        String word = "abbbcdeffg";
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            int counter=0;

            for (int j = 0; j < word.length(); j++) {

                char each=word.charAt(j);

                if (each == ch) {
                    counter++;
                }
            }

            if (counter>=2){
                result+=ch;
                System.out.println("result = " + result);
                System.exit(0);
            }

        }


    }
}
// 	1. Write a program that can return the first duplicated character from a string