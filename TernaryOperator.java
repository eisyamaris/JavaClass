public class TernaryOperator {
    public static void main(String[] args) {
        int age = 16;

        String result = age>=18 ? "You are an adult" : "You are not";
        // put condition first then the if else
        // ? meaning if, : meaning else
        // before if else was introduced, Java used this
        // can use ? multiple times
        // not very common
        System.out.println(result);
    }
}
