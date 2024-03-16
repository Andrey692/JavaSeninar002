package JavaSeminar002;

abstract class Actor implements ActorBehaviour {

    // создаем три переменные:
    protected String name; // хранит имя клиента

    protected boolean isMakeOrder; // хранит true если сделал заказ и false если нет

    protected boolean isTakeOrder; // хранит true если получил заказ и false если нет

    // создаем конструктор:
    public Actor(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    // создаем абстрактный метод:
    abstract String getName();
}
