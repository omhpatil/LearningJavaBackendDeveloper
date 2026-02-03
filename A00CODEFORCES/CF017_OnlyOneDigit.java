package A00CODEFORCES;

import java.util.Scanner;

public class CF017_OnlyOneDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        while(limit-->0){
            int num = sc.nextInt();
            int minDigit=Integer.MAX_VALUE;

            int temp = num;
            while(temp>0){
                int digit = temp % 10;
                if(digit<minDigit){
                    minDigit=digit;
                }
                temp/=10;
            }
            System.out.println(minDigit);
        }

    }
}

