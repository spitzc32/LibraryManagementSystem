package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;


//getters and setters import
import values.classSubject;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.Subject.
*
* */

public class classSubjectCRUD {

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
		String strfields ="(Title,"              +
						   "Description,"        +
						   "Code)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Subject
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
							  "?)";
		return strfields;
	}

	public static int funcCreateSubjectObj (classSubject subject) {
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
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO subject " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setString(1, subject.funcgetTitle());
			objPreparedStatementObject.setString(2, subject.funcgetDescription());
			objPreparedStatementObject.setString(3, subject.funcgetCode());

			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	public static ArrayList<classSubject> funcReadSubjectObj () {
		/* Returns a LinkedList of type <classSubject>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object subject in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classSubject> >
		 * */
		
		ArrayList<classSubject> list = new ArrayList<classSubject>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM subject");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classSubject Subject = new classSubject();
				Subject.funcsetId(ojbResultSetObject.getInt("id"));
				Subject.funcsetTitle(ojbResultSetObject.getString("Title"));
				Subject.funcsetDescription(ojbResultSetObject.getString("Description"));
				Subject.funcsetCode(ojbResultSetObject.getString("Code"));
				list.add(Subject);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;

	}
}
