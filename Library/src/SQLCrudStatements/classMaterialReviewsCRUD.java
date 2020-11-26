package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

//getters and setters import
import values.classMaterialReviews;


/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.classMaterialReviews.
*
* */

public class classMaterialReviewsCRUD {
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
		String strfields = "(MaterialId,"        +
						"StudentId,"         +
						"ProfessorId ,"      +
						"comment,"           +
						"timestamp)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the MaterialReviews
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
							  "?)";
		return strfields;
	}

	public static int funcCreateMaterialsObj (classMaterialReviews material) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object materialreviews in MySQL.  
		 * 
		 * params:
		 *  material <type:MaterialReviews> (values.classMaterialReviews)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO materialreviews " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, material.funcgetMaterialId());
			objPreparedStatementObject.setInt(2, material.funcgetStudentId());
			objPreparedStatementObject.setInt(3, material.funcgetProfessorId());
			objPreparedStatementObject.setString(4, material.funcgetComment());
			objPreparedStatementObject.setDate(5, material.funcgetTimestamp());

	
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classMaterialReviews> funcReadMeterialReviewsObj () {
		/* Returns a LinkedList of type <classMaterialReviews>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object materialreviews in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classMaterialReviews> >
		 * */

		ArrayList<classMaterialReviews> list = new ArrayList<classMaterialReviews>();

		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM materialreviews");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classMaterialReviews material = new classMaterialReviews();
				material.funcsetId(ojbResultSetObject.getInt("id"));
				material.funcsetMaterialId(ojbResultSetObject.getInt("MaterialId"));
				material.funcsetStudentId(ojbResultSetObject.getInt("StudentId"));
				material.funcsetProfessorId(ojbResultSetObject.getInt("ProfessorId"));
				material.funcsetComment(ojbResultSetObject.getString("comment"));
				material.funcsetTimestamp(ojbResultSetObject.getDate("timestamp"));
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
