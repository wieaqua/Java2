abstract class GirlFriend { // 抽象类 封装了两个行为标准
    abstract void speak();

    abstract void cooking();
}

class ChinaGirlFriend extends GirlFriend {
    void speak() {
        System.out.println("你好");
    }

    void cooking() {
        System.out.println("水煮鱼");
    }
}

class AmericanGirlFriend extends GirlFriend {
    void speak() {
        System.out.println("hello");
    }

    void cooking() {
        System.out.println("roast beef");
    }
}

class Boy {
    GirlFriend friend;

    void setGirlfriend(GirlFriend f) {
        friend = f;
    }

    void showGirlFriend() {
        friend.speak();
        friend.cooking();
    }
}

public class Example5_12 {
    public static void main(String args[]) {
        GirlFriend girl = new ChinaGirlFriend(); // girl 是上转型对象
        Boy boy = new Boy();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
        girl = new AmericanGirlFriend();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
    }
}