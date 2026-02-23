import java.lang.Math;
import java.util.Scanner;
public class ImportMath {
    public static void main(String[] args) {
        float number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextFloat();
        System.out.println("square:" +Math.sqrt(number));
        System.out.println("power:" +Math.pow(number, 2));
        System.out.println("cube root:" +Math.cbrt(number));
        System.out.println("absolute value:" +Math.abs(number));
        System.out.println("rounded value:" +Math.round(number));
        System.out.println("ceiling value:" +Math.ceil(number));
        System.out.println("floor value:" +Math.floor(number));
        System.out.println("max value:" +Math.max(number,20));
        System.out.println("min value:" +Math.min(number, 10));
        System.out.println("random value:" +Math.random);



    }
    
}
