package process1_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 処理用パッケージ
public class Process1_22 {
	public String msg1;
	public String msg2;
	public String msg3;

	public Process1_22() {
		// msg1に"こんにちは！ここは日本です！""この寿司はうまい""寿司は和食です"を代入
		this.msg1 = "こんにちは！ここは日本です！\r\nこの寿司はうまい\r\n寿司は和食です";
		// msg2に"今の現在日時は"を代入
		this.msg2 = "今の現在日時は";
		// msg3に"です"を代入
		this.msg3 = "です";
	}

	// 現在日時を取得かつ形式を指定
	LocalDateTime date1 = LocalDateTime.now();
	DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
	public String fdate1 = dtformat.format(date1);
}