import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
        int x = s.nextInt(); 
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        if (x>y){
                if (x>z){
                        result=x;
                }
                else if (x<z){
                        result=z;
                }
        else if(y>x){
                if (y>z){
                        result=y;
                }
                else if (y<z){
                        result=z;
                }
        }
        System.out.println(result);
        }
}



       }
}