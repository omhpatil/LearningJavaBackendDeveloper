package A00CODEFORCES;

import java.util.Scanner;

public class CF014_StringTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if("aeiou".indexOf(ch)==-1 && Character.isLetter(ch)){
                System.out.print("."+ch);
            }
        }
    }
}
