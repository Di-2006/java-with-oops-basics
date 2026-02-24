import java.util.*;
import java.lang.Math;
public class Floating {
    public static void main(String[] args){
        float a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        if(a == 0){
            System.out.println("Zero");
        }
        else if(a < 0){
            if(Math.abs(a) < 1){
                System.out.print("small Negative Number");
             }
            else{
                System.out.println("Negative Number");
            }
        }
        else{
            if(Math.abs(a)>100000){
                System.out.println("Large Postive number");
            }
            System.out.println("Positive Number");
        }
    }   
}
