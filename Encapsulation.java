public class Encapsulation {
    
    private String name;
    private int age;

     public String getName(){ //get the name from the frontend
        return name;
     }

     public void setName(String name){ //set the name in the backend or java 
        this.name = name;
     }

     public int getAge(){
        return age;
     }

     public void setAge(int age){ //void meaning after you set then done
        this.age = age;
     }

     public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Atok");
        person.setAge(17);

        System.out.println(person.getName() + " is " + person.getAge() + " years old");
     }
}
