package process1_25;

public class Bean1_25 {

	// フィールドに各項目の変数を定義
	private int hp, mp, atk, spd, def;

	// setter
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setDef(int def) {
		this.def = def;
	}

	// getter
	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAtk() {
		return atk;
	}

	public int getSpd() {
		return spd;
	}

	public int getDef() {
		return def;
	}

	public String msg;

	// コンストラクタを生成
	public Bean1_25() {
		this.msg = "さあ冒険に出かけよう！";
	}
}