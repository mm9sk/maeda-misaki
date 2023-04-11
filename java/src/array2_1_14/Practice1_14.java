
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package array2_1_14;

public class Practice1_14 {

	public static void main(String[] args) {
		String[] alphabet1 = {"a","b","c","d","e","f","g","h","i","j"};
		for (int i = 0 ; i < 10 ; i++){
		      System.out.println(alphabet1[i]);
		      if(i == 3) {
		    	  break;
		      }
		    }	
		
		System.out.println("");
		
		String[] alphabet2 = {"a","b","c","d","e","f","g","h","i","j"};
		for (int i = 0 ; i < 10 ; i++){
			if(i == 8) {
		    	  continue;
		      }
		      System.out.println(alphabet2[i]);
		      
		    }

	}

}