package library.Ex11.app;

import library.Ex11.model.Member;
import library.Ex11.service.LibraryService;
import library.Ex12.model.Book;

public class MainApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        Book b1 = new Book("1234", "Murder on the Orient Expres", "Agatha Christie");
        Book b2 = new Book("5678", "And Then There Were None", "Agatha Christie");

        Member m1 = new Member("D001", "Deyae", "deyae@example.com");
        Member m2 = new Member("J002", "Jihane", "jihane@example.com");

        service.addBook(b1);
        service.addBook(b2);
        service.addMember(m1);
        service.addMember(m2);

        System.out.println("Books:");
        service.getBooks().forEach(System.out::println);

        System.out.println("\nMembers:");
        service.getMembers().forEach(System.out::println);
    }

}
