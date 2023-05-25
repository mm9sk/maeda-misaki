package question1_23;

/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/

public class Theme2_1_23 {

	public static void main(String[] args) {
		Process1_23 gn = new Process1_23();

		// nameに"ライオン"を代入
		gn.setName("ライオン");
		// コンソールに"動物名：ライオン"と表示
		System.out.println("動物名：" + gn.getName());

		// lengthに"2.1"を代入
		gn.setLenght(2.1);
		// コンソールに"体長：2.1m"と表示
		System.out.println("体長：" + gn.getLenght() + "m");

		// speedに"ライオン"を代入
		gn.setSpeed(80);
		// コンソールに"速度：80km/h"と表示
		System.out.println("速度：" + gn.getSpeed() + "km/h");

	}

}