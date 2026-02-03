package A00CODEFORCES;

import java.util.Scanner;

public class CF002_Watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();

        if (w > 2 && w % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
