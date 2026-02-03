package A00CODEFORCES;

import java.util.Scanner;

public class CF007_PetyaAndStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();

//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();
        
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("0");
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }

    }
}
