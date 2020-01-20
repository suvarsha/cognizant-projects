package pack;

public class Address {
	int pinCode;
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", landMark=" + landMark + ", housenumber=" + housenumber + "]";
	}
	String landMark;
	int housenumber;
	public Address(int pinCode, String landMark, int housenumber) {
		super();
		this.pinCode = pinCode;
		this.landMark = landMark;
		this.housenumber = housenumber;
	}
	
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public int getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}
	

}
