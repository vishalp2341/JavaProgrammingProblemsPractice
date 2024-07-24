package tai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ALCommonOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the size of array A
        int n = scanner.nextInt(); // Read the size of the first array
        int[] A = new int[n]; // Initialize the first array with the given size
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt(); // Read the elements of the first array
        }
        
        // Reading the size of array B
        int m = scanner.nextInt(); // Read the size of the second array
        int[] B = new int[m]; // Initialize the second array with the given size
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt(); // Read the elements of the second array
        }
        
        // Using ArrayLists to find common odd elements
        ArrayList<Integer> listA = new ArrayList<>(); // List to store odd elements from array A
        ArrayList<Integer> commonOddElements = new ArrayList<>(); // List to store common odd elements

        // Populate listA with odd elements from array A
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) { // Check if the element is odd
                listA.add(A[i]); // Add the odd element to listA
            }
        }

        // Find common odd elements in both arrays
        for (int i = 0; i < m; i++) {
            if (B[i] % 2 != 0 && listA.contains(B[i]) && !commonOddElements.contains(B[i])) {
                // Check if the element is odd, present in listA, and not already in commonOddElements
                commonOddElements.add(B[i]); // Add the common odd element to commonOddElements
            }
        }

        // Sorting the common odd elements
        Collections.sort(commonOddElements); // Sort the common odd elements in ascending order

        // Printing the result
        if (commonOddElements.isEmpty()) {
            // If there are no common odd elements
            System.out.println("No common odd elements found.");
        } else {
            // Print the common odd elements
            for (int i = 0; i < commonOddElements.size(); i++) {
                System.out.print(commonOddElements.get(i) + " "); // Print each element followed by a space
            }
        }

        scanner.close(); // Close the scanner
    }
}
