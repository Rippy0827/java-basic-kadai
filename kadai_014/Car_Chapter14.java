package kadai_014;

//車の状態
public class Car_Chapter14 {
	//車のフィールド
	private int[] speedRange = { 10, 20, 30, 40, 50 };//speedの可動域
	int gear = 0;//gearの役割
	int speed = 0;//speedの役割

	//コンストラクタ(初期化処理)
	public Car_Chapter14() {
		//gearを初期化
		this.gear = 1;
		//speedを初期化
		this.speed = 10;
	}

	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		//ギアと速度の出力
		System.out.println("ギアを" + this.gear + "から" + afterGear + "に変更しました");
		//やってきたgearのデータをnum1に代入(今回のギア)
		this.gear = afterGear;
		//速度の計算(Gearに沿った速度)
		switch (gear) {
		case 1:
			this.speed = speedRange[0];
			break;
		case 2:
			this.speed = speedRange[1];
			break;
		case 3:
			this.speed = speedRange[2];
			break;
		case 4:
			this.speed = speedRange[3];
			break;
		case 5:
			this.speed = speedRange[4];
			break;
		default:
			this.speed = 10;
			break;
		}
	}

	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}


