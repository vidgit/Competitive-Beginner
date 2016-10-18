import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AplusBsq {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("aplusbb.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("aplusbb.out")));
		String[] s = br.readLine().split(" ");
		long a = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);
		bw.write(a+(b*b)+"");
		br.close();
		bw.close();
	}
}
