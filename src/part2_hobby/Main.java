package part2_hobby;

import books.Book;
public class Main {
    public static void main(String[] args) {
        Book first=new Book("The Hobbit","J. R. R. Tolkien",1937,310);
        Book second=new Book("Animal Farm","George Orwell",1945,112);
        second.setPages(120); first.notes="Fantasy";
        System.out.println(first.getDescription()); System.out.println(second.getDescription());
        System.out.println("First title: "+first.getTitle()+", author: "+first.getAuthor());
    }
}
