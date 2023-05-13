package gyakorlas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Tanulo> tanulok = new ArrayList<Tanulo>();
		FajlKezeles fajlObj = new FajlKezeles();

		tanulok = fajlObj.TanulokBeolvasasaFajlbol("tanulok.txt", ";");
		
		for (Tanulo tanulo : tanulok)
		System.out.println(tanulo.getNev()+" átlaga:"+((tanulo.getMatek()+tanulo.getAngol()+tanulo.getTori())/3.0));
	}

}
