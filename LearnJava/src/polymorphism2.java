
public class polymorphism2 {

	public static void main(String[] args) {
		Car car = null;   // 형변환시 실제 인스턴스가 무엇인지 중
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;   // 형변

		//car.water();   no member of Car class

		fe2 = (FireEngine)car;   // 형변
		fe2.water();

		FireEngine fe3 = (FireEngine) car ; //ok
		Car car2 = fe3 ;
		car2.drive();

	}

}
class Car{
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}