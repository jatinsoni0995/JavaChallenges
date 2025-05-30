package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    public static void main(String[] args) {

        int[] returnedArr = readIntegers();
        System.out.println(Arrays.toString(returnedArr));

        int returnedMin = findMin(returnedArr);
        System.out.println("Min = " + returnedMin);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integer, separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] arr = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            arr[i] = Integer.parseInt(splits[i].trim());
        }
        return arr;
    }

    public static int findMin(int[] arr) {

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}












