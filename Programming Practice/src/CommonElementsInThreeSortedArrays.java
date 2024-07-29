import java.util.Scanner;

public class CommonElementsInThreeSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sizes of the three arrays
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // Read elements of the first array
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Read elements of the second array
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Read elements of the third array
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        sc.close();

        // Find common elements and store them in an array
        int[] commonElements = findCommonElements(arr1, arr2, arr3);

        // Print the result
        if (commonElements.length == 0) {
            System.out.println("No common elements.");
        } else {
            for (int element : commonElements) {
                System.out.print(element + " ");
            }
        }
    }

    private static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        int size = Math.min(arr1.length, Math.min(arr2.length, arr3.length));
        int[] tempResult = new int[size];
        int index = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // Add element to tempResult if it's the first element or not a duplicate
                if (index == 0 || tempResult[index - 1] != arr1[i]) {
                    tempResult[index] = arr1[i];
                    index++;
                }
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        // Manually create the final result array with the exact size needed
        int[] result = new int[index];
        for (int idx = 0; idx < index; idx++) {
            result[idx] = tempResult[idx];
        }

        return result;
    }
}
