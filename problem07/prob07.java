
/**
 * Write a description of class prob07 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob07
{
   public static void main (String [] args)
   {
       int r = 10;
       int number = 4;
       boolean isPrime;
       while (number < 10001){
           r = r + 1;
           isPrime = true;
           for (int i=2; i<=Math.sqrt(r); i++)
           {
               if (r%i == 0)
               {
                   isPrime = false;
                   break;
                }
            }
            if (isPrime)
            {
                number = number +1;
            }
            
        }
        System.out.println(r);
   }
}
