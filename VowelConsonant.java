import java.util.*;
public class VowelConsonant {
    public static void main(String[] args){
        char a;
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        switch(a){
            case 'a':System.out.println("Vowel");
            break;
            case 'e': System.out.println("Vowel");
            break;
            case 'i': System.out.println("Vowel");
            break;
            case 'o': System.out.println("Vowel");
            break;
            case 'u': System.out.println("Vowel");
            break;
            default : System.out.println("Consonant");
            break;

        }

    }

    
}
