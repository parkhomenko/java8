package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMapping {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0)
        );

        books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getPrice, (v1, v2) -> v2))
                .forEach((a, b) -> System.out.println(a + " " + b));
    }

    private static class Book {
        private String title;
        private double price;

        Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
