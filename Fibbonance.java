import java.util.Scanner;
public class Fibbonance {
    public static void main(String[] args){
        int n,a =0,b =1;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0;i<= n;i++){
            System.out.println(+ a);
            int temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println("last value:" + a);
    }
}
