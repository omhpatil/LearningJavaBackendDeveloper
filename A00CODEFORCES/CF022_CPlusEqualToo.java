package A00CODEFORCES;

import java.util.Scanner;

public class CF022_CPlusEqualToo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter value of a: ");
            int a = sc.nextInt();
            System.out.print("Enter value of b: ");
            int b = sc.nextInt();
            System.out.print("Enter value of n: ");
            int n = sc.nextInt();
            int count = 0;

            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                    count++;
                } else {
                    b += a;
                    count++;
                }
            }
            System.out.println("Number of operations required " + count);
        }
    }
}
