import java.io.*;

public class StrategyHumain implements Strategy {

	@Override
	public boolean deciderDemanderCarte(Integer somme) throws IOException {
		BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
		str = br.readLine();
		System.out.println(str);
		} while(!str.equals("end"));
		return false;
	}


}