import java.util.Scanner;

public class Least5 {
    public static void main(String args[]) {
        int a, b, c, d, e;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
        d = s.nextInt(); e = s.nextInt();
        if((a<b && a<c) && (a<d && a<e))
            System.out.println("a is the least number");
        else if((b<a && b<c) && (b<d && b<e))
            System.out.println("b is the least number");
        else if((c<a && c<b) && (c<d && c<e))
            System.out.println("c is the least number");
        else if((d<a && d<b) && (d<c && d<e))
            System.out.println("d is the least number");
        else
            System.out.println("e is the least number");
    }
}
