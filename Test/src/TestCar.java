
public class TestCar {
	public static void main(String args[]){
		Car car = new Car("�͑��̎�");
		BlueCar blueCar = new BlueCar("�͑��̐�");
		
		System.out.println(car.getName());
		System.out.println(blueCar.getName());
		System.out.println(blueCar.getColor());
	}
}