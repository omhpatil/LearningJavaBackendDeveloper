package A00CODEFORCES;

import java.util.Arrays;
import java.util.Scanner;

public class CF020_AmusingJoke {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        str2 = str1 + str2;

        char ch1[] = str2.toCharArray();
        char ch2[] = str3.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



