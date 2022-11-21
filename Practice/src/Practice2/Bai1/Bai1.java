package Practice2.Bai1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<String> stringList = new ArrayList<>();
        char s1;
        String s = "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";
        for (int i = 0; i < s.length(); i++) {
            s1 = s.charAt(i);
//            System.out.println(s1);
            stringList.add(String.valueOf(s1));
        }
//        System.out.println(stringList);
        for (String i: stringList) {
            Integer temp = map.get(i);
            if (temp == null) {
                map.put(i,1);
            }
            else {
                temp = temp + 1;
                map.put(i,temp);
            }
        }
        System.out.println(map);
    }
}
