package java_103_conditionals;

import java.util.Scanner;

public class comparison {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a>b){
                System.out.println("a is greater than b");
            }
            else if(a==b){
                System.out.println("a is equal to b");
            }
            else{
                System.out.println("A is lesser than b");
            }
        }
    }
}
