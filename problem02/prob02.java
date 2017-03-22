
public class prob02
{
    public static void main(String [] args)
    {
        
        int a=1;
        int b=2;
        int sum=2;
        
        while(b<4000000)
        {
            int temp = b;
            b=a+b;
            a=temp;
            if (b%2==0)
            {
                sum = sum + b;
            }
        }
        System.out.println(sum);
    }
}
