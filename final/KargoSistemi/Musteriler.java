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
		        System.out.println(" m��trinin ad� \t"+ ad +"   m�sterinin soyad� \t "+soyad+"    m�steri \t"+adres);
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
m��teriler m��teri = new m��teriler("Ahmet","YAKUP","�abaniye Mahallesi/Van",0543213);
System.out.println(m��teri.getAd());
System.out.println(m��teri.getSoyad());
System.out.println(m��teri.getAdres());
System.out.println(m��teri.getTelefon());
*/