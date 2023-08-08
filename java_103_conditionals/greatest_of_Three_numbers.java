package java_103_conditionals;
import java.util.Scanner;

public class greatest_of_Three_numbers {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter value for a:");
            int a=sc.nextInt();
            System.out.println("Enter value for b:");
            int b=sc.nextInt();
            System.out.println("Enter value for c:");
            int c=sc.nextInt();
            //using if else statements
            //without using extra value
            if (a>b){
                if (a>c){
                    System.out.println("The greatest is a."+(a));
                }
                else{
                    System.out.println("The greatest is c."+(c));
                }
            }
            else if (b>a){
                if (b>c){
                    System.out.println("The greatest is b."+(b));
                }
                else{
                    System.out.println("The greatest is c."+(c));
                }
            }
            else if (a==b && b==c){
                System.out.println("All are equal");
            }
        }    
    }
}
