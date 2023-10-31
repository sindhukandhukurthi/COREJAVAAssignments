
import java.util.*;
public class Javastringpool {

    public static void main(String[] args) {

        String originalString = "Java String pool refers to a collection of Strings which are stored in heap memory";

        String testString = "java string pool refers to collection of strings which are stored in heap memory";

        
        // a. Print the string in lowercase
        System.out.println("a. Lowercase: " + originalString.toLowerCase());
        
        
        // b. Print the string in uppercase
        System.out.println("b. Uppercase: " + originalString.toUpperCase());
        
        
        
        // c. Replace 'a' character with $
        String replacedString = originalString.replace('a', '$');
        System.out.println("c. Replaced: " + replacedString);



        // d. Check if the original string contains the word "collection"
        boolean containsCollection = originalString.contains("collection");
        System.out.println("d. Contains 'collection': " + containsCollection);



        // e. Check if the test string matches the original
         boolean matches = originalString.equalsIgnoreCase(testString);
         System.out.println("e. Matches original: " + matches);


        // f. Check if the strings are equal using equals method
        boolean isEqual = originalString.equals(testString);
        System.out.println("f. Strings are equal: " + isEqual);

    }

}

