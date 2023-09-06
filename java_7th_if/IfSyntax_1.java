package text.section_07{

  public class java_7th{
    public static viod main(String[] args);

    //0~9のいずれかをランダムに生成（乱数を十倍して小数部分を切り捨て(第6章のキャスト演算子より)）
    // randoumはたくさんの小数が出れるようになる。(0~9なら10倍、0~99なら100倍すれば、乱数で出る。)
    int randNum = (int)(Math.random() * 10);

    //乱数randNumの値を出力
    System.out.println(randNum);

    If( randNum == 9 ) {
      System.out.println("大当たりです");
    }
}
}
  
