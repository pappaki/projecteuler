/**
public class prob48
{
    public static void main (String [] args)
    {
        long sum = 0L;
        for (long i=1L; i<=1000L; i++)
        {
            sum = sum + (long)(Math.pow(i,i));
        }
        System.out.println(sum);
        long digits = sum%(10000000000L);
        System.out.println(digits);
    }
}



public class prob48
{
    public static void main (String [] args)
    {
        long sum = 0L;
        long a;
        for (int i=1; i<=1000; i++)
        {
            a=((long)(Math.pow(i,i))) % 10000000000L;
            System.out.println(a);
            sum = sum + a;
        }
        
        System.out.println("sum = " + sum);
        long digits = sum%(10000000000L);
        System.out.println("last 10 digits = " + digits);
    }
}

*/


public class prob48
{
    public static void main (String [] args)
    {
        long result = 0;
        long modulo = 10000000000L;
 
        for (int i = 1; i <= 1000; i++) {
            long temp = i;
            for (int j = 1; j < i; j++) {
                temp *= i;
                temp %= modulo;
            }
 
            result += temp;
            result %= modulo;
        }
        System.out.println(result);
    }
}
