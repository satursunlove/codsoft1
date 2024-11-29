import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class STUDENTGRADECALCULATOR {

    // Method to calculate grade based on average percentage
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C";
        } else if (averagePercentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Map<String, Double> subjectMarks = new HashMap<>();
        double totalMarks = 0;

        // Input: Subject names and marks
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            String subjectName = scanner.nextLine();
            System.out.print("Enter marks for " + subjectName + ": ");
            double mark = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            subjectMarks.put(subjectName, mark);
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / subjects;

        // Calculate grade
        String grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        for (Map.Entry<String, Double> entry : subjectMarks.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage));
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
