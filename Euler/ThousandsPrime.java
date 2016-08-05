import java.io.*;
import java.util.*;

public class ThousandsPrime
{
    public static int prime(int n,ArrayList<Integer> list)
    {
        int x = list[list.size()-1];
        while(list.size()<n)
        {
            x+=2;
            int y = (int)Math.sqrt(x);
            count = 0;
            for(int i : list)
            {
                if(i>y)
                {
                    count = 0;
                    break;
                }
                if(x%i==0){
                    count = 1;
                    break;
                }

            }
            if( count == 0 )
            {
                list.append(x);
            }
        }
    return x;
    }
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = InputStreamReader(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        while(t-->0)
            {
                int n = Integer.parseInt(br.readLine());
                if(n>list.size())
                {
                    list.add(prime(n,list));
                }
                System.out.println(list[n-1]);
            }
    }
}
