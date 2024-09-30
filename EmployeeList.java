import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeList {
    
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    // Constructor initializes allowances to zero
    public EmployeeList(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0.0;  // Initialized to zero
        this.transportAllowance = 0.0;  // Initialized to zero
        this.bonus = 0.0;  // Initialized to zero
    }

    // Method to set employee allowances
    public void setAllowances(double healthAllowance, double transportAllowance) {
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
    }

    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getHealthAllowance(){
        return healthAllowance;
    }

    public double getTransportAllowance(){
        return transportAllowance;
    }

    public double getBonus(){
        return bonus;
    }

    // Method to assign bonus based on salary
    public double assignBonus(){
        if(getBaseSalary() > 50000){
            bonus = getBaseSalary() * 0.1;
        }
        else if(getBaseSalary() >= 30000 && getBaseSalary() <= 50000){
            bonus = getBaseSalary() * 0.05;
        }
        else {
            bonus = 0;
        }
        return bonus;
    }

    // Method to calculate the total salary
    public double calculateTotalSalary(){
        totalSalary = getBaseSalary() + getHealthAllowance() + getTransportAllowance() + assignBonus();
        return totalSalary;
    }

    public String display(){
        return "\nName: " + name + "\nBase Salary: " + baseSalary;
    }

    public static void main(String[] args) {
        // Declare an ArrayList instead of an array
        ArrayList<Employee> empList = new ArrayList<>();

        // Adding Employee objects to the ArrayList
        empList.add(new Employee("Faree", 50000));
        empList.add(new Employee("Khai", 45000));
        empList.add(new Employee("Mai", 45000));
        empList.add(new Employee("Rara", 46000));
        empList.add(new Employee("Sab", 49000));

        // Setting the same allowances for all employees
        double commonHealthAllowance = 400;
        double commonTransportAllowance = 500;

        // Applying the same allowance to all employees
        for (Employee employee : empList) {
            employee.setAllowances(commonHealthAllowance, commonTransportAllowance);
        }

        // Assigning bonus to employees
        for(Employee employee : empList){
            employee.assignBonus();
        }

        // Predicate to check if the bonus is greater than 1000
        Predicate<Employee> isBonusGreaterThan1000 = e -> e.getBonus() > 1000;

        // Displaying the information
        for(Employee employee : empList){
            System.out.println(employee.display());
            System.out.println("Health Allowance: " + employee.getHealthAllowance());
            System.out.println("Transport Allowance: " + employee.getTransportAllowance());
            System.out.println("Bonus: " + employee.getBonus());
            System.out.println("Total Salary: " + employee.calculateTotalSalary());

            // Using the Predicate to check bonus
            if (isBonusGreaterThan1000.test(employee)) {
                System.out.println("Congrats!");
            }
        }
    }
}

/*Employee Pay Slip
 * --------------
 * Pay slip generated on 25-August-2024 12:19:45
 * Payment duration : 1 August 2024 until 31 August 2024
 * 
 * Employee Name : Fareesya
 * Base Salary : 
 * Health Allowance :
 * Transport Allowance :
 * Bonus : 
 * 
 * Congratulation!
 * 
 * Total Salary : 
 */