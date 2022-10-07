interface Com {
    public void speak();
}

public class R2 {
    public static void main(String[] args) {
        Com p = new Com() {
            public void speak() {
                System.out.println("p 是接口变量");
            }
        };

        p.speak();
    }
}