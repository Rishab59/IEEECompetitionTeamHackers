import java.util.Scanner ;
class MosaicDecoration 
{
    public static void main(String [] array) 
    {
        Scanner s = new Scanner(System.in) ;
        int N = s.nextInt() ;
        int Cb = s.nextInt() ;
        int Cp = s.nextInt() ;
        if((2 <= N && N <= 1000) && (1 <= Cb && Cp <= 1000))
        {
            int i ;
            int Bi[] = new int[N] ;
            int Pi[] = new int[N] ;
            for(i = 0 ; i < N ; i++) 
            {
                Bi[i] = s.nextInt() ;
                Pi[i] = s.nextInt() ;
            }
            int sumb = 0, sump = 0 ;
            for(int element : Bi)
            {
                sumb += element ;
            }
            for(int elements : Pi)
            {
                sump += elements ;
            }
            int pileb = 0, pilep = 0 ;
            if (sumb % 10 == 0)
            {
                pileb = (sumb / 10) ;
            }
            else 
            {
                for(i = 0 ; i < 9 ; i++)
                {
                    if(sumb % 10 != 0)
                    {
                        sumb++ ;
                    }
                    else
                    {
                        break ;
                    }
                }
                pileb = (sumb / 10) ;
            }
            if (sump % 10 == 0)
            {
                pilep = (sump / 10) ;
            }
            else 
            {
                for(i = 0 ; i < 9 ; i++)
                {
                    if(sump % 10 != 0)
                    {
                        sump++ ;
                    }
                    else
                    {
                        break ;
                    }
                }
                pilep = (sump / 10) ;
            }
            int totalCost = (pileb * Cb) + (pilep * Cp) ;
            System.out.print(totalCost) ;
        }
        else
        {
            System.out.print("Constraints are not satisfied") ;
        }
    }   
}