package pl.sda.ksiegarnia;

public class Book {

    private String autor;
    private String category;
    private String name;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Book(String autor, String category, String name){
    this.autor = autor;
    this.category = category;
    this.name = name;

    }

}
