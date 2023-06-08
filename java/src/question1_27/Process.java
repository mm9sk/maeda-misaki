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

		// スキャナーで読み込んだ文字分割し配列に代入
		String[] date = scanner1.split("[:,]");
		
		// 画面表示
		for(int i = 0; i < date.length; i++) {
			if(i == 0 || i == 3 || i == 6 || i == 9 || i == 12 || i == 15) {
				System.out.println("動物名：" + date[i]);
			}else if(i == 1 || i == 4 || i == 7 || i == 10 || i == 13 || i == 16){
				System.out.println("体長：" + date[i] + "m");
			}else if(i == 2 || i == 5 || i == 8 || i == 11 || i == 14 || i == 17){
				System.out.println("速度：" + date[i] + "km/h");
			}switch(i) {
			case 2:
				System.out.println("学名：パンテラ レオ");
				System.out.println("");
				break;
			case 5:
				System.out.println("学名：ロキソドンタ・サイクロティス");
				System.out.println("");
				break;
			case 8:
				System.out.println("学名：アイルロポダ・メラノレウカ");
				System.out.println("");
				break;
			case 11:
				System.out.println("学名：パン・トゥログロディテス");
				System.out.println("");
				break;
			case 14:
				System.out.println("学名：チャップマンシマウマ");
				System.out.println("");
				break;
			case 17:
				System.out.println("学名：不明");
				System.out.println("");
				break;
			}
		}
	}
}