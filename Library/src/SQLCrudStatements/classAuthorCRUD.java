package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classAuthor;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.classAuthor.
*
* */

public class classAuthorCRUD {

	static Connection conn = null;
	static PreparedStatement objPreparedStatementObject = null;
	static ResultSet ojbResultSetObject = null;
	
	public static void setFields () {
		/* TODO: Set the fields from the created design 
		 * to its appropriate Fields in the values package. 
		 * */
	}
	
	public static  String funcSetFields() {
		/* Return the fields needed to be filled
		 * by the INSERT statement
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	strfields <type:String>
		 * */
		String strfields = "(id,"          +
						"FirstName,"    +
						"LastName,"     +
						"MiddleName,"   +
						"Address,"      +
						"City,"         +
						"Province,"     +
						"Country";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Author
		 * instance
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	strfields <type:String>
		 * */
		String strfields = "VALUES(?," +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?)";
		return strfields;
	}

	public static int funcCreateAuthorObj (classAuthor author) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object author in MySQL.  
		 * 
		 * params:
		 *  author <type:Author> (values.classAuthor)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO author " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, author.funcgetId());
			objPreparedStatementObject.setString(2, author.funcgetFirstName());
			objPreparedStatementObject.setString(3, author.funcgetLastName());
			objPreparedStatementObject.setString(4, author.funcgetMiddleName());
			objPreparedStatementObject.setString(5, author.funcgetAddress());
			objPreparedStatementObject.setString(6, author.funcgetCity());
			objPreparedStatementObject.setString(7, author.funcgetProvince());
			objPreparedStatementObject.setString(8, author.funcgetCountry());
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
