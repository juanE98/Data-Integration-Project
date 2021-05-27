package Data;

/**
 * Class representing Book3 values
 */
public class book3 extends Book {
    private String author1;
    private String author2;
    private String author3;
    private String date;
    private String productDimensions;
    private String salesRank;
    private String ratingsCount;
    private String ratingValue;
    private String paperbackPrice;
    private String hardcoverPrice;
    private String ebookPrice;
    private String audiobookPrice;

    public book3(int id, String title, String author1, String author2, String author3,
                 String publisher, String ISBN13, String date, String pages,
                 String productDimensions,
                 String salesRank, String ratingsCount, String ratingValue, String paperbackPrice,
                 String hardcoverPrice, String ebookPrice, String audiobookPrice) {

        super(id, title, date, publisher, ISBN13, pages);
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.date = date;
        this.productDimensions = productDimensions;
        this.salesRank = salesRank;
        this.ratingsCount = ratingsCount;
        this.ratingValue = ratingValue;
        this.paperbackPrice = paperbackPrice;
        this.hardcoverPrice = hardcoverPrice;
        this.ebookPrice = ebookPrice;
        this.audiobookPrice = audiobookPrice;
    }

    public String getAuthor1() {
        return author1;
    }

    public String getAuthor2() {
        return author2;
    }

    public String getAuthor3() {
        return author3;
    }

    public String getDate() {
        return date;
    }

    public String getProductDimensions() {
        return productDimensions;
    }

    public String getSalesRank() {
        return salesRank;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public String getPaperbackPrice() {
        return paperbackPrice;
    }

    public String getHardcoverPrice() {
        return hardcoverPrice;
    }

    public String getEbookPrice() {
        return ebookPrice;
    }

    public String getAudiobookPrice() {
        return audiobookPrice;
    }
}
