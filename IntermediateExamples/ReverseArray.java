package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = getArrayElements();
        System.out.println(Arrays.toString(arr));

        reversedArray(arr);

        int[] arr2 = getArrayElements();
        System.out.println("Duplicate Reversed Array: " + Arrays.toString(reverseCopy(arr2)));
    }

    private static int[] getArrayElements(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements: " );
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // *** BAD PRACTICE *** -> Mutating method: it will modify the original array
    private static void reversedArray(int[] arr){

        int lastIndex = arr.length - 1;
        int halfIndex = arr.length / 2;

        for(int i = 0; i < halfIndex; i++){

            int temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // it will create a new array then will modify it
    private static int[] reverseCopy(int[] arr){

        int[] copy = new int[arr.length];
        int lastIndex = arr.length - 1;
        for(int element: arr){
            copy[lastIndex--] = element;
        }

        return copy;
    }
}
