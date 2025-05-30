public class D50Q23 {
    String code;
    public static void main(String[] args) {
        D50Q23 obj = new D50Q23();
        obj.setCode("Code");
        System.out.println(obj.getCode());
    }

    void setCode(String c) {
        this.code = c;
    }

    public String getCode() {
        return code;
    }
}
