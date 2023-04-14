// import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println(christmasTree(10));
    }

    // Methods
    public static String printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; i++)
            stars = stars + "*";

        return stars + "\n";
    }

    public static String printSpaces(int number) {
        String spaces = "";
        for (int i = 0; i < number; i++)
            spaces = spaces + " ";

        return spaces;
    }

    public static String printSquare(int size) {
        String square = "";
        for (int i = 0; i < size; i++)
            square += printStars(size);

        return square;
    }

    public static String printRectangle(int width, int height) {
        String rect = "";
        for (int i = 0; i < height; i++)
            rect += printStars(width);

        return rect;
    }

    public static String printTriangle(int size) {
        String triangle = "";
        for (int i = 0; i < size; i++)
            triangle = triangle + printStars(i + 1);

        return triangle;
    }

    public static String printTriangleRight(int size) {
        String triangle = "";
        for (int i = 0; i < size; i++)
            triangle = triangle + printSpaces(size - i - 1) + printStars(i + 1);

        return triangle;
    }

    public static String christmasTree(int size) {
        String tree = "";
        for (int i = 0; i < size; i++)
            tree = tree + printSpaces(size - i - 1) + printStars(2 * i + 1);

        for (int i = 0; i < 2; i++)
            tree = tree + printSpaces(size - 2) + printStars(3);

        return tree;
    }
}