	package intro;

public class Main {

	public static void main(String[] args) {
	System.out.println("Merhaba Java");
	
	
	
	String metin = "Ilginizi cekebilir";
	String metin2 = "Vade suresi";
	System.out.println(metin2);
	
	
	int vade = 12;
	double dolarDun = 11.8;	
	double dolarBugun = 11.8;
	
	
	boolean dolarDustuMu = 	false;
	
	String yukariOk = "Yukari ok dolar cikti";
	String asagiOk = "Asagi ok";
	String esit = "esit";
		
		if (dolarBugun > dolarDun) {
			System.out.println(yukariOk);
		} else if (dolarBugun < dolarDun) {
System.out.println(asagiOk);
		}else {
			System.out.println(esit);
		}
	
		
		String [] krediler = {"en hizli","ikinci siradaki kredi", "sonraki kredi"};
		
		//System.out.println(krediler[0]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
	}

}
