package solid.single_responsibility;

/**
 * У DeliveryApp есть 1 задача по доставке заказа покупателю. В реальном мире эти классы были бы более сложными и могли
 * бы потребовать дальнейшего разбиения их функциональности на несколько классов.
 */
class DeliveryApp {

    private Order order;

    public DeliveryApp(Order order) {
        this.order = order;
    }

    public void delivery() {
        System.out.println("Delivering the order");
        System.out.println(
                "Order with order id as "
                        + this.order.getOrderId()
                        + " being delivered to "
                        + this.order.getCustomer().getName());
        System.out.println(
                "Order is to be delivered to: "
                        + this.order.getCustomer().getAddress());
    }
}