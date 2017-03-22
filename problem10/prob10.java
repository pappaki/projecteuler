public class prob10
{
   public static void main (String [] args)
   {
       long sum = 5;
       boolean isPrime;
       for (int p = 5; p < 2000000; p=p+2)
       {
           isPrime = true;
           for (int i=2; i<=Math.sqrt(p); i++)
           {
               if (p%i == 0)
               {
                   isPrime = false;
                   break;
                }
            }
           if (isPrime)
           {
               //System.out.println(p);
               sum = sum + p;
           }
        }
        System.out.println(sum);
   }
}
