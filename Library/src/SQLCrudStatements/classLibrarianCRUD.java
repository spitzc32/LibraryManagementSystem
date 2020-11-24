package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classLibrarian;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.classLibrarian.
*
* */


public class classLibrarianCRUD {

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
						"Webmail,"      +
						"DateOfBirth,"  +
						"Address,"      +
						"City,"         +
						"Province,"     +
						"isWorking,"    +
						"shift,"        +
						"isActive"      +
						"isResigned)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Librarian
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
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?)";
		return strfields;
	}

	public static int funcCreateLibrarianObj (classLibrarian librarian) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object librarian in MySQL.  
		 * 
		 * params:
		 *  librarian <type:Librarian> (values.classLibrarian)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO librarian " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, librarian.funcgetId());
			objPreparedStatementObject.setString(2, librarian.funcgetFirstName());
			objPreparedStatementObject.setString(3, librarian.funcgetLastName());
			objPreparedStatementObject.setString(4, librarian.funcgetMiddleName());
			objPreparedStatementObject.setString(5, librarian.funcgetWebmail());
			objPreparedStatementObject.setDate(6, librarian.funcgetDateOfBirth());
			objPreparedStatementObject.setString(7, librarian.funcgetAddress());
			objPreparedStatementObject.setString(8, librarian.funcgetCity());
			objPreparedStatementObject.setString(9, librarian.funcgetProvince());
			objPreparedStatementObject.setInt(10, librarian.funcgetIsWorking());
			objPreparedStatementObject.setString(11, librarian.funcgetShift());
			objPreparedStatementObject.setInt(12, librarian.funcgetIsActive());
			objPreparedStatementObject.setInt(13, librarian.funcgetIsResigned());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
