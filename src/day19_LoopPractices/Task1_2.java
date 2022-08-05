package day19_LoopPractices;

public class Task1_2 {

    public static void main(String[] args) {

        String str="aacccdddeffg";
        String result="";
        int counter=0;

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            counter=0;

            for (int j = 0; j < str.length(); j++) {

                char each=str.charAt(j);

                if (ch==each){
                    counter++;
                }

            }

            if (counter==3){

                result+=ch;
                System.out.println(result);
                System.exit(0);
            }

        }


    }

}
// 1. Write a program that can return the first duplicated character from a string