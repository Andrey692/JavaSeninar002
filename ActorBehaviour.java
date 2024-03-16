package JavaSeminar002;

public interface ActorBehaviour { // public можно не писать, будет по умолчанию

    void setMakeOrder(boolean isMakeOrder); // делает заказ

    void setTakeOrder(boolean isTakeOrder); // получает заказ

    boolean isMakeOrder(); // проверка сделали заказ или нет

    boolean isTakeOrder(); // проверка получили заказ или нет
}
