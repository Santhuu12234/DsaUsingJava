final class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();  // dog method
    }
}

/*

OUTPUT:

FinalClassExample.java:7: error: cannot inherit from final Animal
class Dog extends Animal {
                  ^
1 error

*/