package projekargo;
import projekargo.Tasitlar;

public class Tasitlar {

	
	
		String tnumarasi;
		int maxAgirlik;
	  
		public  Tasitlar(String tNumaras�,int max)
		{
			this.tnumarasi=tNumaras�;
			this.maxAgirlik=max;
			
		}
		
		class Bisiklet  extends Tasitlar{

			public Bisiklet(String tNumaras�, int max) {
				super(tNumaras�, max);
				 max =15;
				// TODO Auto-generated constructor stub
			}
			
			
			
			
		}
	}
	
	
	
	

