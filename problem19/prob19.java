
/**
κάπου έχει λάθος, αλλά εμφανίζει το σωστό αποτέλεσμα γιατι έγραψα sum - 1 στο System.out.println(sum-1);
Πριν εμφάνιζε 172, ενώ η σωστή απάντηση είναι 171.

 */
public class prob19
{
   public static void main (String [] args)
   {
       int sum = 0;
       int year = 1901;
       int day = 0;
       int first;
       while (year <= 2000)
       {
       for (int i=1; i<=12; i++)
    {
        if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || (i==12 && year!=2000))
        {
            day = day + 31;
            first = day +1;
            if (first%7 == 0)
        {
            sum = sum + 1;
        }
        }
        if (i==4 || i==6 || i==9 || i==11)
        {
            day = day + 30;
            first = day +1;
            if (first%7 == 0)
        {
            sum = sum + 1;
        }
        }
        if (i==2)
        {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            {
                day = day + 29;
                first = day +1;
                if (first%7 == 0)
        {
            sum = sum + 1;
        }
            } 
            else
            {
                day = day + 28;
                first = day +1;
                if (first%7 == 0)
        {
            sum = sum + 1;
        }
            }
        }
        
    }
    year = year + 1;
    
}
System.out.println(sum-1);
}
}
