import java.util.*;
public class factsum {
    public static void main(String args[]){
    	factsum obj1=new factsum();
        obj1.sum();
        obj1.factorial();
    }
    void sum(){
     Scanner obj2=new Scanner(System.in);
     int s=0,a;
     System.out.println("ENTER THE NUMBER : ");
     int m=obj2.nextInt();
     while(m>0)
     	{
     		a=m%10;
          	s=s+a;
       		m=m/10;
    	 }
     System.out.println("SUM : "+s);    
     }
     
     void factorial()
     {
        Scanner obj3=new Scanner(System.in);
     	int fact=1,i;
        System.out.println("ENTER DIGIT : ");
        int n=obj3.nextInt();
        for(i=1;i<=n;i++)
        {
        	fact=fact*i;
        }
      System.out.println("FACTORIAL OF THE DIGIT ENTERED : "+fact);   
     }
}
