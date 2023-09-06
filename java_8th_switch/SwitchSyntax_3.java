package text.section_08;

public class SwitchSyntax_3{
  public static void main(String[] args) {

  //０～９のいずれかをランダムに生成
  int randNum = (int)(Math.random() * 10);

  //乱数randNumの値を出力
  System.out.println(randNum);

  //あたりはずれの判定
  switch(randNum){
    case 0,9 -> {
      System.out.println("大当たり");
      System.out.println("L.U.C.K.Y!!");
    }
    case 1,8 -> {
      System.out.println("あたり");
    }
    default  -> Systemout.println("ざんね～ん...");
  }
  }
}
