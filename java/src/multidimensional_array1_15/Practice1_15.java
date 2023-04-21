/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array1_15;

public class Practice1_15 {

	public static void main(String[] args) {
		int[][]test = new int[4][];//配列を作成
		test[0] = new int[3];
		test[1] = new int[3];
		test[2] = new int[3];
		test[3] = new int[3];
		
		test[0][0] = 64;//生徒1の国語の点数を格納
		test[0][1] = 73;//生徒1の数学の点数を格納
		test[0][2] = 69;//生徒1の英語の点数を格納
		test[1][0] = 58;//生徒2の国語の点数を格納
		test[1][1] = 81;//生徒2の数学の点数を格納
		test[1][2] = 75;//生徒2の英語の点数を格納
		test[2][0] = 86;//生徒3の国語の点数を格納
		test[2][1] = 68;//生徒3の数学の点数を格納
		test[2][2] = 79;//生徒3の英語の点数を格納
		test[3][0] = 72;//生徒4の国語の点数を格納
		test[3][1] = 55;//生徒4の数学の点数を格納
		test[3][2] = 80;//生徒4の英語の点数を格納
		
		for (int i = 0 ; i < 4 ; i++){
		      System.out.println("生徒"+ (i + 1) + ":国語"+test[i][0]+"点、"+ "数学"+test[i][1]+"点、"+ "英語"+test[i][2]+"点");
			}//格納した点数を表示
		
		System.out.println(""); //改行
		
		int japanese = (test[0][0] + test[1][0] + test[2][0] + test[3][0])/4;//国語の平均点を表示
		System.out.println("国語の平均点は"+japanese+"点です。");
		
		int math = (test[0][1] + test[1][1] + test[2][1] + test[3][1])/4;//数学の平均点を表示
		System.out.println("数学の平均点は"+math+"点です。");
		
		int english = (test[0][2] + test[1][2] + test[2][2] + test[3][2])/4;//英語の平均点を表示
		System.out.println("英語の平均点は"+english+"点です。");
		
		
	}
	
	

}
