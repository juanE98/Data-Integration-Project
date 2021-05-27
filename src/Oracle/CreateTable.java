package Oracle;

public class CreateTable {

    public static void main(String[] args) {
        //create tables in Oracle Databse

    }

    /**
     * Creates Book3 table
     */
    private static void createBook3() {
        DBConnection.OpenConnection();
        String create = "CREATE TABLE BOOK3("
                + "ID NUMBER NOT NULL,"
                + "TITLE VARCHAR2(300 BYTE) NOT NULL,"
                + "AUTHOR1 VARCHAR2(150 BYTE),"
                + "AUTHOR2 VARCHAR2(150 BYTE),"
                + "AUTHOR3 VARCHAR2(150 BYTE),"
                + "PUBLISHER VARCHAR2(100 BYTE),"
                + "ISBN13 VARCHAR2(26 BYTE),"
                + "PUBLISHDATE VARCHAR2(100 BYTE),"
                + "PAGES NUMBER,"
                + "PRODUCTDIMENSIONS VARCHAR2(100 BYTE),"
                + "SALESRANK NUMBER,"
                + "RATINGSCOUNT NUMBER,"
                + "RATINGVALUE REAL,"
                + "PAPERBACKPRICE VARCHAR2(100 BYTE),"
                + "HARDCOVERPRICE VARCHAR2(100 BYTE),"
                + "EBOOKPRICE VARCHAR2(100 BYTE),"
                + "AUDIOBOOKPRICE VARCHAR2(100 BYTE),"
                + "CONSTRAINT BOOK3_PK PRIMARY KEY(ID) ENABLE)";
        DBConnection.ExecuteUpdate(create);
        DBConnection.CloseConnection();
    }

    /**
     * Creates Book1 table
     */
     private static void createBook1() {
         DBConnection.OpenConnection();
         String create = "CREATE TABLE BOOK1("
                 + "ID NUMBER NOT NULL,"
                 + "TITLE VARCHAR2(300 BYTE),"
                 + "CONSTRAINT BOOK1_PK PRIMARY KEY(ID) ENABLE)";
         DBConnection.ExecuteUpdate(create);
         DBConnection.CloseConnection();
     }

    /**
     * Creates Book2 table
     */
    private static void createBook2() {
        DBConnection.OpenConnection();
        String create = "CREATE TABLE BOOK2("
                + "ID NUMBER NOT NULL,"
                + "TITLE VARCHAR2(300 BYTE),"
                + "CONSTRAINT BOOK2_PK PRIMARY KEY(ID) ENABLE)";
        DBConnection.ExecuteUpdate(create);
        DBConnection.CloseConnection();
    }
}
