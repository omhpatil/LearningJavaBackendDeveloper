package A00CODEFORCES;

import java.util.Arrays;
import java.util.Scanner;

public class CF021_TheNewYearMeetingFriends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] friends = new int[3];
        friends[0] = sc.nextInt();
        friends[1] = sc.nextInt();
        friends[2] = sc.nextInt();

        Arrays.sort(friends);

        int median = friends[1];
        int minDistance = Math.abs(friends[0] - median) +
                Math.abs(friends[1] - median) +
                Math.abs(friends[2] - median);

        System.out.println(minDistance);

    }
}
