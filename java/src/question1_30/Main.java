package question1_30;

class Main {
	public static void main(String[] args) {
		// 問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		Sub print = new Sub();
		print.Print("鈴木太郎", 20, 1.7, 60);
		System.out.println("合計" + print.i + "人です");
	}
}