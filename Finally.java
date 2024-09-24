public class Finally {
    
    public static void main(String[] args) {
        //similar like if
        try{ 
            int [] numbers = {1,2,3};
            System.out.println(numbers[5]);

            //similar like else but not going to stop the execution
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());

            //do this despite the above codes
        } finally{
            System.out.println("It will execute anyway");
        }
            System.out.println("Program is continuing");
        }
    }
