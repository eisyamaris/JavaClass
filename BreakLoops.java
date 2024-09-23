public class BreakLoops {
    
    public static void main(String[] args) {
        System.out.println("using break");

        for (int i=1; i<=5; i++){
            if(i==3){
                break;
            }

            System.out.println(i);
        }
    }
}
