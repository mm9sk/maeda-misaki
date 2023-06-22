package question1_32;

class Main {
	public static void main(String[] argos) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 問題3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
		System.out.println("合計" + (person1.count + person2.count) + "人です\n");
		
		// 問題6：クラスメソッド「printCount」を呼び出してください
		Sub.printCount();
	}
}

class Sub {
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