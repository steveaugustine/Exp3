import java.util.*;
public class student {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE FOLLOWING DETAILS OF THE STUDENT :");
        System.out.print("NAME        : ");
        String n = in.nextLine();
        System.out.print("CLASS       : ");
        int c = in.nextInt();
        System.out.print("ROLL NO     : ");
        int r = in.nextInt();
        System.out.print("MARK OF SUB1: ");
        int m1 = in.nextInt();
        System.out.print("MARK OF SUB2: ");
        int m2 = in.nextInt();
        System.out.print("MARK OF SUB3: ");
        int m3 = in.nextInt();
        System.out.print("MARK OF SUB4: ");
        int m4 = in.nextInt();
        System.out.print("MARK OF SUB5: ");
        int m5 = in.nextInt();
        int t = m1 + m2 + m3 + m4 + m5;
        double p = t / 500.0 * 100.0;
        String g;
        if (p >= 90)
            g = "A+";
        else if (p >= 80)
            g = "A";
        else if (p >=70)
            g = "B+";
        else if (p >= 60)
            g = "B";
        else if (p >= 50)
            g = "C";
        else if (p >= 40)
            g = "D";
        else
            g = "E";
            
        System.out.println("TOTAL MARK : " + t);
        System.out.println("PERCENTAGE : " + p);
        System.out.println("GRADE      : " + g);
    }
}
