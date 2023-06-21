package question1_31;

class Person {
	// インスタンスフィールドを定義
	String name1;
	String name2;
	int age;
	double height;
	double weight;
	private String fullName;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name1, String name2, int age, double height, double weight) {
		this.name1 = name1;
		this.name2 = name2;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullNameメソッドを定義
	public String fullName() {
		this.fullName = name1 + name2;
		return fullName;
	}

	// 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	public void buy(Car car) {
		// 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.fullName);
		// 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");
	}

	// 問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}