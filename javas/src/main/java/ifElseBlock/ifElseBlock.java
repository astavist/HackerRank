package ifElseBlock;

import java.util.Scanner;

public class ifElseBlock {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");
        }
        if (n % 2 == 0) {
            if (n > 1 && n < 6) {
                System.out.println("Not Weird");
            }
            else if (n > 5 && n < 21) {
                System.out.println("Weird");
            }
            else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
