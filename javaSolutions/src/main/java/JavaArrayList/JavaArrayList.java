package JavaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<Integer>();
            int d = input.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(input.nextInt());
            }
            lists.add(line);
        }
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (y > lists.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lists.get(x - 1).get(y - 1));
            }
        }

        input.close();
    }
}
