package String;

public class CapitalizeFirstLetterString {
    public static void main(String[] args) {
        String str = "java backend developer";
        String strr = "";

        String[] str1 = new String[str.length()];
        str1 = str.split(" ");

        for(String data : str1){
            strr += data.substring(0, 1).toUpperCase() + data.substring(1) + " ";        }

        System.out.println(strr.trim());


    }
}
