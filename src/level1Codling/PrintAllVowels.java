package level1Codling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrintAllVowels {
    public static void main(String[] args) {
        String s = "aqwrefcsdsasdesdudiif";
        HashSet<Character> set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        List<Character> charList = new ArrayList();
        for (int i = 0; i< s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                charList.add(s.charAt(i));
            }
        }
        System.out.println(charList);
    }
}
