import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_Prog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		System.out.println(x);
		
		char y = (char)br.read();
		
		System.out.println(y);
		
		br.readLine();
		
		String z = br.readLine();
		
		System.out.println(z);

	}

}
