package A00CODEFORCES;

import java.util.Scanner;

public class CF023_Games {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int host[] = new int[n];
        int guest[] = new int[n];

        for (int i = 0; i < n; i++) {
            host[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && guest[i] == host[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
