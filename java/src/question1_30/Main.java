package question1_30;

import question1_31.Bicycle;
import question1_31.Car;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", 20, 1.7, 60);
		Person person2 = new Person("山田", 20, 1.7, 60);
		
		// car,bicycleをインスタンス化
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		// ownerを設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		person1.buy(car);
		person2.buy(bicycle);
		
		// 課題1_30
		//		System.out.println(person1.name);
		//		System.out.println(person1.age);
		//		System.out.println(person1.height);

		//		Sub print = new Sub();
		//		print.Print("鈴木太郎", 20, 1.7, 60);
		//		System.out.println("合計" + print.i + "人です");
	}
}
