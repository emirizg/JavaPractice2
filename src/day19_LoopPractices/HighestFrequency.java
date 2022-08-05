package day19_LoopPractices;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "abbbccdeffffffffg";
        String result = "";

        int max=0;

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            int counter=0;

            for (int j = 0; j <str.length() ; j++) {

                char each=str.charAt(j);
                if (ch==each){
                    counter++;
                }

            }

            if (counter>max){
                max=counter;
            }

        }
        System.out.println(max);


    }

}
/*
6.  Write a program that can find the character that has the highest frequency from a string
 */