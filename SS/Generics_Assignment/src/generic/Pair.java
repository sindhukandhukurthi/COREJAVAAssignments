package generic;
import java.util.Date;
import java.util.Scanner;

public class Pair<K, V> {
    private K key;
    private V value;

    public void setKey(K key) {
        if (key instanceof String) {
            this.key = key;
        } else {
            System.out.println("Invalid data type for key. Only String is allowed.");
        }
    }

    public void setValue(V value) {
        if (value instanceof String || (value instanceof Date && key instanceof String)) {
            this.value = value;
        } else {
            System.out.println("Invalid data type for value.");
            System.out.println("Scenario b: Only String for key and Date for value are allowed.");
            System.out.println("Scenario a: Only String for key and value are allowed.");
        }
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scenario a: String key and String value
        Pair<String, String> pairA = new Pair<>();
        System.out.println("Enter a String key for scenario a:");
        String keyA = scanner.nextLine();
        System.out.println("Enter a String value for scenario a:");
        String valueA = scanner.nextLine();
        pairA.setKey(keyA);
        pairA.setValue(valueA);

        // Scenario b: String key and Date value
        Pair<String, Date> pairB = new Pair<>();
        System.out.println("Enter a String key for scenario b:");
        String keyB = scanner.nextLine();
        pairB.setKey(keyB);
        Date valueB = new Date();
        pairB.setValue(valueB);

        System.out.println("Scenario a - Pair (String key, String value):");
        System.out.println("Key: " + pairA.getKey());
        System.out.println("Value: " + pairA.getValue());

        System.out.println("Scenario b - Pair (String key, Date value):");
        System.out.println("Key: " + pairB.getKey());
        System.out.println("Value: " + pairB.getValue());

        scanner.close();
    }
}
