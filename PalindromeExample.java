import java.io.*;
import java.util.*;

public class PalindromeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String normal = s1.toLowerCase();
        StringBuilder reversed = new StringBuilder(normal);
        reversed.reverse();
        if(normal.equals(reversed.toString())) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not a Palindrome");
        }
 
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}