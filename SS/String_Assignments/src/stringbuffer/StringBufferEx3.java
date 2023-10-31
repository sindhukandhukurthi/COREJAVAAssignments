package stringbuffer;


public class StringBufferEx3 {

    public static void main(String[] args) {

        String originalString = "This method returns the reversed object on which it was called";
        // Create a StringBuffer and initialize it with the original string
        StringBuffer stringBuffer = new StringBuffer(originalString);
        // Use the reverse() method to reverse the string
        stringBuffer.reverse();
        // Convert the StringBuffer back to a regular string
        String reversedString = stringBuffer.toString();
        // Print the reversed string
        System.out.println(reversedString);

    }

}



