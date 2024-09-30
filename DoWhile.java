import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword;

        //do this 
        do{ 
            System.out.println("Enter the password : ");
            enteredPassword = scanner.nextLine();
            if(!enteredPassword.equals(correctPassword)){
                System.out.println("Please try again");
            }
        } while(!enteredPassword.equals(correctPassword)); //while this is true, go back to 'do' above, the true password is not result on while
        //while should have the exact same condition as 'if'
        //keep it in the loop until the person enter the correct password, then take them out
        
        System.out.println("True Password"); //display this if above is not true
    }
    

}
