package question1_30;

class Person {
	// 問題1：インスタンスフィールドを定義してください
	String name;
	int age;
	double height;
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	double weight;

	// 問題2：コンストラクタを定義してください
	// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}