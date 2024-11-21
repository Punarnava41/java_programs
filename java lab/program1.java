import java.util.*;
import java.lang.*;
class code
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a==0||b==0||c==0)
        System.out.println("invalid inputs");
        else
        {
            int d=b*b-4*a*c;
            if(d>0){
            System.out.println("Roots are real and distict ");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are"+r1+" "+r2);
            }
            else if(d<0)
            {
                System.out.println("There are no real solutions");
            }
            else
            {
                System.out.println("Roots are real and same");
                double r=-b/(2*a);
                System.out.println("Roots are r1=r2="+r);
            }
            
            
        }
    }
}
// O/P:
1
2
1
Roots are real and same
Roots are r1=r2=-1.0
1
3
2
Roots are real and distict 
Roots are-1.0 -2.0
1
1
1
There are no real solutions
