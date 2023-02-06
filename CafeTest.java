import java.util.ArrayList;

class CafeTest {
    public static void main(String[] args) {
        // Creating an array list of orders to keep track of all orders
        ArrayList<Order> orders = new ArrayList<Order>();

        // Creating the items to be used for the orders
        Item espresso = new Item("mocha", 2.5);
        Item drip = new Item("drip coffee", 3.0);
        Item cappuccino = new Item("cappuccino", 3.5);
        Item latte = new Item("latte", 4.0);
        Item mocha = new Item("mocha", 4.5);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        orders.add(order1);
        Order order2 = new Order();
        orders.add(order2);

        // Create 3 orders using the overloaded constructor to give each a name for the
        // order.
        Order order3 = new Order("Cindhuri");
        orders.add(order3);
        Order order4 = new Order("Jimmy");
        orders.add(order4);
        Order order5 = new Order("Noah");
        orders.add(order5);

        // Add at least 2 items to each of the orders using the addItem method you
        // wrote, for example, to add item1 to order3 you would need to call the addItem
        // method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(espresso);
        order1.addItem(mocha);

        order2.addItem(latte);
        order2.addItem(drip);

        order3.addItem(drip);
        order3.addItem(drip);

        order4.addItem(cappuccino);
        order4.addItem(mocha);

        order5.addItem(espresso);
        order5.addItem(cappuccino);

        // Test your getStatusMessage functionality by setting some orders to ready and
        // printing the messages for each order. For example: order2.setReady(true);
        // System.out.println(order2.getStatusMessage());

        order1.setStatus(true);
        System.out.println(order1.getStatusMessage());

        // Test the total by printing the return value like so:
        // System.out.println(order1.getOrderTotal());

        System.out.println(order2.getOrderTotal());

        // Finally, call the display method on all of your orders, like so:
        // order3.display();
        for (Order order : orders) {
            order.display();
        }
    }
}