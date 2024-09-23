public class Car {
    
    private String model;
    private double petrolUsage;

    public Car(){
        model = "";
        petrolUsage = 0.0;
    }

    public Car(String model, double petrolUsage){
        this.model = model;
        this.petrolUsage = petrolUsage;
    }

    public void setModel(String m, double pU){
        model = m;
        petrolUsage = pU;
    }

    public String getModel(){
        return model;
    }

    public double getPetrolUsage(){
        return petrolUsage;
    }


    public static void main (String[]args){
        String[][] cars = {
            {"Proton X50","Proton X70"}, //array
            {"Proton X90", "Proton S70"}, //array
        };

        double[][] petrol = {
            {45.2,51.1}, //array
            {50.2,60.0}, //array
        };

        for(int i = 0; i<cars.length; i++){
            for(int j = 0; j<petrol.length; j++){
                System.out.println(cars[i]);
                System.out.println(petrol[j]);
            }
        }



        }


    }
