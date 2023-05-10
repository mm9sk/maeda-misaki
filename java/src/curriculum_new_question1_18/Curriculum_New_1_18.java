package curriculum_new_question1_18;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void msg(String message1, int message2) {
		System.out.println(message1);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void calculation1(int num1) {
		//num1×num1をコンソールに出力
		System.out.println(num1 *= num1);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array(int array) {
		//配列aを作成
		int[] a = new int[array];
		//配列に整数を格納
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		//for文を使用し順番にコンソールへ出力
		for (int i = 0; i < array; i++) {
			System.out.println(a[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void calculation1(double num1, double num2) {
		//num1＋num2をコンソールに出力
		System.out.println(num1 + num2);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] score(int random) {
		//1～100までのランダムな数字を作成
		Random rnd = new Random();
		//引数の回数分格納
		int[] random1 = new int[random];
		// 格納した値を順番にコンソールで出力
		int min = 1;
		int max = 100;
		for (int j = 0; j < random; j++) {
			int num3 = rnd.nextInt(min, max) + min;
			random1[j] = num3;
			System.out.println(num3);
		}
		return random1;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] average) {
		//引数totalを宣言
		int total = 0;
		//配列averageの要素の合計
		for (int i = 0; i < average.length; i++) {
			total += average[i];
		}
		//合計した配列の平均を引数avgに代入
		double avg = (double) total / average.length;
		return avg;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void msg1(double average) {
		//引数averageの値が50以上ならばtrueそれ以外はfalseをコンソールに出力
		if (average >= 50) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		//Q1呼び出し
		msg("Hello JavaSE 11", 0);
		System.out.println(""); //改行

		//Q2呼び出し
		calculation1(2);
		System.out.println(""); //改行

		//Q3呼び出し
		array(5);
		System.out.println(""); //改行

		//Q4呼び出し
		calculation1(1.4, 1.6);
		System.out.println(""); //改行

		//Q5呼び出し
		int[] random1 = score(5);
		System.out.println(""); //改行

		//Q6呼び出し
		double avg = average(random1);
		System.out.println(average(random1));
		System.out.println(""); //改行

		//Q7呼び出し
		msg1(avg);

	}
}