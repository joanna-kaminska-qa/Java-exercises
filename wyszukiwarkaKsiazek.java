import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class wyszukiwarkaKsiazek {
  public static void main(String[] args) {

    Scanner czyMamyPodanegoAutora = new Scanner(System.in);

    System.out.print("Podaj autora:");
    String x = czyMamyPodanegoAutora.nextLine();

    Book book1 = new Book("Wiedźmin", "Andrzej Sapkowski", 1994);
    Book book2 = new Book("Hobbit", "J.R.R. Tolkien", 1937);
    Book book3 = new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 1997);
    Book book4 = new Book("1984", "George Orwell", 1949);
    Book book5 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866);
    Book book6 = new Book("Harry Potter i Komnata Tajemnic", "J.K. Rowling", 1998);

    ArrayList<Book> bookList = new ArrayList<Book>();
    bookList.addAll(Arrays.asList(book1, book2, book3, book4, book5, book6));

    boolean znaleziono = false;

    for (Book b : bookList) {
      if (b.author.toLowerCase().contains(x.toLowerCase())) { // obie strony muszą być zmniejszone do mały liter
        if (!znaleziono) { // używamy "!", bo to tak jakby "past perfect", czyli "jeśli do tej pory jeszcze
                           // nie znaleziono, to wypisz to i potem zmieniamy warunek na true i wypisujemy
                           // kolejne książki już bez nagłówka o znalezeniu książek

          System.out.println("Znaleziono następujące książki podanego autora:\n");
          znaleziono = true;
        }
        System.out.println(b);
      }

    }

    if (!znaleziono) { // jeśli NADAL nie znaleziono, to wypisz, że nie mamy autora w bazie
      System.out.println("Nie znaleziono autora w bazie.");
    }

    czyMamyPodanegoAutora.close();
  }
}

class Book {
  String title;
  String author;
  int yearPublished;

  public Book(String title, String author, int yearPublished) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
  }

  @Override
  public String toString() {
    return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
  }
}
