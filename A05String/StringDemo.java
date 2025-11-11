package A05String;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Om");
        String s2 = "Om";
        String s3 = "Om";
        String s4 = new String("Om");

        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));

        String str1 = "Java";
        String str2 = str1.concat(" Fullstack"); // for this example refer below table to see where object is created

        StringBuilder sb1 = new StringBuilder(str1);
        sb1.append(" FullStack Developer");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(str1);
        sb2.append(" Backend Developer");
        System.out.println(sb2);
    }
}


//        | String            | Location | How Created           | Notes                                       |
//        | ----------------- | -------- | --------------------- | ------------------------------------------- |
//        | `"Java"`          | SCP      | String literal        | Reused if same literal exists               |
//        | `"Fullstack"`     | SCP      | String literal        | Stored once in SCP                          |
//        | `"JavaFullstack"` | Heap     | Created by `concat()` | New object (immutable behavior)             |
//        | `s1`              | Stack    | Reference             | Points to `"Java"` in SCP                   |
//        | `s2`              | Stack    | Reference             | Points to new heap object `"JavaFullstack"` |


// String is a class in java which is sequence of characters
// Way can string using two ways,
// 1. Using String Literal
// 2. Using New Keyword

// in case of primitives it compares values
// in case of non-primitives it compares reference


// String Buffer(Synchronised): Mutable, Thread Safe --> Slow
// String Builder(Not-Synchronised): Mutable, Not-Thread Safe --> Faster

