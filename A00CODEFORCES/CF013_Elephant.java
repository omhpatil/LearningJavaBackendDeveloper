package A00CODEFORCES;

import java.util.Scanner;

public class CF013_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int steps = 0;
        int position = 0;

        while (position < x) {
            if (position + 5 <= x) {
                position += 5;
            } else if (position + 4 <= x) {
                position += 4;
            } else if (position + 3 <= x) {
                position += 3;
            } else if (position + 2 <= x) {
                position += 2;
            } else {
                position += 1;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
