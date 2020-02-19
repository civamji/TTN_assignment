package java2;
//10. Design classes having attributes and method(only skeleton) for a coffee shop.
public class Q10 {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        Bistro bistro = new Bistro();
        Customer customer = new Customer("Shivam",3999);
        customer.PlaceOrder();
        cashier.takeOrder(customer.getName());
        int token=cashier.giveTokenNo(customer.getName());
        customer.getTokeno(token);
        cashier.receivePayment(customer.getTokeno(token));
        cashier.addItToPendingQueue(customer.getTokeno(token));
        customer.checkOrderStatus(customer.getTokeno(token));
        bistro.getOrderFromPendingQueue();
        bistro.prepareOrder();
        bistro.insertOrderIntoCompletedOrderQueue();
    }
}
