package question1_33;

class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	// 問題1：インスタンスフィールドに「lastName」を追加しましょう
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// fullNameメソッドを定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// printメソッドを定義
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// bmiメソッドを定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// クラスメソッド「printCount」を定義
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

	// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	Person(String firstName, String lastName, int age, double height, double weight) {
		/* 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加し
		lastNameフィールドの値をセットしてください*/
		Person.count++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}