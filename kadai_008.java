package kadai_008{

public class Price_Chapter08.java {
	public static void main(String[] args) {
		
//		ランダムで行いたい場合↓
//		int randNum = (int) (Math.random() * 10);
		
		int age = (int) ( 30 / 10 );    //　課題では30代を想定して

		 switch (age) {

		case 1 -> System.out.println("10代の料金は3000円");
		case 2 -> System.out.println("20代の料金は3000円");
		case 3 -> System.out.println("30代の料金は3000円");
		case 4 -> System.out.println("40代の料金は3000円");
		case 5 -> System.out.println("50代の料金は3000円");
		case 6 -> System.out.println("60代の料金は3000円");
		case 7 -> System.out.println("70代の料金は3000円");
		case 8 -> System.out.println("80代の料金は3000円");

		default -> System.out.println("それ以外の料金は500円");
		};
	}
}
}
  
  
