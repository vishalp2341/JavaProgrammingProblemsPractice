import java.util.Scanner;
import java.util.TreeSet;

public class DomainNameSort {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the URL string separated by commas:");
        String s = sc.nextLine();
        sc.close();

        // Split the input string into an array of URLs
        String[] ar = s.split(",");

        // Trim and extract domains
        String[] domains = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            domains[i] = domain(ar[i].trim());
        }

        // Sort the domains using custom sort by length and then alphabetically
        bubbleSortByLength(domains);

        // Add sorted domains to the TreeSet
        for (String domain : domains) {
            set.add(domain);
        }

        // Print the sorted unique domains
        for (String x : set) {
            System.out.println(x);
        }
    }

    // Bubble Sort Method for sorting strings by length and then alphabetically
    private static void bubbleSortByLength(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int lengthCompare = Integer.compare(arr[j].length(), arr[j + 1].length());
                if (lengthCompare > 0 || (lengthCompare == 0 && arr[j].compareTo(arr[j + 1]) > 0)) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Domain Extraction Method
    private static String domain(String s) {
        if (s.startsWith("www.")) {
            s = s.substring(4);
        }
        if (s.endsWith(".com")) {
            s = s.substring(0, s.length() - 4);
        }
        return s;
    }
}
