public class EmployeeManagementSystem {
    
        public static void main(String[] args) {
            Employee[] emp = new Employee[5];
    
            emp[0] = new Employee("Faree", 5000, 4000, 500);
            emp[1] = new Employee("Khai", 4500, 5000, 200);
            emp[2] = new Employee("Mai", 4500, 6000, 400);
            emp[3] = new Employee("Rara", 4600, 5000, 500);
            emp[4] = new Employee("Sab", 4900, 1000,200);

            for(int i = 0; i<emp.length; i++){
                emp[i].display();
            }
    
    
    
    
        }
    }
