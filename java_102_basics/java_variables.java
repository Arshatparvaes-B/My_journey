package java_102_basics;

import java.util.*;

public class java_variables {
    //variables in java
    public static void main(String args[]){
        System.out.print("8 primitive datatypes");
        byte e=0;
        System.out.println("It is an 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive).");
        short d=32767;
        System.out.println("it is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive).");
        char c= '\u0000';
        System.out.println("The size of char is 2bytes,it  is a single 16-bit Unicode character. Its value-range lies between '\\u0000' (or 0) to '\\uffff' (or 65,535 inclusive)");
        boolean f=true;
        System.out.println("Boolean is of the Size 1byte");
        int n1 = 5;
        System.out.println("Integer takes 4bytes in size,it is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive)");
        long n2=0L;
        System.out.print("Long takes 8bytes in size,it is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive)..");
        float n3= 0.0f;
        System.out.println("Float takes 4bytes in Size,it is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited");
        double n4=0.0d;
        System.out.println("Double takes 8bytes in size,it is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.");
        System.out.println("Practice with the primitive datatypes");
        int a=10;
        int b=25;
        int sum=a+b;
        int dif=b-a;
        System.out.println(sum);
        System.out.println(dif);
        Scanner sc= new Scanner(System.in);
        String namee=sc.next();
        String names=sc.nextLine();
        System.out.println(namee);
        System.out.println(names);

        System.out.println("5 Non-primitive datatypes");
        String name ="Arshat.";
        System.out.println(name);   
    }
}
