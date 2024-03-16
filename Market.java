package JavaSeminar002;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>(); // создаем список поситителей магазина

    public void acceptToMarket(Actor actor) {
        System.out.println("пришел в магазин" + actor.getName());
        takeInQueue(actor);
    }

    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println("ушел из магазина " + actor.getName());

        }
    }

    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    public void takeInQueue(Actor actor) { // добавляем в очередь actor
        System.out.println("встал в очередь " + actor.getName());
        queue.add(actor);
    }

    public void takeOrders() { // actor делает заказ
        for (Actor actor : queue) { // проходим по списку
            if (!actor.isMakeOrder()) { // если заказ не сделан
                actor.setMakeOrder(true); // создаем заказ
                System.out.println("заказ сделан " + actor.getName());
            }
        }
    }

    public void giveOrders() { // actor получает заказ
        for (Actor actor : queue) { // проходим по списку
            if (actor.isMakeOrder()) { // если заказ сделан
                actor.setTakeOrder(true); // отдаем заказ
                System.out.println("заказ получен " + actor.getName());
            }
        }

    }

    public void releaseFromQueue() { // actor выходит из очереди
        List<Actor> releaseActors = new ArrayList<>(); // создаем новый список для уходящих поситителей
        for (Actor actor : queue) { // проходим по списку
            if (actor.isTakeOrder()) { // если заказ сделан isTakeOrder - true
                releaseActors.add(actor); // добавляем в новый список
                System.out.println("вышел из очереди " + actor.getName());
            }
        }
        releaseFromMarket(releaseActors);
    }

}
