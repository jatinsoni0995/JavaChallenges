package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();
        printArray(size);

    }

    public static int[] getIntegers(int size){
        System.out.print("Enter " + size + " integers: ");
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        try{
            for(int i = 0; i < size; i++) {
                if(scanner.hasNextInt()){
                    arr[i] = scanner.nextInt();
                }else{
                    System.out.println("Invalid input! Enter integers only.");
                    scanner.close();
                    System.exit(1);
                }
            }

        } finally{
            scanner.close(); // Close Scanner
        }
        return arr;
    }

    // Sort array in descending order using Bubble sort
    public static int[] sortIntegers(int size) {

        int[] arr = getIntegers(size);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) { // Swap if current < next
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return arr;
    }
    public static void printArray(int size){

        int[] arr = sortIntegers(size);
        System.out.println("Sorted array (descending): " + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}
