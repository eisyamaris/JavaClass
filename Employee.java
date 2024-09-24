public class Employee {
    
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    // Constructor initializes allowances to zero, as required by the question
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0.0;  // Initialized to zero
        this.transportAllowance = 0.0;  // Initialized to zero
        this.bonus = 0.0;  // Initialized to zero
    }

    // Method to set employee allowances if needed
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
        Employee[] emp = new Employee[5];

        // Initializing the employee objects with name and base salary
        emp[0] = new Employee("Faree", 50000);
        emp[1] = new Employee("Khai", 45000);
        emp[2] = new Employee("Mai", 45000);
        emp[3] = new Employee("Rara", 46000);
        emp[4] = new Employee("Sab", 49000);

        // Setting the allowances using setAllowances method
        emp[0].setAllowances(400, 500);
        emp[1].setAllowances(500, 500);
        emp[2].setAllowances(400, 500);
        emp[3].setAllowances(500, 500);
        emp[4].setAllowances(400, 400);

        // Assigning bonus to employees
        for(Employee employee : emp){
            employee.assignBonus();
        }

        try {
            // Displaying the information and catching ArrayIndexOutOfBoundsException
            for (int i = 0; i <= emp.length; i++) {  // Intentionally using <= to cause ArrayIndexOutOfBoundsException
                System.out.println(emp[i].display());
                System.out.println("Health Allowance: " + emp[i].getHealthAllowance());
                System.out.println("Transport Allowance: " + emp[i].getTransportAllowance());
                System.out.println("Bonus: " + emp[i].getBonus());
                System.out.println("Total Salary: " + emp[i].calculateTotalSalary());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index.");
        } finally {
            System.out.println("Execution completed. Resources can be closed here if necessary.");
        }
    }
}
