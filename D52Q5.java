public class D52Q5 {
    public static void main(String[] args) {
        String majors = "+----";
        int LIMIT = 400;
        if(args.length == 0) return;
        int max = 0, i = 0;
        int[] data = new int[args.length];
        for(String s : args) { //argsをひとつずつ見るよ
            data[i] = Integer.parseInt(s); //intに変換
            if(data[i] <= 0 || data[i] >= LIMIT) return; //0以下か400以上だったら終わらせるよ
            if(data[i] > max) { //最大値だったら入れ替えるよ
                max = data[i];
            }
            i++;
        }

        //目盛り表示
        int majormax = (max - 1) / 10 + 1; //目盛りの長さを計算
        System.out.print("       ");
        for (i = 0; i < majormax; i++) { //iを初期化
            System.out.print(majors.charAt(i % 5));
        }
        System.out.println();

        //グラフ表示
        for(i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 10 + 1;
            for ( int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
