public class Cat extends Animal {
    String name = "cat";

    public void cry() {
        System.out.println("喵");
    }

    public String getAnimalName() {
        return name;
    }
}