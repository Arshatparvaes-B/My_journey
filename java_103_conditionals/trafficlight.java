package java_103_conditionals;

import java.util.Scanner;

public class trafficlight {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int signal=sc.nextInt();
            // if (signal==1){
            //     System.out.println("The signal is green you can go");
            // }
            // else if(signal==2){
            //     System.out.println("The signal is Red,please stop.");
            // }
            // else if (signal==3){
            //     System.out.println("The signal is yellow/orange get ready to stop.");
            // }
            // else{
            //     System.out.println("Invalid input.");
            // }
            switch(signal){
                case 1:System.out.println("The signal is green you can go ");
                break;
                case 2:System.out.println("The signal is Red,please stop.");
                break;
                case 3:System.out.println("The signal is yellow/orange get ready to stop.");
                break;
                default:System.out.println("Invalid input.");
            }
        }
    }
    
}
