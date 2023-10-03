package kadai_017;

public abstract class Kato_Chapter17 {

	public String familyName = "";
	public String givenName = "";
	public String address = "";

	public void setGivenName(String familyName, String givenName, String address) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = address;
	}

	public void execIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println(address);
		System.out.println(eachIntroduce());
		System.out.println("");
	}

	//抽象メソッド（好きなこと）
	protected abstract String eachIntroduce();

}
