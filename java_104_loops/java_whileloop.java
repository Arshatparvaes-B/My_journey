package java_104_loops;

import java.util.Scanner;

public class java_whileloop {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
        int counter=sc.nextInt();
        System.out.println("Enter a any number below 10 to start.");
        while(counter<10){
            System.out.println("Hi while you r busy laughing I am Coding."+counter);
            counter++;
        }
    }

    }
    
}
