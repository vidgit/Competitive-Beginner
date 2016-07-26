import java.io.*;
import java.util.*;

public class primeFactor {
    
    public static long reducer(long n){
        long n1=(long)Math.sqrt(n);
        for(long i=3;i<=n1;i+=2){
            if(n%i==0)
                return n/i;
        }
        return n;
    }
    static boolean isPrime(long n) {
    if(n < 2) return false;
    if(n == 2 || n == 3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    long sqrtN = (long)Math.sqrt(n)+1;
    for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    }
    return true;
}
    public static long solve(long n)
        {
        if((n&(n-1))==0)
            return 2;
        while(n%2==0)
            {
            n/=2;
        }
        while(true){
            if(isPrime(n))
                return n;
            else
                n=reducer(n);
            //System.out.println(n);
        }
                        
    }
    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long n=Long.parseLong(br.readLine());
            System.out.println(solve(n));             
        }
    }
}
