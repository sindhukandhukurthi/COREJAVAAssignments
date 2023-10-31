package generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomHashMap {
    public static void main(String[] args) {
        Map<Integer, Double> randomMap = new HashMap<>();

        // Generate and store 10 random key-value pairs
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomKey = random.nextInt(100);  // Generate a random integer key (0 to 99)
            double randomValue = random.nextDouble() * 100.0;  // Generate a random double value (0.0 to 99.9999)

            randomMap.put(randomKey, randomValue);
        }

        // Print the data stored in the HashMap
        System.out.println("Key-Value Pairs in the HashMap:");
        for (Map.Entry<Integer, Double> entry : randomMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}