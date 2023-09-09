package text.section_11.java;

	public class Arry_2 {
	    public static void main(String[] args) {

		    int[] SosuuArray = {2}; //素数配列
    	    int i = 0;             //i:判定される数字

    
    	       for( int num = 3; num <= 101 ; num++ )   {  //num;2から始まる数字を100まで続ける

    	          if (num / SosuuArray[i] != 0)            //--------割り切れない場合
    	             System.out.println(num);				//num(2)を出力
    	         

    	              	          
    	          
    	          i ++;										//SosuuArry(i(0))に要素を１つ増やす
    	          
    	         SosuuArray[i] = num  ; //SosuuArry(0)にnum(2)をいれる。
    	         
    	         
    	         continue;  

    	       }
	    }

}
