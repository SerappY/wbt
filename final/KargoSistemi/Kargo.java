package KargoSistemi;
import java.util.Scanner; 
public class Kargo {

	public static void main(String[] args ) {
		System.out.println("Merhaba Cool_kargoya Hoþgeldiniz!\n");
	
		String türler = "1.NORMAL MÜÞTERÝ NUMARASI\n"
				+"2.CIP MÜÞTERÝ NUMARASI\n"
				+"3.VIP MÜÞTERÝ NUMARASI\n"
				+"KAYIT OLMAK ÝÇÝN Q'YA BASINIZ\n"
		        +"ÇIKMAK ÝÇÝN X'E BASINIZ";
		
		System.out.println("--------------------");
		System.out.println(türler);
		System.out.println("--------------------");
		
		while(true) {
		System.out.println("Hangi Tür Müþteri Numarasýna Sahip Olduðunuzu  Seçiniz:\n");
		Scanner scanner = new Scanner(System.in);
		String  tür =scanner.nextLine();
		
		
			if(tür.equals("1")) {
				Scanner input = new Scanner(System.in);
				System.out.print("Adýnýz   :");
				String ad = input.next();
				System.out.print("Soyadýnýz :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaranýz   :");
				int telefon = input.nextInt();  
			    System.out.println("------------------------------\nMÜÞTERÝ BÝLGÝLERÝ\n------------------------------");
			    System.out.println("NORMAL Müþteri");
				System.out.println("Adý    : "+ad+"\nSoyadý : "+soyad+"\nAdresi : "+adres+"\nTelefon Numarasý : "+telefon);
				System.out.println("------------------------------");
			System.out.println("Lütfen aþaðýda istenilen bilgileri eksiksiz doldurunuz:");
				System.out.println("Kargo içeriðiniz hakkýnda bilgi veriniz :");
				String içerik = input.next();
				System.out.println("Kargo aðýrlýðý :");
				int aðýrlýk = input.nextInt();
				break;
		
				
			}
			else if(tür.equals("2")) {
				Scanner input = new Scanner(System.in);
				System.out.print("Adýnýz   :");
				String ad = input.next();
				System.out.print("Soyadýnýz :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaranýz   :");
				int telefon = input.nextInt();  
			
					System.out.println("------------------------------\nMÜÞTERÝ BÝLGÝLERÝ\n------------------------------");
				System.out.println("CIP Müþteri");
				System.out.println("Adý    : "+ad+"\nSoyadý : "+soyad+"\nAdresi : "+adres+"\nTelefon Numarasý : "+telefon);
				System.out.println("------------------------------");
				System.out.println("Lütfen aþaðýda istenilen bilgileri eksiksiz doldurunuz:");
				System.out.println("Kargo içeriðiniz hakkýnda bilgi veriniz :");
				String içerik = input.next();
				System.out.println("Kargo aðýrlýðý :");
				int aðýrlýk = input.nextInt();
				
				break;	
			}
			else if(tür.equals("3")){
			{
				Scanner input = new Scanner(System.in);
				System.out.print("Adýnýz   :");
				String ad = input.next();
				System.out.print("Soyadýnýz :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaranýz   :");
				int telefon = input.nextInt();  
			
				
				System.out.println("------------------------------\nMÜÞTERÝ BÝLGÝLERÝ\n------------------------------");
				System.out.println("VIP Müþteri");
				System.out.println("Adý    : "+ad+"\nSoyadý : "+soyad+"\nAdresi : "+adres+"\nTelefon Numarasý : "+telefon);
				System.out.println("------------------------------");
				System.out.println("Lütfen aþaðýda istenilen bilgileri eksiksiz doldurunuz:");
				
				System.out.println("Kargo içeriðiniz hakkýnda bilgi veriniz :");
				String içerik = input.next();
				System.out.println("Kargo aðýrlýðý :");
				int aðýrlýk = input.nextInt();
				
				break;
				}
			}
			else if(tür.equals("Q"))
				{
				
				Scanner input = new Scanner(System.in);
				System.out.print("Adýnýz   :");
				String ad = input.next();
				System.out.print("Soyadýnýz :");
				String soyad = input.next();
				System.out.print("Adresiniz   :");
				String adres = input.next();
				System.out.print("Telefon Numaranýz   :");
				int telefon = input.nextInt();  
			
			System.out.print("Kayýt iþleminiz baþarýyla oluþturuldu..\n");
				
			System.out.println("------------------------------\nCOOLCARGO AÝLESÝNE HOÞGELDÝNÝZ\n------------------------------");
				System.out.print("Müþteri numaranýz sistem tarafýndan size aktarýlacaktýr.\nKýsa bir süre için NORMAL MÜÞTERÝ kategorisindesiniz. \n");
				System.out.print("Bizi tercih ettikçe müþteri numaranýz deðiþmektedir ve avantajlarýmýzdan yararlanma hakkýnýz giderek artmaktadýr.\n");
				System.out.println("------------------------------\nLÜTFEN BÝZÝ TAKÝTE KALIN\n------------------------------");
				}else if(tür.equals("X")) {
					System.out.println("Çýkýþ Yaptýnýz...");
					break;
				}
			else {
				System.out.println("Geçersiz Bir Deðer Giriniz...");
			}
	}
	}
}

	

