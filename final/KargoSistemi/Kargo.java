package KargoSistemi;
import java.util.Scanner; 
public class Kargo {

	public static void main(String[] args ) {
		System.out.println("Merhaba Cool_kargoya Ho�geldiniz!\n");
	
		String t�rler = "1.NORMAL M��TER� NUMARASI\n"
				+"2.CIP M��TER� NUMARASI\n"
				+"3.VIP M��TER� NUMARASI\n"
				+"KAYIT OLMAK ���N Q'YA BASINIZ\n"
		        +"�IKMAK ���N X'E BASINIZ";
		
		System.out.println("--------------------");
		System.out.println(t�rler);
		System.out.println("--------------------");
		
		while(true) {
		System.out.println("Hangi T�r M��teri Numaras�na Sahip Oldu�unuzu  Se�iniz:\n");
		Scanner scanner = new Scanner(System.in);
		String  t�r =scanner.nextLine();
		
		
			if(t�r.equals("1")) {
				Scanner input = new Scanner(System.in);
				System.out.print("Ad�n�z   :");
				String ad = input.next();
				System.out.print("Soyad�n�z :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaran�z   :");
				int telefon = input.nextInt();  
			    System.out.println("------------------------------\nM��TER� B�LG�LER�\n------------------------------");
			    System.out.println("NORMAL M��teri");
				System.out.println("Ad�    : "+ad+"\nSoyad� : "+soyad+"\nAdresi : "+adres+"\nTelefon Numaras� : "+telefon);
				System.out.println("------------------------------");
			System.out.println("L�tfen a�a��da istenilen bilgileri eksiksiz doldurunuz:");
				System.out.println("Kargo i�eri�iniz hakk�nda bilgi veriniz :");
				String i�erik = input.next();
				System.out.println("Kargo a��rl��� :");
				int a��rl�k = input.nextInt();
				break;
		
				
			}
			else if(t�r.equals("2")) {
				Scanner input = new Scanner(System.in);
				System.out.print("Ad�n�z   :");
				String ad = input.next();
				System.out.print("Soyad�n�z :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaran�z   :");
				int telefon = input.nextInt();  
			
					System.out.println("------------------------------\nM��TER� B�LG�LER�\n------------------------------");
				System.out.println("CIP M��teri");
				System.out.println("Ad�    : "+ad+"\nSoyad� : "+soyad+"\nAdresi : "+adres+"\nTelefon Numaras� : "+telefon);
				System.out.println("------------------------------");
				System.out.println("L�tfen a�a��da istenilen bilgileri eksiksiz doldurunuz:");
				System.out.println("Kargo i�eri�iniz hakk�nda bilgi veriniz :");
				String i�erik = input.next();
				System.out.println("Kargo a��rl��� :");
				int a��rl�k = input.nextInt();
				
				break;	
			}
			else if(t�r.equals("3")){
			{
				Scanner input = new Scanner(System.in);
				System.out.print("Ad�n�z   :");
				String ad = input.next();
				System.out.print("Soyad�n�z :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaran�z   :");
				int telefon = input.nextInt();  
			
				
				System.out.println("------------------------------\nM��TER� B�LG�LER�\n------------------------------");
				System.out.println("VIP M��teri");
				System.out.println("Ad�    : "+ad+"\nSoyad� : "+soyad+"\nAdresi : "+adres+"\nTelefon Numaras� : "+telefon);
				System.out.println("------------------------------");
				System.out.println("L�tfen a�a��da istenilen bilgileri eksiksiz doldurunuz:");
				
				System.out.println("Kargo i�eri�iniz hakk�nda bilgi veriniz :");
				String i�erik = input.next();
				System.out.println("Kargo a��rl��� :");
				int a��rl�k = input.nextInt();
				
				break;
				}
			}
			else if(t�r.equals("Q"))
				{
				
				Scanner input = new Scanner(System.in);
				System.out.print("Ad�n�z   :");
				String ad = input.next();
				System.out.print("Soyad�n�z :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaran�z   :");
				int telefon = input.nextInt();  
			
			System.out.print("Kay�t i�leminiz ba�ar�yla olu�turuldu..\n");
				
			System.out.println("------------------------------\nCOOLCARGO A�LES�NE HO�GELD�N�Z\n------------------------------");
				System.out.print("M��teri numaran�z sistem taraf�ndan size aktar�lacakt�r.\nK�sa bir s�re i�in NORMAL M��TER� kategorisindesiniz. \n");
				System.out.print("Bizi tercih ettik�e m��teri numaran�z de�i�mektedir ve avantajlar�m�zdan yararlanma hakk�n�z giderek artmaktad�r.\n");
				System.out.println("------------------------------\nL�TFEN B�Z� TAK�TE KALIN\n------------------------------");
				}else if(t�r.equals("X")) {
					System.out.println("��k�� Yapt�n�z...");
					break;
				}
			else {
				System.out.println("Ge�ersiz Bir De�er Giriniz...");
			}
	}
	}
}

	

