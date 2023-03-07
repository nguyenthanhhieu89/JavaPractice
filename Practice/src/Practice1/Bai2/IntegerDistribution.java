package Practice1.Bai2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class IntegerDistribution {

    private static class Bound {
        private float min;
        private float max;
        private int prize;

        public Bound(float max, int prize) {
            this.max = max;
            this.prize = prize;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }

        public int getPrize() {
            return prize;
        }

        public void setPrize(int prize) {
            this.prize = prize;
        }

        @Override
        public String toString() {
            return "Bound{" +
                    "min=" + min +
                    ", max=" + max +
                    ", prize=" + prize +
                    '}';
        }
    }

    private final List<Bound> bounds;

    public IntegerDistribution(String distribution) {
        this.bounds = Arrays.stream(distribution.split(","))
                .map(s -> {
                    String[] distributionAndValue = s.split("=");
                    float max = Float.parseFloat(distributionAndValue[0]);
                    int value = Integer.parseInt(distributionAndValue[1]);
                    return new Bound(max, value);
                })
                .sorted(Comparator.comparing(Bound::getMax).reversed())
                .collect(Collectors.toList());

        for (int i = 0; i < this.bounds.size(); i++) {
            Bound bound = this.bounds.get(i);
            if (i < this.bounds.size() - 1) {
                bound.setMin(this.bounds.get(i + 1).getMax());
            }
        }
        Bound bound = this.bounds.get(0);
        bound.setMin(bound.getMax());
        bound.setMax(100);
    }

    public void getBounds() {
        System.out.println(this.bounds);
    }

    public Integer getRandom() {

        Random random = new Random();
        int percentage = random.nextInt(100);

        for (Bound bound : this.bounds) {

            boolean match = bound.getMax() * 100 >= percentage && percentage > bound.getMin() * 100;
            if (match) {
                return bound.getPrize();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(Float.parseFloat(String.valueOf(0.5)));
        String distribution = "0.05=1000,0.3=5000,0.15=10000,0.05=1000000";
        IntegerDistribution mysteryBox = new IntegerDistribution(distribution);
        mysteryBox.getBounds();
//        System.out.println(mysteryBox.getRandom());
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < 100; i++) {
//            map.compute(mysteryBox.getRandom(), (k, v) -> v == null ? 1 : v + 1);
//        }
//        System.out.printf(map.toString());
    }
}

