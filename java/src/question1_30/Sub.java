package question1_30;

public class Sub {

	String name;
	int age;
	double height;
	double weight;
	double bmi;
	int i;

	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	public double Bmi() {
		// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
		return bmi;
	}

	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	public void Print(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bmi = Math.floor(weight / (height * height));
		this.i++;
		// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
		// 問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("名前は" + this.name + "です\n年は" + this.age + "才です\nBMIは" + bmi + "です\n");
	}
}