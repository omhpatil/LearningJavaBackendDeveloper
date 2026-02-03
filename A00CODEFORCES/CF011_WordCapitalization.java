package A00CODEFORCES;

import java.util.Scanner;

public class CF011_WordCapitalization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(str);

    }
}
