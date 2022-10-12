import java.util.*;

public class GetRandomNumber {
    public static int[] getRandomNumber(int max, int amount) {
        // 1 至 max 之间的 amount 个不同随机整数 包括 1 max
        int[] randomNumber = new int[amount];
        int index = 0;
        randomNumber[0] = -1;
        Random random = new Random();
        while (index < amount) {
            int number = random.nextInt(max) + 1;
            boolean isInArrays = false;
            for (int m : randomNumber) { // m 依次取数组 randomNumber 元素的值
                if (m == number)
                    isInArrays = true; // number 在数组里了
            }

            if (isInArrays == false) {
                // 如果 number 不在数组 randomNumber 中
                randomNumber[index] = number;
                index++;
            }
        }
        return randomNumber;
    }
}