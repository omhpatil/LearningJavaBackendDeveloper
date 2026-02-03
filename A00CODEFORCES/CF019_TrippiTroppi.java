package A00CODEFORCES;

import java.util.Scanner;

public class CF019_TrippiTroppi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        while (num-- > 0) {
            String str = sc.nextLine();

            String strArr[] = str.split(" ");

            for (String s : strArr) {
                System.out.print(s.charAt(0));
            }
            System.out.println();
        }
    }
}
