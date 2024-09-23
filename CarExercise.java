public class CarExercise {
    private String model;
    private double petrolUsage;

    public void setCar(String model, double petrolUsage){
        this.model = model;
        this.petrolUsage = petrolUsage;
    }

    public String getModel(){
        return model;
    }

    public double getPetrolUsage(){
        return petrolUsage;
    }

    public static void main(String[] args) {
        String[][] models = {
            {"Myvi", "Axia"},
            {"Alza", "Kancil"},
        };

        double[][] petrolUsages = {
            {45.3, 50.2},
            {55.5, 42.5},
        };

        CarExercise car = new CarExercise();

        // Loop through the arrays and set the values in the car object
        for (int i = 0; i < models.length; i++) {
            for (int j = 0; j < models[i].length; j++) {
                car.setCar(models[i][j], petrolUsages[i][j]);
                
                // Use a switch function to handle different car models
                switch (car.getModel()) {
                    case "Myvi":
                        System.out.println("The petrol usage of Myvi is " + car.getPetrolUsage() + " liters per 100km.");
                        break;
                    case "Axia":
                        System.out.println("The petrol usage of Axia is " + car.getPetrolUsage() + " liters per 100km.");
                        break;
                    case "Alza":
                        System.out.println("The petrol usage of Alza is " + car.getPetrolUsage() + " liters per 100km.");
                        break;
                    case "Kancil":
                        System.out.println("The petrol usage of Kancil is " + car.getPetrolUsage() + " liters per 100km.");
                        break;
                    default:
                        System.out.println("Unknown model: " + car.getModel());
                        break;
                }
            }
        }
    }
}