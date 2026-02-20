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
        // Relational Operators
        System.out.println("Relational Operators or comparision operator:");
        System.out.println("a>b = " + (a>b));
        System.out.println("a<b = " + (a<b));
        System.out.println("a==b = " + (a==b));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a>=b = " + (a>=b));
        System.out.println("a<=b = " + (a<=b));
        // Unary Operators
        System.out.println("Unary Operators:");
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (a--));
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));
        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(a>b) && (a!=b) = " + ((a>b) && (a!=b)));
        System.out.println("(a>b) || (a!=b) = " + ((a>b) || (a!=b)));
        System.out.println("!(a>b) = " + (!(a>b)));
        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a&b = " + (a&b));
        System.out.println("a|b = " + (a|b));
        System.out.println("a^b = " + (a^b));
        System.out.println("~a = " + (~a));
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
