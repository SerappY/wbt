package KargoSistemi;
import java.util.Scanner;
public class Tasitlar {
public static void main(String[] args ) {
Scanner scanner = new Scanner(System.in);
String ta��tlar= "1.Motorsiklet\n"
		+"2.Bisiklet\n"
		+"3.Taksi\n"
		+"4.Kamyon\n"
        +"5.Gemi\n"
		+"6.U�ak\n";
	int motorsiklet = 25 ;
	int bisiklet = 15;
	int Taksi = 35;
	int kamyon = 100;
	int gemi = 300;
	int u�ak = 500;
	 String tasitlar[] = {"", "Motorsiklet","Bisiklet","Taksi","Kamyon","Gemi","U�ak"};
	 
	System.out.println("--------------------");
	System.out.println(ta��tlar);
	System.out.println("--------------------");
	while(true) {
		System.out.println("Kargonuzu Hangi T�r Ta��tla G�ndermek �sterseniz?\n");
		String  t�r =scanner.nextLine();
		
		if(t�r.equals("1")) {
			break;
		}
		else if(t�r.equals("2")) {
		}

		else if(t�r.equals("3")) {
		}
		else if(t�r.equals("4")) {
		}
		else if(t�r.equals("5")) {
	}
		else if (t�r.equals("6")) {
	}
	}
}
}
	
	
	

