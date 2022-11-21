package Collection.Bai1;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> integersList = new ArrayList<>();

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            double random = Math.random();
            random = random * 1000 + 1;
            int randomInt = (int) random;
            integersList.add(randomInt);
        }

        Set<Integer> integerSet = new HashSet<>(integersList);
        for (Integer i : integersList) {
            Integer temp = integerMap.get(i);
            if (temp == null) {
                integerMap.put(i, 1);
            } else {
                temp = temp + 1;
                integerMap.put(i, temp);
            }

        }

//        for (Integer i : integersList) {
//            // so day no = i
//            int count = 0;
//            for (Integer s : integersList) {
//                // so day no = i
//                if (Objects.equals(s, i)) {
//                    count++;
//                }
//            }
//            integerMap.put(i,count);
//        }

//        System.out.println(integersList);
//        System.out.println(integerSet);
        System.out.println(integerMap);
        System.out.println(integersList.size());
        System.out.println(integerMap.size());
        System.out.println(integerSet.size());
    }
}
