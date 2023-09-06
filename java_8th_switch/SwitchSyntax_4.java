package text.section_08;

public class SwitchSyntax_4 {
    public static void main(String[] args) {

        int  ranking =  1; // 順位
        String award = ""; // 賞品名

        // 順位に応じた賞品名を取得
        award = switch(ranking) {
            case 1  -> "金メダル";
            case 2  -> "銀メダル";
            case 3  -> "銅メダル";
            default -> "参加賞";
        };           //　この行、重要！！！

        // 賞品名を表示
        System.out.println(award);
    }
}
