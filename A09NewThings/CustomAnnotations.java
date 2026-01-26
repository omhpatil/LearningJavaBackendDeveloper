package A09NewThings;

import java.lang.annotation.*;
import java.lang.reflect.*;

// 1️⃣ Marker Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Important {
}

// 2️⃣ Single-value Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Role {
    String value();
}

// 3️⃣ Multi-value Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info {
    String author();

    int version();
}

// 4️⃣ Default-value Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Config {
    String environment() default "DEV";
}

// Interfaces
interface Service {
    void execute();
}

interface Logger {
    void log();
}

// One class implementing multiple interfaces and using all annotations
@Important
@Role("ADMIN")
@Info(author = "Om", version = 1)
@Config(environment = "PROD")
class Application implements Service, Logger {

    public void execute() {
        System.out.println("Executing service logic");
    }

    public void log() {
        System.out.println("Logging application data");
    }
}

// Main class to read annotations
public class CustomAnnotations {

    public static void main(String[] args) {

        Class<Application> c = Application.class;

        if (c.isAnnotationPresent(Important.class)) {
            System.out.println("Important annotation present");
        }

        Role role = c.getAnnotation(Role.class);
        System.out.println("Role: " + role.value());

        Info info = c.getAnnotation(Info.class);
        System.out.println("Author: " + info.author());
        System.out.println("Version: " + info.version());

        Config config = c.getAnnotation(Config.class);
        System.out.println("Environment: " + config.environment());

        Application app = new Application();
        app.execute();
        app.log();
    }
}
