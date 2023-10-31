package question1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
}

class MyTestClass {
    @Test
    void nonStaticTestMethod() {
        System.out.println("This is a non-static test method.");
    }

    @Test
    static void staticTestMethod() {
        System.out.println("This is a static test method.");
    }
}

public class CustomAnnotationExample {
    public static void main(String[] args) {

        Class<MyTestClass> testClass = MyTestClass.class;
        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                System.out.println("Test method found: " + method.getName());
                if (method.isSynthetic()) {
                    System.out.println("Static method not allowed.");
                } else {
                    System.out.println("Method is non-static.");
                }
            }
        }
    }
}
