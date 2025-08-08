public class D53kadaiA {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("引数を1つ以上指定してください。");
            return;
        }
        int[] nums = new int[args.length];
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
