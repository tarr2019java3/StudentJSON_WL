package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Book book1 = new Book("Potop","Sienkiewicz", "Powiesc");
        Book book2 = new Book("Rusz Glowa","Rowling", "Informatyka");
        Book book3 = new Book("Kubus Puchatek", "Brzechwa", "Bajki");
        Book book4 = new Book("Tolkien", "Wladca Pierscieni", "Powiesc");

        ObjectMapper objectMapper = new ObjectMapper();
        List<Book>  bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        


        objectMapper.writeValue(new File("ksiazki.json"), bookList);
        objectMapper.readValue(new File("ksiazki.json"), Book[].class );

    }
}