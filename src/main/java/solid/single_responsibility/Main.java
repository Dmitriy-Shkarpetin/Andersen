package solid.single_responsibility;

/**
 * Рассмотрим приложение для доставки еды, которое принимает заказы на еду, рассчитывает счет и доставляет его клиентам.
 * У нас может быть 1 отдельный класс для каждой из выполняемых задач, а затем основной класс может просто вызывать эти
 * классы, чтобы выполнять эти действия одно за другим.
 */
public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(); // заказчик
        customer1.setName("John");
        customer1.setAddress("Pune");
        Order order1 = new Order(); // заказ
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomer(customer1);

        order1.prepareOrder();

        BillCalculation billCalculation = new BillCalculation(order1); //счет
        billCalculation.calculateBill();

        DeliveryApp deliveryApp = new DeliveryApp(order1);
        deliveryApp.delivery();
    }
}











