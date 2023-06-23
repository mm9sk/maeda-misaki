package question1_32;

class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		this.count++;
	}

	// bmiメソッドを定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// printメソッドを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("合計" + this.count + "人です\n");
	}
	
	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	public static void printCount() {
		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// クラスフィールドcountを定義
		int count = person1.count + person2.count;
		// コンソールに出力
		System.out.println("合計" + count + "人です");
	}
}