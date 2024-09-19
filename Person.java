public class Person {
    private double firstGPA = 3.2;
    private double secondGPA = 3.1;
    private double thirdGPA = 3.4;


    public Person(double firstGPA, double secondGPA, double thirdGPA){
        this.firstGPA = firstGPA;
        this.secondGPA = secondGPA;
        this.thirdGPA = thirdGPA;
    }

    public static void main(String[]args){
        double firstGPA = 3.2;
        double secondGPA = 3.1;
        double thirdGPA = 3.4;

        double avgGPA = (firstGPA + secondGPA + thirdGPA)/3;
        System.out.println(avgGPA);

        
    }
}
