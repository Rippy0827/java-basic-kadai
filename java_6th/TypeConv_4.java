package java-basic-kadai;

//----------小数点以下を「切り捨てたい」とき------------------------------

public class TypeConv_4.java{
  public static void main(String[] args){

  int    price = 298; //価格
  double  tax  = 0.1; //消費税率(%)

  //是永律価格(円)を計算
  int charge = (int) (price + (price * tax));
  System.out.println("税金:"+ charge + "円");
  }
}
