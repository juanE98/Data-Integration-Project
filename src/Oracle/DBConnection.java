package Oracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Data.Book;
import Data.book3;

public class DBConnection {

    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static String username = "S4431796";
    private static String password = "w";
    private static Connection con = null;
    private static Statement stmt = null;

    public static void OpenConnection() {
        try {
            // load the driver class
            Class.forName(driver);

            // create the connection object
            con = DriverManager.getConnection(url, username, password);

            // create the statement object
            stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ExecuteUpdate(String update) {
        try {
            // execute update
            stmt.executeUpdate(update);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void CloseConnection() {
        try {
            // close the connection object
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static book3[] ExecuteQueryBook3(String query) {
        List<book3> bookList = new ArrayList<>();
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String author1 = rs.getString(3);
                String author2 = rs.getString(4);
                String author3 = rs.getString(5);
                String publisher = rs.getString(6);
                String ISBN13 = rs.getString(7);
                String publishDate = rs.getString(8);
                String pages = rs.getString(9);
                String ProductDimensions = rs.getString(10);
                String SalesRank = rs.getString(11);
                String RatingsCount = rs.getString(12);
                String RatingValue = rs.getString(13);
                String PaperbackPrice = rs.getString(14);
                String HardcoverPrice = rs.getString(15);
                String EbookPrice = rs.getString(16);
                String AudiobookPrice = rs.getString(17);
                book3 book = new book3(id, title, author1, author2, author3, publisher, ISBN13,
                        publishDate, pages, ProductDimensions, SalesRank, RatingsCount,
                        RatingValue, PaperbackPrice, HardcoverPrice, EbookPrice, AudiobookPrice);
                bookList.add(book);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        book3[] books = new book3[bookList.size()];
        Iterator<book3> it = bookList.iterator();
        for (int i =0; i < bookList.size(); i++) {
            books[i] = it.next();
        }
        return books;
    }
}
