import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePaySlip {
    
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    public EmployeePaySlip(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0.0;
        this.transportAllowance = 0.0;
        this.bonus = 0.0;
    }

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

    public double calculateTotalSalary(){
        totalSalary = getBaseSalary() + getHealthAllowance() + getTransportAllowance() + assignBonus();
        return totalSalary;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePaySlip> empList = new ArrayList<>();

        empList.add(new EmployeePaySlip("Fareesya", 50000));
        empList.add(new EmployeePaySlip("Khai", 45000));
        empList.add(new EmployeePaySlip("Mai", 45000));
        empList.add(new EmployeePaySlip("Rara", 46000));
        empList.add(new EmployeePaySlip("Sab", 49000));

        double commonHealthAllowance = 400;
        double commonTransportAllowance = 500;

        for (EmployeePaySlip employee : empList) {
            employee.setAllowances(commonHealthAllowance, commonTransportAllowance);
        }

        for(EmployeePaySlip employee : empList){
            employee.assignBonus();
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String formattedDate = now.format(dateFormatter);

        String paymentStartDate = "1 August 2024";
        String paymentEndDate = "31 August 2024";

        Predicate<EmployeePaySlip> isBonusGreaterThan1000 = e -> e.getBonus() > 1000;

        for(EmployeePaySlip employee : empList) {
            System.out.println("\nEmployee Pay Slip");
            System.out.println("-------------------");
            System.out.println("Pay slip generated on " + formattedDate);
            System.out.println("Payment duration: " + paymentStartDate + " until " + paymentEndDate);
            System.out.println();
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Base Salary: " + employee.getBaseSalary());
            System.out.println("Health Allowance: " + employee.getHealthAllowance());
            System.out.println("Transport Allowance: " + employee.getTransportAllowance());
            System.out.println();

            System.out.println("Bonus: " + employee.getBonus());

            if (isBonusGreaterThan1000.test(employee)) {
                System.out.println("Congratulation on your bonus!");
            }

            System.out.println("Total Salary: " + employee.calculateTotalSalary());
            System.out.println("\n-------------------");

        }
    }
}
