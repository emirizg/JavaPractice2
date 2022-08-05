package day19_LoopPractices;

public class Task2 {

    public static void main(String[] args) {

        String word = "abcdeffg";
        int result = 0;

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
                result+=word.indexOf(ch);
                System.out.println("result = " + result);
                System.exit(0);
            }

        }

    }

}
// 2. Write a program that can return the index number of the first duplicated character from a string