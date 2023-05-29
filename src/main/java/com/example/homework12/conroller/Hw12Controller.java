package com.example.homework12.conroller;

public class Hw12Controller {
    public class Main {
        public static void main (String[] args) {
            Author author1 = new Author("Теодор", "Драйзер");
            Author author2 = new Author("Фёдор", "Достоевский");

            Book book1 = new Book("Финансист", 1912, author1);
            Book book2 = new Book("Преступление и наказание", 1866, author2);
            System.out.println("Автор: " + author1.getFullName());
            System.out.println("Автор: " + author2.getFullName());

            System.out.println("Название книги: " + book1.getName() + ", год издания книги: " + book1.getYear() + ", автор книги: " + book1.getAuthor().getFullName());
            System.out.println("Название книги: " + book2.getName() + ", год издания книги: " + book2.getYear() + ", автор книги: " + book2.getAuthor().getFullName());
        }
    }
}

