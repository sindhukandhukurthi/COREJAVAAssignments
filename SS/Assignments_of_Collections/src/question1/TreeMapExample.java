package question1;

import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for sorting in descending order
        TreeMap<Long, Contact> phoneBook = new TreeMap<>(Collections.reverseOrder());

        // Add contacts to the TreeMap
        phoneBook.put(1234567890L, new Contact(1234567890L, "John", "john@example.com", Contact.Gender.MALE));
        phoneBook.put(9876543210L, new Contact(9876543210L, "Alice", "alice@example.com", Contact.Gender.FEMALE));
        phoneBook.put(5555555555L, new Contact(5555555555L, "Bob", "bob@example.com", Contact.Gender.MALE));

        // a) Fetch all the keys and print them
        System.out.println("Phone Numbers:");
        for (Long phoneNumber : phoneBook.keySet()) {
            System.out.println(phoneNumber);
        }

        // b) Fetch all the values and print them
        System.out.println("\nContacts:");
        for (Contact contact : phoneBook.values()) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Gender: " + contact.getGender());
            System.out.println();
        }

        // c) Print all key-value pairs
        System.out.println("\nPhone Book Entries:");
        for (Entry<Long, Contact> entry : phoneBook.entrySet()) {
            System.out.println("Phone Number: " + entry.getKey());
            Contact contact = entry.getValue();
            System.out.println("Name: " + contact.getName());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Gender: " + contact.getGender());
            System.out.println();
        }
    }
}
