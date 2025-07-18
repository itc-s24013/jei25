public class D52ensyu {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Horse horse = new Horse();

        animal.bark();
        cat.bark();
        horse.bark();
    }
}

class Animal {
    public void bark(){
        System.out.println("鳴き声をあげる");
    }
}

class Cat extends Animal {
    public void bark() {
        System.out.println("ニャー");
    }
}

class Horse extends Animal {
    public void bark() {
        System.out.println("ヒヒーン");
    }
}