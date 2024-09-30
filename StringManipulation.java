public class StringManipulation {
//usually used on login page where user might autocorrect the details 
//to convert the String to the standard or lowercase
    public static void main(String[] args) {
        
    String str = "Hello";
    String newStr = str.concat("World");
    String lowerStr = newStr.toLowerCase(); //change to lowercase
    String subStr = newStr.substring(0, 5); //only show first 5 letters (usually used for profile name if too long then only show the first n letters)
    String replaceString = newStr.replace(" World,", "Java");

    System.out.println(newStr);
    System.out.println(lowerStr);
    System.out.println(subStr);
    System.out.println(replaceString);
}
}
