package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

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
		String strfields = "(Title,"              +
							"Description,"        +
							"Edition,"            +
							"YearOfPublication,"  +
							"DatePublished,"      +
							"TypeOfMaterial)";
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
			objPreparedStatementObject.setString(1, material.funcgetTitle());
			objPreparedStatementObject.setString(2, material.funcgetDescription());
			objPreparedStatementObject.setString(3, material.funcgetEdition());
			objPreparedStatementObject.setDate(4, material.funcgetYearOfPublication());
			objPreparedStatementObject.setDate(5, material.funcgetDatePublished());
			objPreparedStatementObject.setString(6, material.funcgetTypeOfMaterial());
	
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classMaterials> funcReadMeterialsObj () {
		/* Returns a LinkedList of type <classMaterials>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object materials in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classMaterials> >
		 * */

		ArrayList<classMaterials> list = new ArrayList<classMaterials>();

		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM materials");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classMaterials material = new classMaterials();
				material.funcsetId(ojbResultSetObject.getInt("id"));
				material.funcsetTitle(ojbResultSetObject.getString("Title"));
				material.funcsetDescription(ojbResultSetObject.getString("Description"));
				material.funcsetEdition(ojbResultSetObject.getString("Edition"));
				material.funcsetYearOfPublication(ojbResultSetObject.getDate("YearOfPublication"));
				material.funcsetDatePublished(ojbResultSetObject.getDate("DatePublished"));
				material.funcsetTypeOfMaterial(ojbResultSetObject.getString("TypeOfMaterial"));
				list.add(material);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;

	}
}
