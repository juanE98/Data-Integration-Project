package Data;

import Oracle.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class JaccardLinkage {

    /**
     * Threshold used
     */
    private static double threshold = 0.75;
    /**
     * Q gram token
     */
    private static int q = 3;

    public static void main(String[] args) {
        //Connect to database and retrieve data from Book1, Book2.
        DBConnection.OpenConnection();
        String query = "SELECT * FROM BOOK1";
        String query2 = "SELECT * FROM BOOK2";
        Book[] books1 = DBConnection.ExecuteQuery(query);
        Book[] books2 = DBConnection.ExecuteQuery(query2);
        DBConnection.CloseConnection();

        List<String> result = new ArrayList<>();
        Book book1 = null, book2 = null;
        int id1 = 0, id2 = 0;
        String title1 = null, title2 = null;
        long start = System.currentTimeMillis();
        //Iterate through all records of Book1
        for (int i = 0; i < books1.length; i++) {
            book1 = books1[i];
            id1 = book1.getId();
            title1 = book1.getTitle();
            //Iterate through all records of Book2
            for (int j = 0; j < books2.length; j++) {
                book2 = books2[j];
                id2 = book2.getId();
                title2 = book2.getTitle();
                //Skip comparison with NULL values contained in Book1
                if (title1 != null && title2 != null) {
                    //Calculate Jaccard coefficient
                    double sim = Similarity.CalcuJaccard(title1, title2, q);
                    //If reaches threshold, adds to the list to be compared to the gold standard
                    if (sim >= threshold)
                        result.add(id1 + "," + id2);
                }
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time=" + time + "ms");

        Measurement.LoadBenchmark();
        Measurement.CalcuMeasure(result);

    }
}
