enum Signal2 {
    RED, YELLOW, GREEN
}

public class D52Q27 {
    public static void main(String[] args) {
        Signal2 sig = Signal2.YELLOW;
        if (sig == Signal2.GREEN) {
            System.out.println("緑");
        } else if (sig == Signal2.YELLOW) {
            System.out.println("黃");
        } else {
            System.out.println("赤");
        }
    }
}
