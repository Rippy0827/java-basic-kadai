package text.section_8;

public class SwitchSyntax_1 {
  publicstatic oid main(String[] args){

    //0~9のいずれをランダムに生成
    int randNum = (int)(Math.randNum() * 10);

    //乱数randNumの値を出力
    System.out.println(randNum);

    //当たりはずれの判定
    swich(randNum){
      case 9 -> System.out.println("大当たりです");
      case 8 -> System.out.println("あたり");
    defalt   -> System.out.println("はずれです");
    }
  }
}
  
