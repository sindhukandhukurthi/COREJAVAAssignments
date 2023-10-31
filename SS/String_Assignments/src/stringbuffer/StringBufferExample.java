package stringbuffer;

import java.util.*;
public class StringBufferExample{

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        

        // Append the strings

        buffer.append("StringBuffer");

        buffer.append(" is a peer class of String");

        buffer.append(" that provides much of ");

        buffer.append("the functionality of strings");



        // Convert the StringBuffer to a String and print it

        String result = buffer.toString();

        System.out.println(result);

    }}