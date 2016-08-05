import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumSquareDiff {

    public static void main(String[] args)throws IOException {
        long[] a=new long[10001];
        long[] b=new long[10001];
        for(int i=1;i<10001;i++)
        {
            a[i]=a[i-1]+i*i;
            b[i]=b[i-1]+i;
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int x=Integer.parseInt(br.readLine());
            System.out.println(b[x]*b[x]-a[x]);  
        }
        
        
    }
}
