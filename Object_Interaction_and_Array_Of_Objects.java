class Book {
    int bookId;
    String title;
    double price;

    Book(int id, String t, double p) {
        bookId = id;
        title = t;
        price = p;
    }
}

public class Q5_BookArray {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1,"Java",600),
            new Book(2,"C++",450),
            new Book(3,"Python",700),
            new Book(4,"DSA",800),
            new Book(5,"OS",400)
        };

        double sum = 0;
        for (Book b : books) {
            sum += b.price;
            if (b.price > 500) {
                System.out.println(b.bookId + " " + b.title + " " + b.price);
            }
        }
        System.out.println("Average Price: " + (sum / books.length));
    }
}
