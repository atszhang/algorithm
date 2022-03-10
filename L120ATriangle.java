import java.util.ArrayList;
import java.util.List;

public class L120ATriangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            dp.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                dp.get(i).add(Integer.MAX_VALUE);
            }
        }
        dp.get(0).set(0, triangle.get(0).get(0));
        for (int i = 0; i < dp.size() - 1; i++) {
            for (int j = 0; j <= i; j++) {
                dp.get(i + 1).set(j, Math.min(dp.get(i + 1).get(j), dp.get(i).get(j) + triangle.get(i + 1).get(j)));
                dp.get(i + 1).set(j + 1, Math.min(dp.get(i + 1).get(j + 1), dp.get(i).get(j) + triangle.get(i + 1).get(j + 1)));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dp.size(); i++  ) {
            min = Math.min(min, dp.get(dp.size() - 1).get(i));
        }
        return min;
    }


    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            triangle.add(new ArrayList<>());
        }
        triangle.get(0).add(-1);
        triangle.get(1).add(2);
        triangle.get(1).add(3);
        triangle.get(2).add(1);
        triangle.get(2).add(-1);
        triangle.get(2).add(-3);
        System.out.println(minimumTotal(triangle));
    }
}
