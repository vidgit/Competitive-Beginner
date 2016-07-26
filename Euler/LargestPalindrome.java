import java.io.*;
import java.util.*;

public class LargestPalidrome {

    public static int reverse(int n)
    {
        int temp=n,rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev;
    }
    public static int solve(int n)
    {
        int prod=0,fin=0;
        for(int i=100;i<=999;i++){
            for(int j=100;j<=999;j++){
                prod=i*j;
                if(prod==reverse(prod)&&prod<n)
                if(prod>fin)
                    fin=prod;
            }
        }
        return fin;
    }
    public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
            {
            int n=Integer.parseInt(br.readLine());
            System.out.println(solve(n));
        }
    }
}
