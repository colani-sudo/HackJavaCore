
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        // Write your code here
        //System.out.println("original a: " + a);
        int size = a.size();
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < size - i - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    numberOfSwaps++;   
                }   
            }
                                   
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(size - 1)); 
        bufferedReader.close();
    }
}
/*
Input:
7
3 4 5 3 2 5 7

Output:
Array is sorted in 6 swaps.
First Element: 2
Last Element: 7
*/
