public class D53kadaiA {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数を1つ以上指定してください。");
            return;
        }
        int sum = 0;
        for (String num : args) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
