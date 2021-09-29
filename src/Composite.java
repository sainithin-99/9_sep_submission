import java.util.Scanner;
class Composite
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,p,i,c=0;
        System.out.println("Enter Number:");
        n= in.nextInt();
        p=n;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c>1)
        {
            System.out.println("It is Composite Number");
        }
        else
        {
            System.out.println("It is not Composite Number" );
        }}}
