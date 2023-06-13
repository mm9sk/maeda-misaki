package process1_29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
都道府県がソートされてコンソールに出力されるように作ってください
※Packageを2つ作ってください
※複数選択できるようにしてください
	
例:
8,5,9,.....
と入力された場合（昇順）
	
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

public class Process1_29 {
	public void display() {
		// 2次元配列を作成
		String[][] date = { { "北海道", "札幌市", "83424" },
				{ "青森県", "青森市", "9646" },
				{ "岩手県", "盛岡市", "15275" },
				{ "宮城県", "仙台市", "7282" },
				{ "秋田県", "秋田市", "11638" },
				{ "山形県", "山形市", "9323" },
				{ "福島県", "福島市", "13784" },
				{ "茨城県", "水戸市", "6097" },
				{ "栃木県", "宇都宮市", "6408" },
				{ "群馬県", "前橋市", "6362" },
				{ "埼玉県", "さいたま市", "3798" }
		};

		// スキャナーを生成
		Scanner sc = new Scanner(System.in);
		System.out.println("コンソールに数字を入力してください");
		String strInput = sc.nextLine();
		System.out.println("コンソールに昇順or降順を入力してください");
		String sort = sc.nextLine();
		sc.close();

		// コンソールに入力された文字をカンマごとに分割
		String[] strSplit = strInput.split(",");
		Integer[] num = Stream.of(strSplit).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);	
		
		// 昇順or降順でソートをかける
		if (sort.equals("昇順")) {
			Arrays.sort(num);
		} else if (sort.equals("降順")) {
			Arrays.sort(num, Collections.reverseOrder());
		}
		
		for (int i = 0; i < num.length; i++) {
			// スキャナーで読み込んだ文字分割し配列に代入
			System.out.println("都道府県名：" + date[num[i]][0]);
			System.out.println("県庁所在地：" + date[num[i]][1]);
			System.out.println("面積：" + date[num[i]][2] + ".0km2\n");
		}
	}
}