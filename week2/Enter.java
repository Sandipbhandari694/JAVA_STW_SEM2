import java.util.Scanner;

public class Enter {
    public static void main(String[] args) {
        //a=int(input("ENter a number:"))
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("Your number is "+a);

    }
}
