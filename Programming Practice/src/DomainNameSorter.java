import java.util.*;

public class DomainNameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input line containing the comma-separated URLs
        String input = scanner.nextLine();

        // Split the input into individual URLs
        String[] urls = input.split(",");

        // Extract the domain names from the URLs
        List<String> domainNames = new ArrayList<>();
        for (String url : urls) {
            String domain = extractDomain(url);
            domainNames.add(domain);
        }

        // Sort the domain names by length and then alphabetically
        Collections.sort(domainNames, new Comparator<String>() {
            @Override
            public int compare(String d1, String d2) {
                if (d1.length() != d2.length()) {
                    return d1.length() - d2.length();
                } else {
                    return d1.compareTo(d2);
                }
            }
        });

        // Print the sorted domain names, each on a new line
        for (String domain : domainNames) {
            System.out.println(domain);
        }

        scanner.close();
    }

    // Method to extract the domain name from a URL
    private static String extractDomain(String url) {
        // Remove the "www." prefix if it exists
        if (url.startsWith("www.")) {
            url = url.substring(4);
        }
        // Remove the ".com" suffix
        if (url.endsWith(".com")) {
            url = url.substring(0, url.length() - 4);
        }
        return url;
    }
}
