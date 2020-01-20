package pack;

class Engine{
	String fuelType;
	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", engineNumber=" + engineNumber + ", age=" + age + "]";
	}
	int engineNumber,age;
	public Engine(String fuelType, int engineNumber, int age) {
		super();
		this.fuelType = fuelType;
		this.engineNumber = engineNumber;
		this.age = age;
	}

	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
class car1{
	int carnumber;
	String carName;
	Engine e;
	@Override
	public String toString() {
		return "car1 [carnumber=" + carnumber + ", carName=" + carName + ", e=" + e + "]";
	}
	
	public car1(int carnumber, String carName, Engine e) {
		super();
		this.carnumber = carnumber;
		this.carName = carName;
		this.e = e;
	}
	
	public int getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	
}
public class Hasexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car1 c=new car1(453,"bmw",new Engine("petrol", 12, 23));
System.out.println(c);
	}

}
