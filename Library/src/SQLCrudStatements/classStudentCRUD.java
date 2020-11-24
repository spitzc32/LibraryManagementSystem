package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classStudent;

/* This Class is for executing the CRUD statements in SQL. 
 * 	- As predefined by our professor, the only thing 
 *    we need to do is for Data Entry. So the main 
 *    requirements fulfilled by this class is more
 *    on  CREATE and READ statements in MySQL.
 *    
 * 	  Fields gathered in this requirement is the 
 *    same as the fields fetched by values.Student.
 *
 * */


public class classStudentCRUD {

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
		 * by the insert statement
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
						"isGraduated,"  +
						"isEnrolled)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Student
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
							  "?)";
		return strfields;
	}

	public static int funcCreateStudentObj (classStudent student) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Student in MySQL.  
		 * 
		 * params:
		 *  student <type:Student> (values.Student)
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO student " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, student.funcgetId());
			objPreparedStatementObject.setString(2, student.funcgetFirstName());
			objPreparedStatementObject.setString(3, student.funcgetLastName());
			objPreparedStatementObject.setString(4, student.funcgetMiddleName());
			objPreparedStatementObject.setString(5, student.funcgetWebmail());
			objPreparedStatementObject.setDate(6, student.funcgetDateOfBirth());
			objPreparedStatementObject.setString(7, student.funcgetAddress());
			objPreparedStatementObject.setString(8, student.funcgetCity());
			objPreparedStatementObject.setString(9, student.funcgetProvince());
			objPreparedStatementObject.setString(10, student.funcgetCourse());
			objPreparedStatementObject.setInt(11, student.funcgetIsGraduated());
			objPreparedStatementObject.setInt(12, student.funcgetIsEnrolled());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
