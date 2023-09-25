package kadai_014;


public class CarExec_Chapter14 {
	public static void main(String[] args) {

		//速度データを生成
		Car_Chapter14 car = new Car_Chapter14();//実引数

		//Gearをチェンジする。
		car.gearChange(3);

		//速度を表示
		car.run();
	}
}

