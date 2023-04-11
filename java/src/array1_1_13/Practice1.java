/*
	int型の配列aを作成してください。
	配列aに1～5の数字を格納してください。
	繰り返し処理を使用し、
	配列aの数字を順番に表示させてください。

	出力結果：1
			  2
			  3
			  4
			  5
*/
package array1_1_13;

public class Practice1 {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for (int i = 0 ; i < 5 ; i++){
		      System.out.println(a[i]);
		    }	
	}

}