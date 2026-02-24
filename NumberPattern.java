import java.util.*;
public class NumberPattern{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){ 
            for(int j = 1;j<=i;j++){
                System.out.print(+j);
            }
            System.out.println();
        }
        System.out.println("Reverse pattern");
        for(int i = 1;i<= n;i++){ 
            for(int k = 0;k <= n-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++){
                System.out.print(+j);
            }
            System.out.println();
        }
}
}