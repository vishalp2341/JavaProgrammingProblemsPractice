package day18SubArrays;


import java.util.Scanner;

public class PrintAllSubarraysWhoseSumisPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] ar = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();

        // Find and print all subarrays with prime sum
        findSubarraysWithPrimeSum(ar);
    }

    static void findSubarraysWithPrimeSum(int[] ar) {
        boolean found = false;

        for (int size = 1; size <= ar.length; size++) {
            for (int i = 0; i <= ar.length - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum = sum + ar[j];
                }

                if (isPrime(sum)) {
                    found = true;
                    for (int j = i; j < i + size; j++) {
                        System.out.print(ar[j] + " ");
                    }
                    System.out.println();
                }
            }
        }

        // If no subarray with prime sum is found, print "None"
        if (!found) {
            System.out.println("None");
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
