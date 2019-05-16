package Problem_2;

public class Truck implements Chargeable{
	public int charge=10;
	public String licensenum;
	
	
	public Truck(String iD) {
	
		this.licensenum = iD;
	}


	@Override
	public int charge() {
		
		return charge;
	}
	
	
	

}
