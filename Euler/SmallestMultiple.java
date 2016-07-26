import java.io.*;
import java.util.*;

public class SmallestMultiple {

    public static int gcd(int a, int b)
    {
        if(a>b)
        {
            int t=a;
            a=b;
            b=t;
        }
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int lcm=1;
        int[] arr=new int[41];
        arr[1]=1;
        for(int i=2;i<=40;i++)
        {
           arr[i]=(i*lcm)/gcd(i,lcm);
           lcm=arr[i];
           }
        while(t-->0){
            System.out.println(arr[Integer.parseInt(br.readLine())]);
        }
    }
}
