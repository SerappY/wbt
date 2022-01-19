package KargoSistemi;
import java.util.*; 

public class Musteriler {
	
	 String ad;
	 String soyad;
     String adres;
	 String telefon;
	// boolean kayitDurumu;
	
	
	public Musteriler (String ad,String soyad,String adres,String telefon ) {
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.telefon = telefon;
		//this.kayitDurumu=kayitDurumu;
	}
}
	
	  class Cip extends Musteriler {
		  
		  
		  public Cip(String ad, String soyad, String adres, String telefon) {
			super(ad, soyad, adres, telefon );
			// TODO Auto-generated constructor stub
		}
		String Mnumarasi;
		   public String Mnumarasi() {
			   return this.Mnumarasi;
		   }
		// display() method to display
		    // the student data
		    public void display()
		    {
		        System.out.println(" müþtrinin adý \t"+ ad +"   müsterinin soyadý \t "+soyad+"    müsteri \t"+adres);
		        System.out.println();
		    }	  
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public  String getAd() {
//		return ad;
//	}
//	public String getSoyad() {
//		return soyad;
//	}
//	public String getAdres() {
//		return adres;
//	}
//	public int getTelefon() {
//		return telefon;
//	}


/*
müþteriler müþteri = new müþteriler("Ahmet","YAKUP","Þabaniye Mahallesi/Van",0543213);
System.out.println(müþteri.getAd());
System.out.println(müþteri.getSoyad());
System.out.println(müþteri.getAdres());
System.out.println(müþteri.getTelefon());
*/