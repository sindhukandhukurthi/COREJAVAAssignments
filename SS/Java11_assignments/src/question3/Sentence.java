package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jumps over the lazy dog";
        
        // Split the sentence into words and store them in an ArrayList
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        
        // Convert the ArrayList to an array
        String[] wordArray = wordList.toArray(new String[wordList.size()]);
        
        // Print the array
        System.out.println("Array from ArrayList: " + Arrays.toString(wordArray));
    }
}
