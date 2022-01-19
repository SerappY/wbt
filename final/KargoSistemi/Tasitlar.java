package KargoSistemi;
import java.util.Scanner;
public class Tasitlar {
public static void main(String[] args ) {
Scanner scanner = new Scanner(System.in);
String taþýtlar= "1.Motorsiklet\n"
		+"2.Bisiklet\n"
		+"3.Taksi\n"
		+"4.Kamyon\n"
        +"5.Gemi\n"
		+"6.Uçak\n";
	int motorsiklet = 25 ;
	int bisiklet = 15;
	int Taksi = 35;
	int kamyon = 100;
	int gemi = 300;
	int uçak = 500;
	 String tasitlar[] = {"", "Motorsiklet","Bisiklet","Taksi","Kamyon","Gemi","Uçak"};
	 
	System.out.println("--------------------");
	System.out.println(taþýtlar);
	System.out.println("--------------------");
	while(true) {
		System.out.println("Kargonuzu Hangi Tür Taþýtla Göndermek Ýsterseniz?\n");
		String  tür =scanner.nextLine();
		
		if(tür.equals("1")) {
			break;
		}
		else if(tür.equals("2")) {
		}

		else if(tür.equals("3")) {
		}
		else if(tür.equals("4")) {
		}
		else if(tür.equals("5")) {
	}
		else if (tür.equals("6")) {
	}
	}
}
}
	
	
	

