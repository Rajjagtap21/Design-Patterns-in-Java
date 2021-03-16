public class DBConn {

	// 1.static instance
	private static DBConn instance;

	// 2.private constructor
	private DBConn() {

	}

	// 3.static method of type DBConn which returns instance of that class
	public static DBConn getInstance() {
		if (instance == null) {
			instance = new DBConn();
		}
		return instance;
	}
}
