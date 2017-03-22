
/**
 * Write a description of class prob06 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob06
{
    public static void main (String [] args)
    {
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i=1; i<=100; i++)
        {
            sum1 = sum1 + i;
            sum2 = sum2 + (int)Math.pow(i,2);
        }
        
        int result = (int)Math.pow(sum1,2) - sum2;
        System.out.println(result);

    }
}
