package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {

		// Taroクラスの実行
		Kato_Chapter17 Taro = new KatoTaro_Chapter17();
		Taro.setGivenName("加藤","太郎","住所は東京都中野区〇×です");
		Taro.execIntroduce();

		//Ichiroクラスの実行
		Kato_Chapter17 Ichiro = new KatoIchro_Chapter17();
		Ichiro.setGivenName("加藤","一郎","住所は東京都中野区〇×です");
		Ichiro.execIntroduce();


		// Hanakoクラスの実行
		Kato_Chapter17 Hanako = new KatoHanako_Chapter17();
		Hanako.setGivenName("加藤","花子","住所は東京都中野区〇×です");
		Hanako.execIntroduce();
	}

}
