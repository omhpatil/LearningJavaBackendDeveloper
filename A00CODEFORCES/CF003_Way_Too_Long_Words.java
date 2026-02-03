package A00CODEFORCES;

import java.util.Scanner;

public class CF003_Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            int length = str.length();

            if (length <= 10) {
                System.out.println(str);
            } else {
                System.out.println(str.charAt(0) + String.valueOf(length - 2) + str.charAt(length - 1));
            }
        }
    }
}
