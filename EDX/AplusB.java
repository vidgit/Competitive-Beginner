import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AplusB{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("aplusb.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("aplusb.out")));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		bw.write(a+b+"");
		br.close();
		bw.close();
	}
}