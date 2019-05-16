package Problem_2;

public class Pedestrian implements Chargeable{
	public String Social;
	public int Charge=3;
	
	public Pedestrian(String iD) {
		this.Social = iD;
	}

	@Override
	public int charge() {
	
		return Charge;
	}
	
	
	
	
	
	
	
	
	
	

}
