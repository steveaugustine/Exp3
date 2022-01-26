import java.util.*;
public class area {
    public static void main(String args[]){
        int r,l,b,m,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS : ");
        r=obj.nextInt();
        System.out.println("ENTER THE LENGTH AND BREADTH : ");
        l=obj.nextInt();
        b=obj.nextInt();
        System.out.println("ENTER THE BASE AND HEIGHT : ");
        m=obj.nextInt();
        n=obj.nextInt();

        area obj1=new area();
        obj1.Area(r);
        obj1.Area(l,b);
        obj1.Area(m,n);
    }
    void Area(int a)
    {
        System.out.println("AREA OF CIRCLE    : "+(3.14*a*a));
    }
    void Area(int x,int y)
    {
        System.out.println("AREA OF RECTANGLE : "+(x*y));
    }
    void Area(double p,double q)
    {
        System.out.println("AREA OF TRIANGLE  : "+(0.5*p*q));
    }
}
