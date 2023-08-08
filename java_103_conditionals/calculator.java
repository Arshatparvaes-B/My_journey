package java_103_conditionals;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        System.out.println("Choose 1 for addtion(+).");
        System.out.println("Choose 2 for subtraction(-).");
        System.out.println("Choose 3 for multiplication(*).");
        System.out.println("Choose 4 for division(/).");
        System.out.println("Choose 5 for modulo division(%).");
        System.out.println("................................");
        System.out.println("Enter a choice:");
        try(Scanner sc=new Scanner(System.in)){
            int choice=sc.nextInt();
            //using if else statements
            if (choice>0 && choice<=5){
                System.out.println("Enter operand1:");
                int a=sc.nextInt();
                System.out.println("Enter operand2:");
                int b=sc.nextInt();
                int result=0;
                if (choice==1){
                    result=a+b;
                }
                else if (choice==2){
                    result=a-b;
                }
                else if (choice==3){
                    result=a*b;
                }
                else if (choice==4){
                    result=a/b;
                }
                else if (choice==5){
                    result=a%b;
                }
            System.out.println("The result is:"+(result));
            }
            else{
                System.out.println("Invalid input");
            }
            //using switch
            // switch(choice){
            //     case 1:System.out.println(a+b);
            //     break;
            //     case 2:System.out.println(a-b);
            //     break;
            //     case 3:System.out.println(a*b);
            //     break;
            //     case 4:System.out.println(a/b);
            //     break;
            //     case 5:System.out.println(a%b);
            //     break;
            //     default:System.out.println("Enter a valid");
            // }
        }
    }
}
