package Loops;
import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("From which number you want to start? : ");
        int num = sc.nextInt();
        System.out.println("To which number you want to stop? : ");
        int upto = sc.nextInt();
        System.out.println("Let's begin");
        for (int i = num; i <= upto; i++) {
            
            System.out.println(i);
        }
    }
}
