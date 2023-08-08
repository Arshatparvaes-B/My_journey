package java_103_conditionals;

import java.util.Scanner;

public class java_conditionals {
    public static void main(String args[]){
    try(Scanner sc=new Scanner(System.in)){
    int age= sc.nextInt();
    if (age>=18){
        System.out.println("You are an adult,You have the right to vote,So fulfill it.");
    }
    else{
        System.out.println("You are Too Young to vote.");
        
    }}
}
}
