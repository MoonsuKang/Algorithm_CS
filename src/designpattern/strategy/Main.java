package designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("A", 100);
        Item B = new Item("B", 300);

        cart.addItem(A);
        cart.addItem(B);

        // pay LUNA
        cart.pay(new LUNACardStrategy("LUNA@example.com","1234"));
        // pay KAKAO
        cart.pay(new KAKAOCardStrategy("moonsu kang","123456789","123","08/12"));
    }
}