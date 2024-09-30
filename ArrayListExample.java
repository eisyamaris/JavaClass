import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        //System.out.println("Fruit #1 " + fruits.get(0));
        
        /*for(String fruit: fruits){
            System.out.println(fruit);
        }*/


        fruits.remove(1); //remove index 1
        System.out.println(fruits); //display the arraylist 
        /*for(String fruit: fruits){ //display different output when use loop
            System.out.println(fruit); 
         }*/
    }
    
    
}
