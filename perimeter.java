import java.util.*;
public class perimeter {
    perimeter(int l,int b)
 {
  int per=2*(l+b);
  System.out.println("PERIMETER : "+per);
 }
 perimeter(int r)
 {
  float per=(float)(3.14*2*r);
  System.out.println("PERIMETER : "+per);
 } 
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int r,l,b,ch;
  do
  {
   System.out.println("\n\nCHOOSE THE FAVOURABLE OPTION : ");
   System.out.println("\n1.CIRCLE\n2.RECTANGLE\n3.EXIT\n");
   System.out.println("ENTER  : ");
   ch=obj.nextInt();
   
   switch(ch)
   {
    case 1:System.out.println("ENTER THE RADIUS : ");
           r=obj.nextInt();
           perimeter p=new perimeter(r);
           break;
           
    case 2:System.out.println("ENTER THE LENGTH : ");
           l=obj.nextInt();
           System.out.println("ENTER THE BREADTH : ");
           b=obj.nextInt();
           p=new perimeter(l,b);
           break;
          
   case 3:break;
   
   default:System.out.println("!!ERROR!!");
           break;
   }
  }while(ch!=3);
 }
}
