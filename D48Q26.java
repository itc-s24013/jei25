public class D48Q26 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i++ < 8){ //判断したあとに足し算される
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }

    public static void maina(String[] args) {
        int i = 0, sum = 0;
        while (++i < 8){ //判断する前に足し算される
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
