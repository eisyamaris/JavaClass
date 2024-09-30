public class StringBuilderOne {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World"); 
        sb.insert(5,","); //put coma in position 5, the position starts with 0
        sb.delete(5,6); //delete between 5 and 6
        sb.reverse(); //reverse the String

        System.out.println(sb); //new Java changed. Still displaying even it is a mistake (make life easier)
        System.out.println(sb.toString()); //proper way


    }
}
