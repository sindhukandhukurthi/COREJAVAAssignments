package stringbuffer;
import java.util.*;

public class StringBufferEx2 {

    public static void main(String[] args) 

    {
        String originalString = "It is used to _ at the specified index position";
        StringBuffer stringBuffer = new StringBuffer(originalString);
        String textToInsert = "insert text";
        int indexToInsert = originalString.indexOf('_');
        stringBuffer.insert(indexToInsert, textToInsert);

        System.out.println(stringBuffer.toString());

    }

}