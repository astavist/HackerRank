package main.java.org.example;

import java.util.Scanner;

public class JavaLoopsTwo {
    public static void main(String[] args) {
        int a=1,b=1,c,n=1;
        Scanner input = new Scanner(System.in);
        c =input.nextInt();
        for (int j=0;j<c;j++) {
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            int cross=1,total1=0,total2=0,plus=1;
            for (int i=1;i<=n;i++) {
                cross *= plus;
                plus = 2;
                total1+=b*cross;
                total2 = total1 + a;
                System.out.print(total2 + " ");
            }
            System.out.println("");
        }
    }
}
