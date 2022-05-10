package lab10May;

public class Main {

	public static void main(String[] args) {
		
		Mobile myPhone = new Mobile("iPhone", "Black", 2019);
		myPhone.answerCall(true);
		myPhone.dialNumber(796300400);
		Mobile.getCall("Yazan");
		
	}

}
