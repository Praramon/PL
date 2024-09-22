class Animal {
    public Animal() {
        System.out.println("create animal");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete animal");
    }

    public void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("dog");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete dog");
    }

    @Override
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public Cat() {
        System.out.println("cat");
    }

    protected void finalize() throws Throwable {
        System.out.println("delete cat");
    }

    @Override
    public void sound() {
        System.out.println("cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();
        d.sound();
        c.sound();
    }
}
