
/**
 * Write a description of class prob04 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob04
{
   public static void main (String [] args)
   {
       int max = 1;
       for (int i=100; i<1000; i++)
       {
           for (int j=100; j<1000; j++)
           {
               int pr = i*j;
               if(pr>=10000 & pr<=99999)
               {
                   if( (pr/10000 == pr%10) && ((pr/1000)%10 == (pr/10)%10) )
                   {
                       if (pr>max)
                       {
                           max=pr;
                        }
                       
                    }
                }
                if(pr>=100000 & pr<=999999)
               {
                   if( (pr/100000 == pr%10) && ((pr/10000)%10 == (pr/10)%10)  && ( (pr/1000)%10 == (pr/100)%10) )
                   {
                       if (pr>max)
                       {
                           max=pr;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
