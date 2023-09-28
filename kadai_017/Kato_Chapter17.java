package kadai_017;

public abstract class Kato_Chapter17 {

	//実行メソッド
	public void execIntroduce() {
		System.out.println(familyName());
		System.out.println(address());
		System.out.println(yourHobby());
	}

	//抽象メソッド
	abstract protected String familyName();

	//抽象メソッド
	abstract protected String address();

	//抽象メソッド（）
	abstract protected String yourHobby();

}
