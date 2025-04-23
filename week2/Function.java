package week2;

import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        String myString="MyName";
        // String myString2= new String("MyName");
        String myString2="MyName2";
        // String myNewString="MyName"+"MyName2";
        String myNewString= myString.concat(myString2);
        int lenOfString= myNewString.length();
        char myChar= myString.charAt(2);
        String mySentence="Hello my name is abc";
        String[] words= mySentence.split(" ");
        System.out.println(Arrays.toString(words));
        String newSubString1= myString.substring(1,4);
        System.out.println(newSubString1);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.equals("myname"));
        System.out.println(myString.equalsIgnoreCase("myname"));
        System.out.println(myString.contains("am"));
        System.out.println(myString.startsWith("My"));
        System.out.println(myString.endsWith("m"));
        String color="GREEN";
        System.out.println(myString.indexOf("E"));
        System.out.println(myString.lastIndexOf("E"));
        System.out.println(color.replace("E", "A"));

        
    }
    
}
