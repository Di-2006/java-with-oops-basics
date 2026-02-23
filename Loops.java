import java.util.*;
public class Loops {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int i = 0;
        System.out.println("While Loop : ");

        // while loop
        while(i <= n){
            System.out.println(+ i);
            i++;
        }

        // do while loop
        System.out.println("Do while Loop : ");
        i = 0;
        do{
            System.out.println(+ i);
            i++;
        }while(i<= n);

        // for loop
        System.out.println("For loop : ");
        for(i = 0 ; i<= n;i++){
            System.out.println( + i);
        }
    }
}
