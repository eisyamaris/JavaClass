public class SwitchEx {
        public static void main(String[] args){
    
            String dayName;
            int newCalories = 1500;
    
            for(int i=1; i<=7; i++){
    
    
            switch (i) {
                case 1:
                dayName = "Monday";
                newCalories = newCalories + 0;
                     break;
    
                case 2:
                dayName = "Tuesday";
                newCalories = newCalories + 0;
                  break;   
    
                case 3:
                dayName = "Wednesday";
                newCalories = newCalories + 100;
                    break; 
    
                case 4:
                dayName = "Thurday";
                newCalories = newCalories + 100;
                    break; 
    
                case 5:
                dayName = "Friday";
                newCalories = newCalories + 100;
                    break;  
                    
                case 6:
                dayName = "Saturday";
                newCalories = newCalories + 100;
                    break; 
    
                case 7:
                dayName = "Sunday";
                newCalories = newCalories + 100;
                    break; 
    
                default:
                dayName = "Invalid";
                    break;
            }
    
            System.out.println(dayName + " Calories: " + newCalories);
        }
    }
    }
    
