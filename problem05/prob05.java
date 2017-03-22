
/**
 * Write a description of class prob05 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob05
{
    public static void main (String [] args)
    {
        int n = 20;
        boolean found = false;
        while (found == false)
        {
            int p = 0;
            for (int i = 1; i<=20; i++)
            {
                if (n % i == 0)
                {
                    p = p + 1;
                }
            }
            if (p == 20)
            {
                found = true;
                System.out.println(n);
            }
            n = n + 1;
        }
    }
}
