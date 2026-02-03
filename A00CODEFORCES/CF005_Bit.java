package A00CODEFORCES;

import java.util.Scanner;

public class CF005_Bit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String str;

        int x = 0;

        for (int i = 0; i < num; i++) {
            str = sc.next();

            if (str.equals("++X")) {
                ++x;
            } else if (str.equals("X++")) {
                x++;
            } else if (str.equals("X--")) {
                x--;
            } else if (str.equals("--X")) {
                --x;
            }
        }

        System.out.println(x);
    }
}
