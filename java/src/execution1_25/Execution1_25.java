package execution1_25;

//処理用パッケージをインポート
import process1_25.Bean1_25;
import process1_25.Process1_25;

public class Execution1_25 {

	// 実行用パッケージ
	public static void main(String[] args) {
		// Process1_25を呼び出し
		Process1_25 pro = new Process1_25();
		pro.display();
		// Bean1_25を呼び出し
		Bean1_25 msg1 = new Bean1_25();
		System.out.println(msg1.msg);
	}
}