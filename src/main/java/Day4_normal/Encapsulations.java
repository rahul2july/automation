package Day4_normal;

public class Encapsulations {
	
	private int a ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
	private String ageStatus(){
		
		String stat;
		
		if(a > 18){
			stat="major";
		}else{
			stat="Minor";
		}
		
		return stat;
		
	}
	
	
	public String getAgeStat(){
		
		return ageStatus_new();		
	}
	
	
	private String ageStatus_new(){
		
		String stat;
		
		if(a > 19){
			stat="major";
		}else{
			stat="Minor";
		}
		
		return stat;
		
	}
	
	
	
	
	
	
	
	
	
	

}
