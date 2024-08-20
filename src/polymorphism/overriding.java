package polymorphism;

class Animal {
    public void bark() {
        System.out.println("mung mung");
    }
}

class Dog extends Animal {
    @Override
    public void bark() {
        System.out.println("wall wall");
    }
}

public class overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}