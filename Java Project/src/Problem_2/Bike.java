package Problem_2;

public class Bike  implements Chargeable{
	public int charge=4;
	String VinNum;
	public Bike(String iD) {
		this.VinNum = iD;
	}
	
	@Override
	public int charge() {
		// TODO Auto-generated method stub
		return charge;
	}
	
	
	
}
