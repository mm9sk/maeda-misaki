package process1_25;

import java.util.Random;
import java.util.Scanner;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください  
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 ︎packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

// 処理用パッケージ
public class Process1_25 {
	
	// Bean1_25クラスを呼び出し
	Bean1_25 gs = new Bean1_25();

	// ランダム生成
	public static int rand() {
		Random r = new Random();
		int random = r.nextInt(1000) + 1;
		return random;
	}

	// hp, mp, atk, spd, defへランダムな値を代入
	public int hp() {
		gs.setHp(rand());
		return gs.getHp();
	}

	public int mp() {
		gs.setMp(rand());
		return gs.getMp();
	}

	public int atk() {
		gs.setAtk(rand());
		return gs.getAtk();
	}

	public int spd() {
		gs.setSpd(rand());
		return gs.getSpd();
	}

	public int def() {
		gs.setDef(rand());
		return gs.getDef();
	}
	
	// スーパークラスを作成
	class superClass {
		public void dispName() {
			System.out.print("名前を入力してください＞");
		}
	}
	
	// サブクラスを作成
	class subClass extends superClass {
		// dispNameメソッドのオーバーライド
		public void dispName() {
			// スキャナーを生成
			Scanner scanner = new Scanner(System.in);
			super.dispName();
			String name = scanner.nextLine();
			scanner.close();
			// 入力された文字とあいさつをコンソールに出力
			System.out.println("こんにちは 「" + name + "」 さん");
			// 各ステータスをコンソールに出力
			System.out.println("ステータス");
			System.out.println("HP:" + hp());
			System.out.println("MP:" + mp());
			System.out.println("攻撃力:" + atk());
			System.out.println("素早さ:" + spd());
			System.out.println("防御力:" + def());
			System.out.println();
			System.out.println("さあ冒険に出かけよう！");
		}
	}
	
	public void display() {
		superClass name = new subClass();
		name.dispName();
	}

}