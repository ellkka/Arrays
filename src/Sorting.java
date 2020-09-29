import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args){

        int sum = 0;

        int[] my_array1 = new int[10_000];
        Random randomNum = new Random();
        for (int i = 0; i < 10_000; i++) {
            my_array1[i] = randomNum.nextInt(100);
        }
        System.out.println();
        printArray(my_array1);

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        iterationSort(my_array1);
        printArray(my_array1);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        long timeOfExecution = (endTime - startTime);
        System.out.println("Time: " + timeOfExecution);

        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        selectionSort(my_array1);
        printArray(my_array1);
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        timeOfExecution = (endTime - startTime);
        System.out.println("Time: " + timeOfExecution);



    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    static void iterationSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    //selection sorting is faster then iteration
    static void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
