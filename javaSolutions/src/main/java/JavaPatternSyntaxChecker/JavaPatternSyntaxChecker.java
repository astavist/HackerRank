package JavaPatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        while (n>0){
            String pattern = input.nextLine();
            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Throwable t){
                System.out.println("Invalid");
            }
            n--;
        }
    }
}
