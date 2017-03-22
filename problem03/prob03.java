
/**
 * Write a description of class prob03b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prob03
{
  public static void main (String [] args)
  {
      long A = 600851475143L;
      int i = 1;
      double d;
      boolean isPrime = false;
      do{
         d  = (double)A/(double)i;
      if (d == Math.floor(d)){
        if (d % 2 == 1){
            isPrime = true;
            for (int j=2; j<Math.sqrt(d); j++){
                if (d % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
        }
      }
      i = i+1;
    } while (isPrime == false);
    System.out.println(d);
}

}
