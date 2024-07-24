package tai;

import java.util.Scanner;

public class CommonOddElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int B[] = new int[m];
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        int oddA[] = filterOdd(A);
        int[] oddB = filterOdd(B);

        int[] res = oddAndCommonelem(oddA, oddB);
        if (res.length != 0) {
            for (int k = 0; k < res.length; k++) {
                System.out.print(res[k] + " ");
            }
        } else {
            System.out.print("No common odd elements found.");
        }

        scanner.close();
    }

    private static int[] filterOdd(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                count++;
            }
        }

        int res[] = new int[count];
        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                res[k] = ar[i];
                k++;
            }
        }

        return res;
    }

    private static int[] oddAndCommonelem(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[Math.min(n1, n2)];

        while (i < n1 && j < n2) {
            if (A[i] == B[j]) {
                if (k == 0 || res[k - 1] != A[i]) {
                    res[k] = A[i];
                    k++;
                }
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] op = new int[k];
        for (int l = 0; l < k; l++) {
            op[l] = res[l];
        }
        return op;
    }
}
