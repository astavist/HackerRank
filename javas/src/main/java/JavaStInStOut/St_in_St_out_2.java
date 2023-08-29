package JavaStInStOut;

import java.util.Scanner;

class St_in_St_out_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        String c = input.nextLine();
        c = input.nextLine();
        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
