package java-basic-kadai;

public class TypeConv_2 {
    public static void main(String[] args) {

        // short型の値をbyte型にキャスト(変換)
        short valShort = 32767;
        byte  valByte  = (byte)valShort; // byte型に収まらず不正値となる
        System.out.println(valByte);

        // double型の値をint型にキャスト(変換)
        double valDouble = 123.456;
        int    valInt    = (int)valDouble; // 小数部分はカットされる
        System.out.println(valInt);
    }
}
