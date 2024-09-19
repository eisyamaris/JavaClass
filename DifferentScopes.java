public class DifferentScopes {
    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanceVariableString = "This is a string";

    public void showLocalVariable(){
        String localStringVariable = "Finish!";
        int localVariable = 30;
        System.out.println("My local variable is " + localVariable + " " + localStringVariable);
    }

    public static void main (String[] args){
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My local variable is " + example.instanceVariable + " " + example.instanceVariableString);
    }

}
