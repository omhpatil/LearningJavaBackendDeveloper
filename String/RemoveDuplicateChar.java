package String;

public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String str = "aaabbc";
        String s="";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)!=str.charAt(i+1)){
                s += str.charAt(i);
            }
        }
        s += str.charAt(str.length() - 1); // to add last character
        System.out.println(s);
    }
}
