package JavaSeminar002;

import java.util.List;

public interface MarketBehaviour {
    public void acceptToMarket(Actor actor); // довавляем actor в магазин

    public void releaseFromMarket(List<Actor> actors); // убираем actor из магазина

    public void update(); // обновляем инфо: 1.прходимся по очереди takeInQueue()
                          // 2.собираем заказы takeOrders()
                          // 3.отдаем заказы giveOrders()
                          // 4.убираем клиента из очереди releaseFromQueue()
                          // 5.убираем клиента из магазина releaseFromMarket(List<Actor> actors)

}
