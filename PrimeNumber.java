import java.util.*;
class PrimeNumber {
    public static void main(String[] args){
        int n;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for(int i = 2;i < n;i++){
            if (n%i == 0){
               flag = 1;
                break;
            }
        }
    if(n <= 1){
        System.out.println(" not a Prime numbers");
    }
    else if(flag == 0){
        System.out.println("prime number");
    }
    else{
        System.out.println("not a prime number");
    }
}
}
