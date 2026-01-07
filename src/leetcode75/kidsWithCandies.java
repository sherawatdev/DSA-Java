package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> opList = new ArrayList();
        int maxCandie = candies[0];
        for (int i = 0; i < candies.length -1; i++) {
            if (candies[i] > maxCandie) {
                maxCandie = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandie) {
                opList.add(true);
            } else {
                opList.add(false);
            }
        }
        return opList;
    }
}
