package question2;

public class VarExample {
    public static void main(String[] args) {
        // Error: Cannot use var without explicit initialization
        var number;
        number = 10;
    }
}


public class VarExample {
    public static void main(String[] args) {
        // Error: Incompatible types
        var result = "Hello, World!";
        result = 42; // Incompatible data types
    }
}



public class VarExample {
    public static void main(String[] args) {
        // Error: var cannot be used in method parameter
        printMessage(var message);
    }
 public static void printMessage(String message) {
        System.out.println(message);
    }
}



public class VarExample {
    // Error: var cannot be used for instance variables
    var instanceVariable;
}



public class VarExample {
    public static void main(String[] args) {
        // Error: Array type required
        var numbers = new int[5];
    }
}



public class VarExample {
    public static void main(String[] args) {
        // Error: Array type required
        var numbers = new int[5];
    }
}
