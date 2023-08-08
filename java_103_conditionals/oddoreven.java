package java_103_conditionals;

import java.util.Scanner;

public class oddoreven {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int Num=sc.nextInt();
            if (Num%2==0){
                System.out.println("The Number entered is Even.");
            }
            else{
                System.out.println("The Number entered is Odd.");
            }
        }
    }
    
}
