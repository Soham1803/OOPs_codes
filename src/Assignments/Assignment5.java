package Assignments;

import java.util.*;
class Order {

    private int id;
    private List<String> itemList = new ArrayList<>();
    private boolean cashOnDelivery;

    public Order(int id, List<String> itemList, boolean cashOnDelivery){
        this.id = id;
        this.itemList = itemList;
        this.cashOnDelivery = cashOnDelivery;

    }

    // add your code here

    @Override
    public String toString() {
        return "Order Id: "+getOrderId()+", Item names: "+getItemNames()+", Cash on delivery: "+isCashOnDelivery();
    }

    public boolean isCashOnDelivery() {
        return this.cashOnDelivery;
    }

    public List<String> getItemNames() {
        return this.itemList;
    }

    public int getOrderId() {
        return this.id;
    }

}


public class Assignment5 extends Order {

    public Assignment5(int id, ArrayList<String> itemList, boolean cashOnDelivery) {
        super(id, itemList, cashOnDelivery);
    }

    public static List<String> getItems(List<Order> orders) {
        List<String> items = new ArrayList<>();

        for(Order itr: orders){
            items.addAll(itr.getItemNames());
        }

        return items;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<Order>();
        //List<String> itemNames = null;
        List<String> items1 = new ArrayList<String>();
        items1.add("Sportswear");
        items1.add("Dumbell");
      /*  items1.add("Belt");*/
        orders.add(new Order(311, items1, true));

        List<String> items2 = new ArrayList<String>();
        items2.add("Jeans");
        orders.add(new Order(102, items2, true));

        List<String> items3 = new ArrayList<String>();
       /* items3.add("Tie");*/
        items3.add("SmartWatch");
        items3.add("Fitnessband");
        items3.add("Joggers");
        orders.add(new Order(103, items3, true));

        List<String> items = getItems(orders);

        System.out.println("List of Items:");

        for (String item : items) {
            System.out.print(item+", ");
        }
    }
}
