package Oracle;

import java.io.*;

public class InsertTable {
    public static void main(String[] args) {

    }

    private static void book1Values() {
        DBConnection.OpenConnection();
        try {
            File file = new File("dataset\\Book1.csv");
            if (!file.exists())
                System.out.println("No file");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null, insert = null;
            String[] tokens = null;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("'", " ");
                tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                insert =
                        "INSERT INTO BOOK1 VALUES (" + tokens[0] + ", '" + tokens[1] +
                                "')";
                DBConnection.ExecuteUpdate(insert);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        DBConnection.CloseConnection();
    }

    private static void book2Values() {
        DBConnection.OpenConnection();
        try {
            File file = new File("dataset\\Book2.csv");
            if (!file.exists())
                System.out.println("No file");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null, insert = null;
            String[] tokens = null;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("'", " ");
                tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                insert =
                        "INSERT INTO BOOK2 VALUES (" + tokens[0] + ", '" + tokens[1] +
                                "')";
                DBConnection.ExecuteUpdate(insert);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        DBConnection.CloseConnection();
    }

    private static void book3Values() {
        DBConnection.OpenConnection();
        try {
            File file = new File("dataset\\Book3.csv");
            if (!file.exists())
                System.out.println("No file");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null, insert = null;
            String[] tokens = null;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("'", " ");
                tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                insert =
                        "INSERT INTO BOOK3 VALUES (" + tokens[0] + ", '" + tokens[1] + "', '" + tokens[2] + "', '"
                                + tokens[3] + "', '" + tokens[4] + "', '" + tokens[5] + "', '" + tokens[6]
                                + "', '" + tokens[7] + "', '" + tokens[8] + "', '" + tokens[9] +
                                "', '" + tokens[10] + "', '" + tokens[11] + "', '" + tokens[12] + "', '" + tokens[13] + "', '"
                                + tokens[14] + "', '" + tokens[15] + "', '" + tokens[16] +
                                "')";
                DBConnection.ExecuteUpdate(insert);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        DBConnection.CloseConnection();
    }



}
