package text.section_11.java;

	public class Arry_2 {
	    public static void main(String[] args) {

	    int[] SosuuArray = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97}; //素数配列
    	    int i = 0;             //i:判定される数字

    
    	       for( int num = 3; num <= 101 ; num++ )   {  //num;2から始まる数字を100まで続ける、次からnum+1

    	          if (num / SosuuArray[i] != 0)            //--------割り切れない場合
    	             				
    	          i ++;										//SosuuArry(i(0))に要素を１つ増やす
    	          
    	         SosuuArray[i] = num  ; //SosuuArry(0)にnum(2)をいれる。
    	         System.out.println(num);	//num(2)を出力
    	         
    	         continue;  

    	       }
	    }

}
