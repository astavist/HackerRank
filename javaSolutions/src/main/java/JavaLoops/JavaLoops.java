package JavaLoops;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.println(n + " x " + i +" = "+ (n*i));
        }
    }

}
