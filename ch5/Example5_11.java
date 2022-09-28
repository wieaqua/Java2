class Animals {
    void cry() {

    }
}

class Dog extends Animals {
    void cry() {
        System.out.println("汪汪……");
    }
}

class Cat extends Animals {
    void cry() {
        System.out.println("喵喵……");
    }
}

public class Example5_11 {
    public static void main(String args[]) {
        Animals animal;
        animal = new Dog();
        animal.cry();
        animal = new Cat();
        animal.cry();
    }
}