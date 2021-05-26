package Data;

import Oracle.DBConnection;

public class Q6 {

    public static void main(String[] args) {
        //QUESTION 6 (1)
        DBConnection.OpenConnection();
        String query = "SELECT * FROM BOOK3 WHERE MOD(id,100) = 0";
        book3[] books = DBConnection.ExecuteQueryBook3(query);
        DBConnection.CloseConnection();
        System.out.println("SampleSet = " + books.length);

        //QUESTION 6(2)
        int nullCells = nullFields(books);
        System.out.println("NULL fields = " + nullCells);

        //QUESTION 6 (3)
        int COLUMNS = 17;
        int totalCells = books.length * COLUMNS;
        double EPMO = ((double) nullCells / totalCells) * 1000000;
        System.out.println("EPMO = " + EPMO);

    }

    private static int nullFields(book3[] books) {
        int nullCounter = 0;
        for (int i = 0; i < books.length; i++) {

            if (books[i].getAuthor1() == null) {
                nullCounter++;
            }
            if (books[i].getAuthor2() == null) {
                nullCounter++;
            }
            if (books[i].getAuthor3() == null) {
                nullCounter++;
            }
            if (books[i].getDate() == null) {
                nullCounter++;
            }
            if (books[i].getProductDimensions() == null) {
                nullCounter++;
            }
            if (books[i].getSalesRank() == null) {
                nullCounter++;
            }
            if (books[i].getRatingsCount() == null) {
                nullCounter++;
            }
            if (books[i].getRatingValue() == null) {
                nullCounter++;
            }
            if (books[i].getPaperbackPrice() == null) {
                nullCounter++;
            }
            if (books[i].getHardcoverPrice() == null) {
                nullCounter++;
            }
            if (books[i].getEbookPrice() == null) {
                nullCounter++;
            }
            if (books[i].getAudiobookPrice() == null) {
                nullCounter++;
            }
            if (books[i].getPublisher() == null) {
                nullCounter++;
            }
            if (books[i].getISBN13() == null) {
                nullCounter++;
            }
            if (books[i].getPages() == null) {
                nullCounter++;
            }
        }
        return nullCounter;
    }
}
