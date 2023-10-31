package stringbuilder;

public class StringBuilderEx {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        // Append the strings
        builder.append("StringBuffer");
        builder.append(" is a peer class of String");
        builder.append(" that provides much of ");
        builder.append("the functionality of strings");
        // Convert the StringBuilder to a String and print it
        String result = builder.toString();
        System.out.println(result);

    }

}