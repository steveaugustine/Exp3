import java.util.*;
class freqrev
{
	public static void main(String args[])
	{
        funs1 obj=new funs1();
        obj.rev();
        obj.freq();
    }
}
class funs1
{
    void rev()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String str=obj.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("REVERSED STRING : "+rev);
    }
    void freq()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String str=obj.nextLine();
        System.out.println("ENTER THE CHARACTER TO BE COUNTED : ");
        char a=obj.next().charAt(0);
        int len=str.length();
        int frequency=0;
        for(int i=0;i<len;i++)
        {
            if(a==str.charAt(i)){
                System.out.println("CHARACTER FOUND AT "+(i+1));
                frequency++ ;   } 
        }
        System.out.println("FREQUENCY OF THE CHARACTER : "+frequency) ;
    }
}
