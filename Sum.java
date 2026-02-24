import java.util.*;
public class Sum {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            System.out.println(+ i);
            sum = sum + i;
        }
        System.out.println(+ sum);
        System.out.println(+ sum/n);
    }
}
