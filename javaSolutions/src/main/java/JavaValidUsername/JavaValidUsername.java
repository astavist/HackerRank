package JavaValidUsername;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaValidUsername {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;
        while (n-- > 0) {
            String userName = scanner.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scanner.close();
    }
}

class UsernameValidator{
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}
