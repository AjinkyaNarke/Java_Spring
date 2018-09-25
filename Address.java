package Beans;

public class Address {
	
	private int Aid;

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	@Override
	public String toString() {
		return "Address [Aid=" + Aid + "]";
	}

}
