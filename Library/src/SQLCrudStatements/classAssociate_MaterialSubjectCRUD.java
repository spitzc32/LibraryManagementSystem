package SQLCrudStatements;

import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classAssociate_MaterialSubject;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by 
*    values.Associate_ProfessorMaterialTracker.
*
* */

public class classAssociate_MaterialSubjectCRUD {
	
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
		String strfields = "(id,"      +
						"MaterialId,"  +
						"AuthorId,";
					
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
		 * 	Fields <type:String>
		 * */
		String strfields = "VALUES(?," +
							      "?," +
							      "?)";
		return strfields;
	}

	public static int funcCreateSubjectObj (classAssociate_MaterialSubject author) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Subject in MySQL.  
		 * 
		 * params:
		 *  subject <type:Subject> (values.Subject)
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO associate_materialauthor " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, author.funcgetId());
			objPreparedStatementObject.setInt(2, author.funcgetMaterialId());
			objPreparedStatementObject.setInt(3, author.funcgetSubjectId());

			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
