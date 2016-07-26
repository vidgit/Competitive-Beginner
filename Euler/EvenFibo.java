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
 
		public long readInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
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
 
		public static long[] readIntArray(InputReader in, int size) {
			long[] array = new long[size];
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

public class EvenFibo {
    
    public static long solve(long x){
        long sum=2,a=0,b=2,c;
        c=4*b+a;
        if(x<b)
            return 0;
        while(c<x){
            sum+=c;
            a=b;
            b=c;
            c=4*b+a;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        InputReader in=new InputReader(System.in);
        long t=in.readInt();
        while(t-->0){
            System.out.println(solve(in.readInt()));
        }
    }
}
