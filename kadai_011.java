package text.section_11.java;

	public class Arry_2 {
	    public static void main(String[] args) {

	    int[] SosuuArray = {25}; //素数配列
    	    int i = 0;             //i:判定される数字

    
    	       for( int num = 1; num <= 101 ; num++ )   {  //num;2から始まる数字を100まで続ける、次からnum+1
    	       if (num % 2 == 0)			//--------2割り切れない場合
		 if (num == 2) {
		 SosuuArry[i]=num;
		　i++:}

	       if (num % 3 == 0)			//--------3割り切れない場合
		 if (num == 3) {
		 SosuuArry[i]=num;
		 i++;}
			 
	       if (num % 5 == 0)			//--------5割り切れない場合
		 if (num == 5) {
		 SosuuArry[i]=num;
		 i++; }
			 
	       if (num % 7 == 0)			//--------7割り切れない場合
		 if (num == 7) {
		 SosuuArry[i]=num;			 
    	          i ++; }

	       if (num % 13 == 0)			//--------7割り切れない場合
		 if (num == 13) {
		 SosuuArry[i]=num;			 
    	          i ++; }
			 
		else {
		SosuuArry[i] = num;			//SosuuArry(i(0))に要素を１つ増やす
			 
		for (int a : Sosuu Array){ 
    	         System.out.println(a);
    	         
    	         continue;  

    	       }
	    }

}
