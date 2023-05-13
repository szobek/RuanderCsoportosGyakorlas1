package gyakorlas;

import java.io.BufferedReader;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class FajlKezeles {
	
	
	public List<Tanulo> TanulokBeolvasasaFajlbol(String fajlnev, String elvalaszto) {
		
		List<Tanulo> tanulok = new ArrayList<Tanulo>();
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev),"UTF-8"));
			
		br.readLine();
			
			while (br.ready()) {
				
				String[] csvSor = br.readLine().split(elvalaszto);
				Tanulo ujTanulo = new Tanulo( csvSor);
				
				tanulok.add(ujTanulo);
				
			}
			br.close();
			
		} catch (UnsupportedEncodingException e) {
			
			System.out.println("Hibás karakterkódolás!");
			
		} catch (FileNotFoundException e) {

			System.out.println("Nem létezõ fájl!");
			
		} catch (IOException e) {
			
			System.out.println("I/O hiba!");
		}
		
		
		return tanulok;
	}


}
