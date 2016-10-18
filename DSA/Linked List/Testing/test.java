package Testing;

public class test {

	public static void main(String[] args) {
		String[] s="1470720042829,P,1@1470720848885,A,1@".split("@");
		
		System.out.println(s.length);
		for(String i:s)
		{
			System.out.println(i);
			/*for(String j:i.split(",")){
				*System.out.println(j);
			}*/
			System.out.println("------------");
		}
	}

}
