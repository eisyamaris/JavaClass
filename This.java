class Animal{
    String name;

    public Animal (String name){
        this.name = name;

    }

    public void sound(){
        System.out.println(name + "makes a sound");
    }
}
    //Subclass #1 

    class Dog extends Animal{
        public Dog (String name){
            super(name);
        }

        @Override
        public void sound(){
            super.sound();
            System.out.println(name + "barks");
        }
    }

    public class This{
        public static void main(String[] args) {
            Dog dog = new Dog ("Angeer");
            dog.sound();
        }
    }

