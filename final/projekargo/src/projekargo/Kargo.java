	package projekargo;
	import java.util.Scanner;
	import projekargo.Cip;

	public static void main(String[] args ) {
		
	
	     public class Kargo {
		 String kNumarasi;
		 String adi;
		 int agirlik;
	
		public void kargo(String kNumarasi,String adi,int agirlik)
		{
			this.kNumarasi=kNumarasi;
			this.adi=adi;
			this.agirlik=agirlik;
			
		}
		
		
		Cip as [];
		
		Scanner scanner = new Scanner(System.in);
		Scanner input =new Scanner (System.in);
		as = new Cip[10];
		System.out.println("Merhaba Cool_kargoya Ho�geldiniz!\n");
	System.out.println("sistemizde kay�tl�ysan�z  1 e  bas�n��z ");
	System.out.println("sistemizde kay�tl� degils�n�z 2 ye  bas�n��z ");
	
	int a =scanner.nextInt();
	
	switch(a) 
	{ 
	    case 1:
		{
			System.out.println("Ad�n�z� giriniz \n");
		 String ad1 =scanner.nextLine();
		 
		 for(int i=0;i<10;i++) {
		     if(ad1==as[i].ad) 
		    {
		    	 as[i].display();
		    	 break;
			  
		    }
			  
		 
		 }
		 break;
	}
	case 2:
	{  
		System.out.println("Ad�n�z� giriniz ");
	String ad =input.nextLine();
	System.out.println("soyad�n�z giriniz   ");
	String soyad = input.nextLine();
	System.out.println(" Address giriniz  ");
	String adres=input.nextLine();
	System.out.println(" Telefonu giriniz  ");
	    String telefon=input.nextLine();
	   
	    int i=0;
	    while(as[i]!=null)
	    {
	    	i++;
	    }
	    as[i]=new Cip(ad,soyad,adres,telefon);
		  as[i].display();
		  System.out.println(" kullanc� ba�ar�yla kayd�d�ld�    "+i);
			   
				
				
				
			}
		
		}
	}
	 
	}
		
//	System.out.println("Ad�n�z� giriniz \n");
//	 String ad =scanner.nextLine();
//	 System.out.println("soyad�n�z giriniz   \n");
//	 String soyad = scanner.nextLine();
//	 System.out.println(" Address giriniz  \n");
//	 String adres=scanner.nextLine();
//	 System.out.println(" Telefonu giriniz  \n");
//	 String telefon=scanner.nextLine();
//	  //as = new Cip[10];
//	  as[0]=new Cip(ad,soyad,adres,telefon);
//	  as[0].display();
	 
	 


	

