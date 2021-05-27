package Data;

import Oracle.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class JaccardLinkage {

    private static double threshold = 0.75;
    private static int q = 3;

    public static void main(String[] args) {
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
        for (int i = 0; i < books1.length; i++) {
            book1 = books1[i];
            id1 = book1.getId();
            title1 = book1.getTitle();
            for (int j = 0; j < books2.length; j++) {
                book2 = books2[j];
                id2 = book2.getId();
                title2 = book2.getTitle();
                if (title1 != null && title2 != null) {
                    double sim = Similarity.CalcuJaccard(title1, title2, q);
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
