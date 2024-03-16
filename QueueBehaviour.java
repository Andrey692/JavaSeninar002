package JavaSeminar002;

public interface QueueBehaviour {
    public void takeInQueue(Actor actor); // добавляем в очередь actor

    public void takeOrders(); // actor делает заказ

    public void giveOrders(); // actor получает заказ

    public void releaseFromQueue(); // actor выходит из очереди

}
