package execution1_22;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

// 処理用パッケージをインポート
import process1_22.Process1_22;

// 実行用パッケージ
public class Execution1_22 {

	public static void main(String[] args) {
		// Process1_22クラスを呼び出してコンソールに出力
		Process1_22 msg1 = new Process1_22();
		System.out.println(msg1.msg1);
		System.out.println(msg1.msg2+msg1.fdate1+msg1.msg3);

	}

}
