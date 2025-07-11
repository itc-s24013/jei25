public class D51Q6 {
    public static void main(String[] args) {
        Item[] li = {new Item("AA","魚類"), new Item("BB","肉類")};
        Item[] si = {new Item("A1","さば"), new Item("A2", "さんま"),
                     new Item("B1","牛肉"), new Item("B2","鶏肉"),
                     new Item("B3","豚肉"), new Item("B4","加工肉")};
        ItemMaster im = new ItemMaster(li,si);
        String lcode = args[0].substring(0,2); //引数の大分類の部分
        String scode = args[0].substring(2,4); //引数の小分類の部分
        String details = args[0].substring(4); //こいつは表示にしか使わない

        String lname = im.getItemName(im.MAJOR, lcode); //大分類名を入れる
        String sname = im.getItemName(im.MINJOR, scode); //小分類名を入れる
        System.out.println("商品コード:" + args[0]);
        System.out.println("大分類名:" + lname);
        System.out.println("小分類名:" + sname);
        System.out.println("詳細コード:" + details);
    }
}

class Item{
    private String code;
    private String name;
    Item(String code, String name){
        this.code = code;
        this.name = name;
    }
    public String getCode() {return code;}
    public String getName() {return name;}
}

class ItemMaster{
    public int MAJOR = 0; //大分類
    public int MINJOR = 1; //小分類
    private Item[][] items;
    ItemMaster(Item[] major, Item[] minjor){
        items = new Item[2][]; //[大分類リスト],[小分類リスト]なので[2][]
        items[MAJOR] = major; //items[0]に大分類リストを入れる
        items[MINJOR] = minjor; //items[1]に小分類リストを入れる
    }

    public String getItemName(int codeLevel, String code) {
        //codeLevelが大分類と小分類どちらを返すのかを選ぶ
        //codeはargsの大分類または小分類の部分
        for (int i = 0; i < items[codeLevel].length; i++) { //分類の数だけ回す
            if (code.equals(items[codeLevel][i].getCode())) { //codeと分類が一致したら分類の名前を返す
                return items[codeLevel][i].getName(); //大or小分類のコードが一致したitemの名前を返す
            }
        }
        return "(不明)"; //存在しない分類名だった場合不明と返す
    }
}
