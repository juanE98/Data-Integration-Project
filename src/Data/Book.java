package Data;

public class Book {
    private int id;
    private String title;
    private String publication_date;
    private String publisher;
    private String ISBN13;
    private String pages;

    public Book(int id, String title, String publication_date, String publisher,
                String ISBN13, String pages) {
        this.id = id;
        this.title = title;

        this.publication_date = publication_date;
        this.publisher = publisher;
        this.ISBN13 = ISBN13;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public String getPublication_date() {
        return publication_date;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN13() {
        return ISBN13;
    }

    public String getPages() {
        return pages;
    }
}
