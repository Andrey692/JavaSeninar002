package JavaSeminar002;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human(" John");
        Human human2 = new Human(" Bill");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }

}
