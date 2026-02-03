package A00CODEFORCES;

import java.util.Scanner;

public class CF006_NextRound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int key = sc.nextInt();

        int count = 0;

        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= arr[key - 1] && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
