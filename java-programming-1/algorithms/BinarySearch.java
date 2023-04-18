import java.util.ArrayList;

public class BinarySearch {
    public static int getIdx(ArrayList<Book> books, int id) {
        int start = 0;
        int end = books.size() - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (id == mid) {
                return mid;
            }

            if (id < mid) {
                end = mid;
            } else {
                start = mid;
            }
        }

        return -1;
    }
}
