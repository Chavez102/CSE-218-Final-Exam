package Problem_2;

public class Car implements Chargeable{

	public int charge=7;
	public String Licensenum;
	
	
	public Car(String id) {
		this.Licensenum = id;
	}


	@Override
	public int charge() {
		
		return charge;
	}
	
	
	
	
	
	
	
	
}
