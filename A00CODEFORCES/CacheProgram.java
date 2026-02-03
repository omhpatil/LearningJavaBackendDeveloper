package A00CODEFORCES;

import java.util.Scanner;

public class CacheProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5;
        int[] cache = new int[size];
        int next = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter search term " + i + ": ");
            int a = sc.nextInt();
            cache[next] = a;
            next = (next + 1) % size;
        }

        for(int i=0; i<cache.length; i++){
            System.out.println(cache[i]);
        }

    }
}
