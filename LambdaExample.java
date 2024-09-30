import java.util.function.Predicate;

//Real world Example: ATM machine limit 

public class LambdaExample {
    public static void main(String[] args) {
        Predicate<Integer>isGreaterThanThen = (num) -> num > 10; 
        //the parantheses is initiation of new num (int num) 
        //when use int num we need to use int num inside the code, but this one don't want to use the int num inside the code
        //just initiation. the arrow means the num is this(num)
        int number = 15;

        if(isGreaterThanThen.test(number)){
            System.out.println(number + " is greater than 10");
        } else{
            System.out.println(number + " is less than 10");
        }
    }
}
