package designpattern.singleton;

public class HelloWorld {
    public static void main(String[] args) {
        SingleTon a = SingleTon.getInstance();
        SingleTon b = SingleTon.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a == b) {
            System.out.println(true);
        }
    }
}
