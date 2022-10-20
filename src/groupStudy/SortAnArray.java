package groupStudy;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        int[] arr = {3,7,1,9,2,7,4,11,76,7,30};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));


    }

}
