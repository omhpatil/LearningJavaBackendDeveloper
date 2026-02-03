package A00CODEFORCES;

import java.util.Scanner;

public class CF004_Team {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a, b, c;
        int count = 0;

        for (int i = 0; i < num; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a + b + c >= 2) {
                count++;
            }
        }

        System.out.println(count);

    }
}
