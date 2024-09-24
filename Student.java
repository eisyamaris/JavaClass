import java.util.Scanner;

public class Student {
    private String name;
    private int MathScore;
    private int ScienceScore;
    private int EnglishScore;
    private double averageScore;

    // Constructor
    public Student(String name, int ms, int ss, int es, double aS) {
        this.name = name;
        this.MathScore = MathScore;
        this.ScienceScore = ScienceScore;
        this.EnglishScore = EnglishScore;
        this.averageScore = averageScore;
    }

    public void setStudent(String n, int m, int s, int e, double aS){
        name = n;
        MathScore = m;
        ScienceScore = s;
        EnglishScore = e;
        averageScore = aS;
    }

    // Getter 
    public String getName() {
        return name;
    }

    public int getMathScore(){
        return MathScore;
    }

    public int getScienceScore(){
        return ScienceScore;
    }

    public int getEnglishScore(){
        return EnglishScore;
    }


    public double calculateAverage() {
        int total = 0;

        total = getMathScore() + getScienceScore() + getEnglishScore();
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

    public String display(){
        return "\nName" + name + "\nAverage Score " + calculateAverage() + "\nGrade: " + assignGrade();
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<students.length; i++){
        System.out.println("Enter name:");
        String setName = input.next();

        System.out.println("Enter Math Score");
        int setMath = input.nextInt();

        System.out.println("Enter Science Score");
        int setScience = input.nextInt();

        System.out.println("Enter English Score");
        int setEnglish = input.nextInt();

        double average = students[i].calculateAverage();
        //char grade = students[i].assignGrade();

        students[i] =  new Student(setName, setMath, setScience, setEnglish, average);

            System.out.println("\n");
            System.err.println(students[i].display());
            /*System.out.println("Name:" + students[i].getName());
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);*/
        }

        input.close();
    }
}
