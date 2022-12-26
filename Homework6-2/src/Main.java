
public class Main {

	public static void main(String[] args) {


		Araba araba1= new Araba ();
		
		araba1.name= "Renault";
		araba1.id=1001;
		araba1.model=2011;
		araba1.motor="2.0";
		araba1.vites="Otomatik";
		araba1.yakit="Benzin";
		
		System.out.println("" );
		System.out.println("Araba1: "+"Adı: "+araba1.name +"; "+"ilan numarasi: "+araba1.id+"; "+"Model: "+araba1.model+"; "+" Motor Hacmi: "+araba1.motor +"; "+"Vites Türü: "+araba1.vites+"; "+"Yakit türü: "+araba1.yakit );
			
	}

}
