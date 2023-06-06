package question1_27;

import java.util.Scanner;

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
コンソールに文字を入力してください
動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/

public class Process {
	public void dispName() {
		//スキャナーを生成
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String scanner1 = sc.next();
		sc.close();

		// スキャナーで読み込んだ文字を":"で分割し、その後","で分割し配列に代入
		String[] date = scanner1.split("[:,]");

		// 画面表示
		System.out.println("動物名：" + date[0]);
		System.out.println("体長：" + date[1] + "m");
		System.out.println("速度：" + date[2] + "km/h");
		System.out.println("学名：パンテラ レオ");
		System.out.println("");
		System.out.println("動物名：" + date[3]);
		System.out.println("体長：" + date[4] + "m");
		System.out.println("速度：" + date[5] + "km/h");
		System.out.println("学名：ロキソドンタ・サイクロティス");
		System.out.println("");
		System.out.println("動物名：" + date[6]);
		System.out.println("体長：" + date[7] + "m");
		System.out.println("速度：" + date[8] + "km/h");
		System.out.println("学名：アイルロポダ・メラノレウカ");
		System.out.println("");
		System.out.println("動物名：" + date[9]);
		System.out.println("体長：" + date[10] + "m");
		System.out.println("速度：" + date[11] + "km/h");
		System.out.println("学名：パン・トゥログロディテス");
		System.out.println("");
		System.out.println("動物名：" + date[12]);
		System.out.println("体長：" + date[13] + "m");
		System.out.println("速度：" + date[14] + "km/h");
		System.out.println("学名：チャップマンシマウマ");
		System.out.println("");
		System.out.println("動物名：" + date[15]);
		System.out.println("体長：" + date[16] + "m");
		System.out.println("速度：" + date[17] + "km/h");
		System.out.println("学名：不明");
	}
}