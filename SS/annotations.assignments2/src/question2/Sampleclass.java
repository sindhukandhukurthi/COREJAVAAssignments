package question2;

public class Sampleclass {
    public static void main(String[] args) {
        //  class-level annotation
        Info classInfo = SampleClass.class.getAnnotation(Info.class);
        System.out.println("Class Author: " + classInfo.Author());
        System.out.println("Class Date: " + classInfo.Date());
        System.out.println("Class Version: " + classInfo.Version());
        System.out.println("Class Description: " + classInfo.Description());
        
        // field-level annotation
        Info fieldInfo = null;
        try {
            fieldInfo = SampleClass.class.getDeclaredField("sampleProperty").getAnnotation(Info.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("Property Author: " + fieldInfo.Author());
        System.out.println("Property Date: " + fieldInfo.Date());
        System.out.println("Property Version: " + fieldInfo.Version());
        System.out.println("Property Description: " + fieldInfo.Description());
        
        // Get method-level annotation
        Info methodInfo = null;
        try {
            methodInfo = SampleClass.class.getDeclaredMethod("sampleMethod").getAnnotation(Info.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("Method Author: " + methodInfo.Author());
        System.out.println("Method Date: " + methodInfo.Date());
        System.out.println("Method Version: " + methodInfo.Version());
        System.out.println("Method Description: " + methodInfo.Description());
    }
}
