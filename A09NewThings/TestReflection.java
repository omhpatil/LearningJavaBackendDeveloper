package A09NewThings;

import java.lang.reflect.Field;

class User {
    private String password = "secret123";
}

// Basically reflection is used to access private fields.

public class TestReflection {
    public static void main(String[] args) throws Exception {

        User user = new User();

        // 1️⃣ Get Class object
        Class<?> c = user.getClass();

        // 2️⃣ Get private field
        Field field = c.getDeclaredField("password");

        // 3️⃣ BREAK Java access rules
        field.setAccessible(true);

        // 4️⃣ Read private value
        String value = (String) field.get(user);

        System.out.println(value);
    }
}
