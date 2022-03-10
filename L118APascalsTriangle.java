import java.util.ArrayList;
import java.util.List;

public class L118APascalsTriangle {
    public static List<List<Integer>> generate(int rows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            triangle.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                triangle.get(i).add(1);
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < i; j++) {
                triangle.get(i).set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
        }
        return triangle;
    }

    public static void main(String[] args) {

    }
}
