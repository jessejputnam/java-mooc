import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty())
                break;

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String toPrint = scanner.nextLine();
        scanner.close();

        for (Book book : books) {
            System.out.println(printSelection(toPrint, book));
        }
    }

    public static String printSelection(String selection, Book book) {
        if (selection.equals("everything"))
            return book.toString();
        else if (selection.equals("name"))
            return book.name();
        else if (selection.equals("pages"))
            return book.pages();
        else if (selection.equals("year"))
            return String.valueOf(book.year());
        else
            return "Invalid input";

    }

}
