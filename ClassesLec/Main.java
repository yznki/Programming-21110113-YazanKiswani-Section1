package ClassesLec;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		System.out.println(student1.studentId);
		System.out.println(student1.studentName);
		System.out.println(student1.studentMajor);
		
		System.out.println();
		
		Car dreamCar = new Car();
		
		System.out.println(dreamCar.color);
		System.out.println(dreamCar.model);
		System.out.println(dreamCar.type);
		
		Mobile myPhone = new Mobile();
		
		myPhone.brand = "iPhone";
		myPhone.camera = "1920 x 1080";
		myPhone.color = "Black";
		myPhone.yearOfProduction = 2019;

		System.out.println();
		
		System.out.println(myPhone.brand);
		System.out.println(myPhone.camera);
		System.out.println(myPhone.color);
		System.out.println(myPhone.yearOfProduction);
		
		System.out.println();
		
		Room engineeringRoom = new Room();
		
		engineeringRoom.roomBuilding = "Workshops";
		engineeringRoom.roomNo = 13;
		engineeringRoom.roomType = "Lab";
		
		Room iTRoom = new Room();
		
		iTRoom.roomBuilding = "IMAN";
		iTRoom.roomNo = 15;
		iTRoom.roomType = "Lab";
		
		System.out.println(engineeringRoom.roomBuilding);
		System.out.println(engineeringRoom.roomNo);
		System.out.println(engineeringRoom.roomType);
		
		System.out.println();
		
		System.out.println(iTRoom.roomBuilding);
		System.out.println(iTRoom.roomNo);
		System.out.println(iTRoom.roomType);
		
	}

}
