package text.section_07;

public class IfSyntax_2 {
  public static void main(String[] args) {

  //0~9のいずれかをランダムに生成
  int randNum = (int)(math.random() * 10);

  // 乱数randNumの値を"出力"
  System.out.println(randNum);

  //あたりはずれの判定
  If (randNum == 9)
  {System.out.println("大当たりです");}
    else
    {System.out.println("はずれです")}
  }
}
