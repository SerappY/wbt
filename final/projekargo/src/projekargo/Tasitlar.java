package projekargo;
import projekargo.Tasitlar;

public class Tasitlar {

	
	
		String tnumarasi;
		int maxAgirlik;
	  
		public  Tasitlar(String tNumarasý,int max)
		{
			this.tnumarasi=tNumarasý;
			this.maxAgirlik=max;
			
		}
		
		class Bisiklet  extends Tasitlar{

			public Bisiklet(String tNumarasý, int max) {
				super(tNumarasý, max);
				 max =15;
				// TODO Auto-generated constructor stub
			}
			
			
			
			
		}
	}
	
	
	
	

