package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classMaterials;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.classMaterials.
*
* */


public class classMaterialsCRUD {

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
		String strfields = "(id,"                +
						"Title,"              +
						"Description,"        +
						"Edition,"            +
						"YearOfPublication,"  +
						"DatePublished,"      +
						"TypeOfMaterial";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Materials
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
							  "?)";
		return strfields;
	}

	public static int funcCreateMaterialsObj (classMaterials material) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Materials in MySQL.  
		 * 
		 * params:
		 *  material <type:Materials> (values.Materials)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO materials " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, material.funcgetId());
			objPreparedStatementObject.setString(2, material.funcgetTitle());
			objPreparedStatementObject.setString(3, material.funcgetDescription());
			objPreparedStatementObject.setString(4, material.funcgetEdition());
			objPreparedStatementObject.setDate(5, material.funcgetYearOfPublication());
			objPreparedStatementObject.setDate(6, material.funcgetDatePublished());
			objPreparedStatementObject.setString(7, material.funcgetTypeOfMaterial());
	
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
