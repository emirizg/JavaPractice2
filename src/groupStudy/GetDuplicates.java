package groupStudy;

import java.util.Scanner;

public class GetDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

    public static int getDup(String[] r) {

        // a , b , c , a , z , z
        int sum = 0;
        String result = "";
        for (int i = 0; i < r.length; i++){
            int count = 0;

            for (int j = 0; j < r.length; j++){
                if (r[i].equals(r[j])){
                    count++;
                }
            }

            if (result.contains(r[i]) || count == 1){
                continue;
            }
            result += r[i];
            sum += count;
        }
        return sum;

    }



}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, the method counts how many of those present in the array.

Example :

getDup(["1","2","aa"',"1"])
returns:2
("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1", "aa"])
returns:4
("1" is duplicated and there are two "1"s
and 2 "aa"s so return is 4)

getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

hint:
you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current
 */