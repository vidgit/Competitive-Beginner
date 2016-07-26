import java.io.*;
import java.util.*;
class InputReader {
 
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int readInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public String readString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public String next() {
			return readString();
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}
 
class IOUtils {
 
		public static int[] readIntArray(InputReader in, int size) {
			int[] array = new int[size];
			for (int i = 0; i < size; i++)
				array[i] = in.readInt();
			return array;
		}
		public static int[] readCharArray(InputReader in){
			String s=in.readString();
			int[] array=new int[s.length()];
			for(int i=0;i<array.length;i++){
				if(s.charAt(i)=='-'){
					array[i]=-1;
				}
				else{
					array[i]=1;
				}
			}
			return array;
		}
}

public class MultiplesOf3and5{
    public static long solve(long x){
        long sum=0;
        long x3=x;
        while(x3%3!=0){
            x3--;
        }
        long n3=x3/3+1;
        long sum3=n3*(x3)/2;
        long x5=x;
        while(x5%5!=0){
            x5--;
        }
        long n5=x5/5+1;
        long sum5=n5*(x5)/2;
        long x15=x;
        while(x15%15!=0){
            x15--;
        }
        long n15=x15/15+1;
        long sum15=n15*(x15)/2;
        //System.out.println(sum3);
        //System.out.println(sum5);
        //System.out.println(sum15);
        sum=sum5+sum3-sum15;
        return sum;
    }
    public static void main(String[] args){
        InputReader in=new InputReader(System.in);
        int t=in.readInt();
        for(int i=0;i<t;i++){
            long x=solve(in.readInt()-1);
            System.out.println(x);
        }
    }
}
