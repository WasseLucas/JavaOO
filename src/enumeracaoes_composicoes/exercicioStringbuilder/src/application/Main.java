package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip! ");
        Comment c2 = new Comment("Wow tha's awesome! ");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeeland",
                "I'm  going to visit this wonderful country! ",
                12
        );
        p1.addComent(c1);
        p1.addComent(c2);

        Comment c3 = new Comment("Good night ");
        Comment c4 = new Comment("May the Force be with you ");

        Post p2 = new Post(
                sdf.parse("28/07/2018 23:18:22"),
                "Good night guys ",
                "See you tomorrou",
                5
        );

        System.out.println(p1);
        System.out.println("--------------------------------");
        System.out.println(p2);
    }
}