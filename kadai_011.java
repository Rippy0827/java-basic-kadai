package text.section_011;

public class Arry_2 {
	public static void main(String[] args) {

		int[] SosuuArray = new int[25]; //素数配列
		int i = 0; //i:判定される数字

		for (int num = 1; num < 101; num++) { //num;2から始まる数字を100まで続ける、次からnum+1
			if (num % 2 == 0) //--------2で割り切れる場合
				if (num == 2) {//-------2の場合
					SosuuArray[i] = num;//--素数2をSosuuArrayに収容
					i++;
					continue;
				}

			if (num % 3 == 0) //--------3割り切れる場合
				if (num == 3) {
					SosuuArray[i] = num;
					i++;
					continue;
				}

			if (num % 5 == 0) //--------5割り切れる場合
				if (num == 5) {
					SosuuArray[i] = num;
					i++;
					continue;
				}

			if (num % 7 == 0) //--------7割り切れる場合
				if (num == 7) {
					SosuuArray[i] = num;
					i++;
					continue;
				}

			if (num != 1)
				if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
					SosuuArray[i] = num;
					i++;
					continue;
				}
					/*			for (int outNum : SosuuArray)
									//出力する
									System.out.println(outNum);*/

			}
			for (int a = 0 ; a < SosuuArray.length ; a++) {
				System.out.println(SosuuArray[a]);
		}	
	}
}
