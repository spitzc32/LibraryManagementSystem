package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classProfessor;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.Professor.
*
* */

public class classProfessorCRUD {

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
		 * 	Fields <type:String>
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
						"Course,"       +
						"isWorking,"    +
						"shift,"        +
						"isActive"      +
						"isResigned)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Professor
		 * instance
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	Fields <type:String>
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
							  "?,"  +
							  "?)";
		return strfields;
	}

	public static int funcCreateProfessorObj (classProfessor professor) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Student in MySQL.  
		 * 
		 * params:
		 *  student <type:Student> (values.Professor)
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO professor " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, professor.funcgetId());
			objPreparedStatementObject.setString(2, professor.funcgetFirstName());
			objPreparedStatementObject.setString(3, professor.funcgetLastName());
			objPreparedStatementObject.setString(4, professor.funcgetMiddleName());
			objPreparedStatementObject.setString(5, professor.funcgetWebmail());
			objPreparedStatementObject.setDate(6, professor.funcgetDateOfBirth());
			objPreparedStatementObject.setString(7, professor.funcgetAddress());
			objPreparedStatementObject.setString(8, professor.funcgetCity());
			objPreparedStatementObject.setString(9, professor.funcgetProvince());
			objPreparedStatementObject.setString(10, professor.funcgetCourse());
			objPreparedStatementObject.setInt(11, professor.funcgetIsWorking());
			objPreparedStatementObject.setString(12, professor.funcgetShift());
			objPreparedStatementObject.setInt(13, professor.funcgetIsActive());
			objPreparedStatementObject.setInt(14, professor.funcgetIsResigned());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
