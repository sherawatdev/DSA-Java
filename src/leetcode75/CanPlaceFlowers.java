package leetcode75;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0,0,1,0,0};
        int n = 3;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                i++;
            }
        }
        return !(n > 0);
    }
}
