package com.wgcisotto.structural.bridge.movieprinter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoviePrinterTest {

    @Test
    public void run(){
        Movie movie = new Movie();

        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        assertEquals("Action\n" +
                "Title:John Wick\n" +
                "Year:2014\n" +
                "Runtime:2:15\n", printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();
        String htmlFormartted = moviePrinter.print(htmlFormatter);

        assertEquals("<table><th>Classification</th><th>Action</th><tr><td>Title</tr></td><tr><td>John Wick</tr></td><tr><td>Year</tr></td><tr><td>2014</tr></td><tr><td>Runtime</tr></td><tr><td>2:15</tr></td></table>", htmlFormartted);

    }

}
