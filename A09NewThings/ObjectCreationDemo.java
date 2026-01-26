package A09NewThings;

import java.lang.reflect.Constructor;

class Users implements Cloneable {
    String name = "Om";

    // default constructor
    public Users() {
        System.out.println("Constructor called");
    }

    // copy constructor
    public Users(Users other) {
        this.name = other.name;
        System.out.println("Copy constructor called");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCreationDemo {

    public static void main(String[] args) throws Exception {

        // 1️⃣ Using NEW keyword
        Users u1 = new Users();
        System.out.println("u1 created using new");

        // 2️⃣ Using Reflection (Class.forName) ✅ FIXED
        Class<?> c = Class.forName("A09NewThings.Users");
        Users u2 = (Users) c.getDeclaredConstructor().newInstance();
        System.out.println("u2 created using reflection");

        // 3️⃣ Using clone()
        Users u3 = (Users) u1.clone();
        System.out.println("u3 created using clone");

        // 4️⃣ Using copy constructor
        Users u4 = new Users(u1);
        System.out.println("u4 created using copy constructor");

        // 5️⃣ Using Constructor class (reflection)
        Constructor<Users> constructor = Users.class.getConstructor();
        Users u5 = constructor.newInstance();
        System.out.println("u5 created using Constructor.newInstance()");
    }
}
