public class D52Q6kadai {
    public static void main(String[] args) {
        Drink2[] dr = {
                new Drink2("Gomacola", 150),
                new Drink2("MrPepper", 130),
                new Drink2("SaltWater", 320)
        };

        String[] scenario = {
                "i 100",
                "p 2",
                "i 500",
                "p 3",
                "c 0"
        };
        VendingMachine2 vm = new VendingMachine2(dr);
        vm.display();
        for (String s : scenario) {
            vm.execCom(s);
        }
    }
}

class Drink2{
    private String name;
    private int price;
    Drink2(String name, int price){
        this.name = name;
        this.price = price;
    }
    public String getname(){ return name; }
    public int getPrice(){ return price; }
    public String toString(){ //名前と価格の文字列フォーマットを決めて返す
        return "[" + name + "]" + price + "円";
    }
}

class VendingMachine2 {
    private Drink2[] drinks;
    private int cash = 0;
    private int[] coins = {500, 100, 50, 10};
    VendingMachine2(Drink2[] drinks){
        this.drinks = drinks;
    }
    public void display(){ //ドリンク一覧の表示
        int idx = 1;
        for (Drink2 drink : drinks){
            System.out.println("[" + idx + "]" + drink);
            idx++;
        }
    }
    public void execCom(String command){ //引数のコマンドを解釈し、適切な処理を行う
        String[] s = command.split(" ");
        switch (s[0]){
            case "i" : //iコマンドの処理
                if (isCoin(s[1])) cash += Integer.parseInt(s[1]); //isCoinはbooleanで返す
                break;
            case "p": //pコマンドの処理
                int idx = Integer.parseInt(s[1]) -1; //指定する番号と配列のインデックスにズレがあるので調整する
                if ( idx < 0 || idx >= drinks.length ) return; //数値情報が1未満、またはドリンクの種類数を超える場合は何もしない
                int price = drinks[idx].getPrice(); //欲しいと言われた商品の値段をとるよ
                if ( price <= cash) { //値段 <= お金
                    eject(idx); //飲み物を出す
                    cash -= price;
                    payChange(); //お釣りを返す
                } else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c": //cコマンドの処理
                payChange();
                break;
            default:
                break;
        }
    }
    private boolean isCoin(String s){
        int c = Integer.parseInt(s);
        for ( int coin : coins ){
            if ( c == coin ) return true;
        }
        return false;
    }
    private void eject(int idx){
        System.out.println(drinks[idx] + " が排出されました");
    }
    private void payChange(){
        if (cash == 0) {
            System.out.println("お釣り なし");
            return;
        }
        String s = "お釣り:";
        for (int coin : coins) {
            if (cash / coin > 0) {
                s += coin + "円:" + (cash / coin) + "枚  ";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}