public class prob31
{
    public static void main (String [] args)
    {
        //int [] coins = {1,2,5,10,20,50,100,200};
        int [] max = {200,100,40,20,10,4,2,1};
        int combinations = 1;
        //int n = coins.length;
        int sum;
        int a1,a2,a5,a10,a20,a50,a100;
        
        for (a1=0; a1<=max[0]; a1++)
        {
            sum=0;
            for (a2=0; a2<=max[1]; a2++)
            {
                sum=0;
                for (a5=0; a5<=max[2]; a5++)
                {   
                    sum=0;
                    for (a10=0; a10<=max[3]; a10++)
                    {
                        sum=0;
                        for (a20=0; a20<=max[4]; a20++)
                        {
                            sum=0;
                            for (a50=0; a50<=max[5]; a50++)
                            {
                                sum=0;
                                for (a100=0; a100<=max[6]; a100++)
                                {
                                    sum = a1*1 + a2*2 + a5*5 + a10*10 + a20*20 + a50*50 + a100*100;
                                    if (sum==200)
                                    {
                                        combinations = combinations +1;
                                        sum=0;
                                      
                                    }
                                    
                                } 
                               
                            } 
                            
                        } 
                        
                    } 
                    
                } 
                
            } 
        }  
        
        System.out.println(combinations);
    }
}