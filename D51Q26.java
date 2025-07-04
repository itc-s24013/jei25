public class D51Q26 {
    public static void main(String[] args) {
        /*
        break文はループやswitch文を途中で抜けることが出来る
        break文がなければcaseがtrueだった時から下の処理が全て実行されてしまう。これをfall throughという。
         */
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            case 3:
                s += "three";
                break;
        }
        System.out.println(s);
    }
}
