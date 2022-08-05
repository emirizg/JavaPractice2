package day19_LoopPractices;

public class Task3 {

    public static void main(String[] args) {

        String word = "aabbcdeffggllgg";
        String result = "";
        int frequency = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            int counter=0;

            for (int j = 0; j < word.length(); j++) {

                char each=word.charAt(j);

                if (ch==each){
                    counter++;
                }

            }

            if (counter==2){
                result+=ch;
                System.out.println(result);
                System.exit(0);
            }
        }


    }

}
// 	3. Write a program that can display all the characters that appeared twice in the string.