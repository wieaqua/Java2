public class Dog extends Animal {
    String name = "dog";

    public void cry() {
        System.out.println("汪汪汪");
    }

    public String getAnimalName() {
        return name;
    }
}