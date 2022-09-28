public class Simulator {
    Animal animal;

    void playSound(Animal animal) {
        animal.cry();
        System.out.println("动物的名字是:" + animal.getAnimalName());
    }
}