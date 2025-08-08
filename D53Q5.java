public class D53Q5 {
    private static int[] taxes = {8, 10};
    private static int FOODS = 0;
    private static int OTHERS = 1;
    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]); // データ数
        String[] names = new String[dataSize]; // 商品名
        int[] prices = new int[dataSize]; // 単価
        int[] nums = new int[dataSize]; // 数量
        char[] types = new char[dataSize]; // 商品区分

        int argsIdx = 1; // 引数のインデックス
        for (int i = 0; i < dataSize; i++) { // ここではインデックスを1ずつ増やしている
            names[i] = args[argsIdx++]; // 商品名
            prices[i] = Integer.parseInt(args[argsIdx++]); // 単価
            nums[i] = Integer.parseInt(args[argsIdx++]); // 数量
            types[i] = args[argsIdx++].charAt(0); // 商品区分
        }

        System.out.println("商品名\t税抜\t税込\tタイプ");
        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i]; // 税抜き価格
            int zeikomi, taxType; // 税込価格、タイプによる税率の違い
            taxType = types[i] == 'f' ? FOODS : OTHERS;
            zeikomi = (int)(zeinuki * (1 + (double)taxes[taxType] / 100)); // 税込価格計算
            System.out.print(names[i] + "\t" + zeinuki + "\t" + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
        }
    }
    private static String viewType(char c) {
        return c == 'f' ? "食品" : "その他";
    }
}
