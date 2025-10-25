package Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] arr1 = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = i;
        }

        System.out.print("First Array Element: ");
        for (int element : arr) {
            System.out.print(element + ", ");
        }

        System.out.println();

        System.out.print("Second Array Element: ");
        for (int element : arr1) {
            System.out.print(element + ", ");
        }
    }
}
