public class Application {
    public static void main(String args[]) {

        Simulator simulator = new Simulator();
        Dog dog = new Dog();
        Animal animal = dog;
        simulator.playSound(animal);
        animal = new Cat();
        simulator.playSound(animal);
    }
}