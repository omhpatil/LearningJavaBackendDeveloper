package A00CODEFORCES;

public class CF001_BoyOrGirl {
    public static void main(String[] args) {
        String str = "wjmzbmr";
        char arr[] = str.toCharArray();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}



