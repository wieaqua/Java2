public class Simulator {
    public void playSound(Animal animal) {
        animal.cry();
        System.out.println("动物的种类:" + animal.getAnimalName());
    }
}