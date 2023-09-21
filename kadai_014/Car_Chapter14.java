package kadai_014;

public class Car_Chapter14 {

	//車の状態
	public class Product {
		//車のフィールド
		private int[] gear = { 1, 2, 3, 4, 5 };
		private int[] speed = { 10, 20, 30, 40, 50 };
		//配列の呼び出し
		int num1 = 0;
		int num2 = 0;

		//コンストラクタ(初期化処理)
		public Product(int gear[], int speed[]) {
			this.gear = gear;
			this.speed = speed;
		}

		//ギアと速度の出力
		public void SpeedOrder() {
			System.out.println("ギアを" + this.gear[num1] + "から" + this.gear[num2] + "に変更しました");
			System.out.println("速度は時速" + this.speed[num2] + "kmです");
		}

		//上記以外のギア
		//num：gear配列を参照する変数。；・
		public void GearNasi(int num) {
			if (num > 6 || 1 > num) {
				System.out.println("存在しないギアなので時速10kmです");
				return ;
			}
		}
	}
}
