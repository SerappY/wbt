package projekargo;

import projekargo.Musteriler;

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
	
	
	
	

