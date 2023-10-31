package question2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface Info {
    String AuthorID();

    String Author() default "";

    String Supervisor() default "";

    String Date();

    String Time();

    int Version();

    String Description() default "";
}

@Info
   ( AuthorID = "001",
    Author = "John",
    Date = "2022-1-15",
    Time = "10:30 AM",
    Version = 1,
    Description = "This is a sample class.")

class SampleClass {
    @Info(
        AuthorID = "002",
        Date = "2022-1-15",
        Time = "11:45 AM",
        Version = 2,
        Description = "This is a sample property."
    )
    private int sampleProperty;

    @Info(
        AuthorID = "003",
        Date = "2022-1-15",
        Time = "12:15 PM",
        Version = 1,
        Description = "This is a sample method."
    )
    public void sampleMethod() {
        
    }
}
