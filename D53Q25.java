public class D53Q25 {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C'};
        String s1 = new String("ABC");
        String s2 = new String(ch);
        boolean b1 = s1.equals(s2);
        boolean b2 = s1.equals(s1);
        System.out.println(b1 +  " " + b2);

        /*
        ==だと文字列ではなく参照先が同じかどうかを見るので正しく判定が出来なくなってしまう。
        なので、文字列での判定が可能な.equalsメソッドを使った。
         */
    }
}
