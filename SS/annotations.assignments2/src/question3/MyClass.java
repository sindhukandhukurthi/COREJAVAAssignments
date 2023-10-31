package question3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
    int sequence() default 0;
}

class MyClass {
    @Execute(sequence = 2)
    public void myMethod1() {
        System.out.println("myMethod1 executed");
    }

    @Execute(sequence = 1)
    public void myMethod2() {
        System.out.println("myMethod2 executed");
    }

    @Execute(sequence = 3)
    public void myMethod3() {
        System.out.println("myMethod3 executed");
    }
}