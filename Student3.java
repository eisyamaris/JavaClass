import java.util.Scanner;

public class Student3 {
    // Private fields for encapsulation
    private String name;
    private int[] scores;
    private double averageScore;

    // Constructor
    public Student3(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // Method to calculate the average score
    public double calculateAverage() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        this.averageScore = total / (double) scores.length;
        return this.averageScore;
    }

    // Method to assign a grade based on the average score
    public char assignGrade() {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        // Array to hold 5 students
        Student3[] students = new Student3[5];
        
        // Scanner for input
        Scanner scanner = new Scanner(System.in);
        
        // Loop to populate the array of students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            
            // Array to store 3 scores: Math, Science, English
            int[] scores = new int[3];
            System.out.println("Enter the Math score for " + name + ":");
            scores[0] = scanner.nextInt();
            System.out.println("Enter the Science score for " + name + ":");
            scores[1] = scanner.nextInt();
            System.out.println("Enter the English score for " + name + ":");
            scores[2] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            // Create a new student object and add it to the array
            students[i] = new Student3(name, scores);
        }
        
        // Loop to display each student's name, average score, and grade
        for (Student3 student : students) {
            double average = student.calculateAverage();
            char grade = student.assignGrade();
            System.out.println("Student: " + student.getName());
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("-------------");
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
