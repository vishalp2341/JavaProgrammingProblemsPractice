package day19rearrangearrayConsecutiveSubarray;

import java.util.*;
 
public class eg {
    public static int countSubarrays(int[] arr, int n) {
        int count = 0; // Initialize count to 0
 
        // Loop over all subarrays
        for (int i = 0; i < n; i++) {
            int j = i + 1;
 
            // Check if consecutive elements differ by 1
            while (j < n && arr[j] - arr[j-1] == 1) {
                j++;
            }
 
            // Add the count of subarrays with consecutive elements differing by 1
            count += (j - i) * (j - i - 1) / 2;
 
            // Move i to the next position
            i = j - 1;
        }
 
        // Return the total count of subarrays
        return count;
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
 
        int count = countSubarrays(arr, n);
 
        System.out.println("Total number of subarrays with consecutive elements differing by 1: " + count);
    }
}