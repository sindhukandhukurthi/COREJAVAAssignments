package question4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentListReader {
    public static void main(String[] args) {
        // File path
        String filePath = "C:\\Users\\PRADEEP\\Desktop\\StudentList.txt";

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Filter out lines that are not empty and print them
            long studentCount = lines.stream()
                    .filter(line -> !line.trim().isEmpty())
                    .peek(System.out::println)
                    .count();

            // Print the total count of students
            System.out.println("Total count of students: " + studentCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
