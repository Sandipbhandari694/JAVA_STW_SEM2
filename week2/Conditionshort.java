import java.util.Scanner;
public class Conditionshort {
 
   public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        char variableName='s';
        System.out.print("Enter the age");
        int age= sc.nextInt();
        System.out.println("Enter the name");
        String name =sc.next();
        System.out.println("Enter the gpa");

        double gpa= sc.nextDouble();
        char char1=sc.next().charAt(0);
        sc.close();
   }


}        