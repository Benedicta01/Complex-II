import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create items
        Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orwell", 328);
        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
    // Create patron Benedicta
        Patron Benedicta = new Patron("Benedicta", 1234);
        Benedicta.checkOutItem(book);
        Benedicta.checkOutItem(dvd);
        System.out.println("Benedicta's checked-out items: " + Benedicta.getNumItemsCheckedOut()); // Output: 2

        // Return an item
        Benedicta.returnItem(dvd);
        System.out.println("Benedicta's items after return: " + Benedicta.getNumItemsCheckedOut()); // Output: 1
    }
}