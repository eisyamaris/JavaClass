public class Student2 {
    private String name;
    private int[] scores;
    private double averageScore;

    // Constructor
    public Student2(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // Getter 
    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public double calculateAverage() {
        int total = 0;
        for (int score : scores) {
            total = total + score;
        }
        averageScore = total / 3;
        return averageScore;
    }

    public char assignGrade() {
        char grade = ' ';
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80 && averageScore <=89) {
            grade = 'B';
        } else if (averageScore >= 70 && averageScore <= 79) {
            grade = 'C';
        } else if (averageScore >= 60 && averageScore <=69) {
            grade = 'D';
        } else if (averageScore < 60){
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Student2[] students = new Student2[5];
        
        students[0] = new Student2("Khairina", new int[]{85, 78, 92});
        students[1] = new Student2("Lissa", new int[]{90, 88, 94});
        students[2] = new Student2("Johan", new int[]{75, 80, 70});
        students[3] = new Student2("Jazli", new int[]{65, 60, 72});
        students[4] = new Student2("Jufri", new int[]{55, 48, 62});

        for (Student2 student : students) {
            double average = student.calculateAverage();
            char grade = student.assignGrade();
            
            System.out.println("\n");
            System.out.println("Name:" + student.getName());
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
        }
    }
}
