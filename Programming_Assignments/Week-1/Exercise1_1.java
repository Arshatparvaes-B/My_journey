import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
       try(Scanner s = new Scanner(System.in)){
       double radius= s.nextDouble();
       double perimeter;
       double area;
       if (radius==0){
              System.out.println("please enter non zero positive number");
       }
       else{
              perimeter=2*(Math.PI*radius);
              area=Math.PI*(Math.pow(radius,2));
              System.out.println(perimeter);
              System.out.print(area);
       }
       }
       
       }
}