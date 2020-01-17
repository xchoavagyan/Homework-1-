package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	    3. Create  classes Book and Author
        Author
        name(String)
        surname (String)
        gender ( enum - > MALE, FEMALE, OTHER )

        Book
        title (String)
        authors (array of type Author)
        price (double)

        Create a Book in main with multiple Authors

	 */
        Author author1 = new Author();
        author1.setGender(Gender.FEMALE);
        author1.setName("Silva");
        author1.setSurname("Kaputikyan");

        Author author2 = new Author("Hovhannes", "Shiraz", Gender.MALE);

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        Book book = new Book("Сollection of poems", authors, 5000);
        System.out.println("---------Presenting you our book----------");
        System.out.println(book.getAuthors().get(0).getName() + " " + book.getAuthors().get(0).getSurname() + " & " + book.getAuthors().get(1).getName() + " " + book.getAuthors().get(1).getSurname());
        System.out.println(book.getTitle());
        System.out.println("Cost : " + book.getPrice());


    }
}
