package Tasks;

import java.util.Scanner;

/*
Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
           :- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites
*/
public class Q032_Domain_Type_Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website url");
        String url = sc.nextLine();

        String websiteType = "";

        if (url.endsWith(".com")) {
            websiteType = "Commercial website";
        } else if (url.endsWith(".org")) {
            websiteType = "Non-profit organization";
        } else if (url.endsWith(".edu")) {
            websiteType = "Educational institution";
        } else if (url.endsWith(".gov")) {
            websiteType = "Government website";
        } else if (url.endsWith(".net")) {
            websiteType = "Network-related website";
        } else if (url.endsWith(".info")) {
            websiteType = "Informational website";
        } else {
            System.out.println("Unknown or other types of websites ");
            System.exit(0);
        }
        System.out.println("The website type is: " + websiteType);
    }
}
