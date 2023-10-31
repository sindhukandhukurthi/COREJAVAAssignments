package question3;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecuteAnnotationExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        Method[] methods = myClass.getClass().getDeclaredMethods();

       
        List<Method> annotatedMethods = new ArrayList<>();

        for (Method method : methods) {
            Execute executeAnnotation = method.getAnnotation(Execute.class);
            if (executeAnnotation != null) {
                annotatedMethods.add(method);
            }
        }

        // Sort methods based on their sequence
        Collections.sort(annotatedMethods, (m1, m2) -> {
            Execute e1 = m1.getAnnotation(Execute.class);
            Execute e2 = m2.getAnnotation(Execute.class);
            return Integer.compare(e1.sequence(), e2.sequence());
        });

        // Invoke methods in the specified sequence
        for (Method method : annotatedMethods) {
            try {
                method.invoke(myClass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

