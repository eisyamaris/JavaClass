public class OrAnd {
    
    public static void main(String[] args) {
        int age = 16;
        boolean hasParentalConsent = true;
        
        //the condition has no limit
        if(age >= 18 || hasParentalConsent && age > 25){ 
            System.out.println("Aiman is allowed");
        } else{
            System.out.println("Aiman is not allowed");
        }
    }
}
