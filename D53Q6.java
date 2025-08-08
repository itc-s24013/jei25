public class D53Q6 {
    private static String hex = "0123456789ABCDEF";
    public static void main(String[] args) {
        if (args.length != 5) {
            return;
        }
        if (args[0].equals("b")) { // ビットを表す16進数が与えられた場合
            for (int i = 1; i <= 4; i++) {
                int num = hex.indexOf(args[i]); // 16進数での文字をhexのインデックスに変換して10進数にしている
                System.out.println(intTostr(num));
            }
        } else if (args[0].equals("g")) { // 2値画像が入力された場合
            for (int i = 1; i <= 4; i++) {
                System.out.println(strToInt(args[i]));
            }
        }
    }
    public static String intTostr(int x) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            if (x %2 == 0) {
                s = "." + s; // 0ならば"."を追加
            } else {
                s = "o" + s; // 1ならば"o"を追加
            }
            x = x / 2; // 2で割って次のビットへ
        }
        return s; // 4ビット分の文字列を返す
    }
    public static String strToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sum += x;
            }
            x *= 2; // 2の累乗を計算
        }
        return hex.substring(sum,sum+1); // 10進数を16進数に変換して返す
    }
}
