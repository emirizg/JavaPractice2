package day19_LoopPractices;

public class Task4 {

    public static void main(String[] args) {

        String word = "aabbcdeffggllgg";
        int result = 0;

        for (int i = 0; i < word.length(); i++) {

            char ch=word.charAt(i);
            int counter=0;

            for (int j = 0; j < word.length(); j++) {

                char each=word.charAt(j);

                if (ch==each){
                    counter++;
                }

            }

            if (counter==1){

                result+=word.indexOf(ch);
                System.out.println("First unique char: "+ch);
                break;

            }

        }

        System.out.println(result);
    }

}
// 	4. Write a program that can return the index number of the first unique character.