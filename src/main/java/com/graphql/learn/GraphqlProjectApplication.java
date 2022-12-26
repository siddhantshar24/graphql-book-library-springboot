package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {
    @Autowired
    private BookService bookService;
    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Book b1=new Book();
        b1.setTitle("Complete Reference");
        b1.setDesc("For learning Java");
        b1.setPages(500);
        b1.setPrice(5000);
        b1.setAuthor("XYZ");

        Book b2=new Book();
        b2.setTitle("Think Java");
        b2.setDesc("For learning Java 2");
        b2.setPages(600);
        b2.setPrice(6000);
        b2.setAuthor("XYZW");

        Book b3=new Book();
        b3.setTitle("Head First Java");
        b3.setDesc("For learning Java 3");
        b3.setPages(700);
        b3.setPrice(7000);
        b3.setAuthor("XWYZ");

        this.bookService.create(b1);
        this.bookService.create(b2);
        this.bookService.create(b3);


    }
}
