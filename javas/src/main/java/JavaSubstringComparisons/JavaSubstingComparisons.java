package JavaSubstringComparisons;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class JavaSubstingComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        String minSubstring = s.substring(0,k);
        String maxSubstring = s.substring(0,k);

        for (int i = 1; i < s.length()-k+1; i++) {
            String sub = s.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring+"\n"+maxSubstring);
    }
}