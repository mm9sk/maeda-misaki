


package question1_30;

import question1_31.Bicycle;
import question1_31.Car;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	private String fullName;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// fullNameメソッドを定義
	public String fullName() {
		this.fullName = name;
		return fullName;
	}
	
	// buyメソッドを定義
	public void buy(Car car) {
		car.setOwner(this.fullName);
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}