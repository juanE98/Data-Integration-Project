package Data;

import Oracle.DBConnection;

public class DataStatistics {

	public static void main(String[] args) {
		/*
		 * Please implement the Task 1 code here, including both two sub-tasks
		 */
		DBConnection.OpenConnection();
		String query = "SELECT * FROM RESTAURANT ";
		int[] countNumber = DBConnection.ExecuteQueryTask1(query);
		DBConnection.CloseConnection();

		//sub task 1
		System.out.println("new york, " + countNumber[0]);
		System.out.println("new york city, " + countNumber[1]);
		//sub task 2
		System.out.println("Number of distinct values in city: " + countNumber[2]);

	}
}
