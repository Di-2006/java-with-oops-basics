import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        int a,b;
        float num1,num2;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        System.out.println("a == num1 = " + (a==num1));
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("a/b = " + (a/b));
        System.out.println("a%b = " + (a%b));
        System.out.println("num1+num2 = " + (num1+num2));
        System.out.println("num1-num2 = " + (num1-num2));
        System.out.println("num1*num2 = " + (num1*num2));
        System.out.println("num1/num2 = " + (num1/num2));
        System.out.println("num1%num2 = " + (num1%num2));
        // Assignment Operators
        System.out.println("Assignment Operators:");
        System.out.println("a += b, a = " + (a += b));
        System.out.println("a -= b, a = " + (a -= b));
        System.out.println("a *= b, a = " + (a *= b));
        System.out.println("a /= b, a = " + (a /= b));
        System.out.println("a %= b, a = " + (a%=b));
        System.out.println("a = b, a = " + (a=b));
        System.out.println("num1 += num2, num1 = " + (num1 += num2));
        System.out.println("num1 -= num2, num1 = " + (num1 -= num2));
        System.out.println("num1 *= num2, num1 = " + (num1 *= num2));
        System.out.println("num1 /= num2, num1 = " + (num1 /= num2));
        System.out.println("num1 %= num2, num1 = " + (num1%=num2));
        System.out.println("num1 = num2, num1 = " + (num1=num2));
        // Relational Operators
        System.out.println("Relational Operators or comparision operator:");
        System.out.println("a>b = " + (a>b));
        System.out.println("a<b = " + (a<b));
        System.out.println("a==b = " + (a==b));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a>=b = " + (a>=b));
        System.out.println("a<=b = " + (a<=b));
        System.out.println("num1>num2 = " + (num1>num2));
        System.out.println("num1<num2 = " + (num1<num2));
        System.out.println("num1==num2 = " + (num1==num2));
        System.out.println("num1!=num2 = " + (num1!=num2));
        System.out.println("num1>=num2 = " + (num1>=num2));
        System.out.println("num1<=num2 = " + (num1<=num2));

        // Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));
        System.out.println("num1++ = " + (num1++));
        System.out.println("num1-- = " + (num1--));
        System.out.println("++num1 = " + (++num1));
        System.out.println("--num1 = " + (--num1));

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(a>b) && (a!=b) = " + ((a>b) && (a!=b)));
        System.out.println("(a>b) || (a!=b) = " + ((a>b) || (a!=b)));
        System.out.println("!(a>b) = " + (!(a>b)));
        System.out.println("(num1>num2) && (num1!=num2) = " + ((num1>num2) && (num1!=num2)));
        System.out.println("(num1>num2) || (num1!=num2) = " + ((num1>num2) || (num1!=num2)));
        System.out.println("!(num1>num2) = " + (!(num1>num2)));
        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a&b = " + (a&b));
        System.out.println("a|b = " + (a|b));
        System.out.println("a^b = " + (a^b));
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
        // Shift Operators
        System.out.println("Shift Operators:");
        System.out.println("a<<1 = " + (a<<1));
        System.out.println("a>>1 = " + (a>>1));
        System.out.println("a>>>1 = " + (a>>>1));
        // Ternary Operator
        System.out.println("Ternary Operator:");
        System.out.println("a>b? a: b = " + (a>b? a: b));
    }
    
}
