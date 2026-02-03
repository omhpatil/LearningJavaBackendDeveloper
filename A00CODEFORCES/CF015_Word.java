package A00CODEFORCES;

import java.util.Scanner;

public class CF015_Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int Uppercase = 0;
        int Lowercase = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                Uppercase++;
            } else {
                Lowercase++;
            }
        }

        if (Uppercase > Lowercase) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }
}
