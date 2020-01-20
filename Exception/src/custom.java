
 class InvalidException extends Exception{
	 InvalidException(String s){
	 super(s);
 }
 }
public class custom{
	static void  validate(int age)throws InvalidException{
		if(age<18){
			throw new InvalidException("not valid");
		}
		else{
			System.out.println("can vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			validate(18);
		}
		catch(Exception e){
			System.out.println("exception occured");
		}
		System.out.println("remaining code");
	}

}
