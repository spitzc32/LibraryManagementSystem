package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classAssociate_MaterialAuthor;
import values.classEntity;
import values.classObject;

//ArrayList
import java.util.ArrayList;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by 
*    values.Associate_MaterialAuthor.
*
* */

public class classAssociate_MaterialAuthorCRUD {

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
		String strfields = "(MaterialId,"  +
						   "AuthorId)";
					
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the associate_materialauthor
		 * instance
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		String strfields = "VALUES(?," +
							  "?)";
		return strfields;
	}

	public static int funcCreateAssociate_MaterialAuthorObj (classAssociate_MaterialAuthor author) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object associate_materialauthor in MySQL.  
		 * 
		 * params:
		 *  author <type:classAssociate_MaterialAuthor> (values.classAssociate_MaterialAuthor)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO associate_materialauthor " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, author.funcgetMaterialId());
			objPreparedStatementObject.setInt(2, author.funcgetAuthorId());

			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classEntity> funcRetrieveAssociate_MaterialAuthorObj (String table) {
		/* Returns a LinkedList of type <classEntity>
		 * of the A retrieve statement Done by MySQL for Foreign Keys (FK). 
		 * The usual use case of this method is for dropdowns.
		 * params:
		 *  table <type:String>
		 * 
		 * return value:
		 * 	list <type:ArrayList<classEntity> >
		 * */
		ArrayList<classEntity> list = new ArrayList<classEntity>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT id, FirstName, LastName, MiddleName FROM " + table);  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classEntity entity = new classEntity();
				entity.funcsetId(ojbResultSetObject.getInt("id"));
				entity.funcsetFirstName(ojbResultSetObject.getString("FirstName"));
				entity.funcsetLastName(ojbResultSetObject.getString("LastName"));
				entity.funcsetMiddleName(ojbResultSetObject.getString("MiddleName"));
				
				list.add(entity);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;
	}
	
	public static ArrayList<classObject> funcRetrieveObjectAssociate_MaterialAuthorObj (String table) {
		/* Returns a LinkedList of type <classObject>
		 * of the A retrieve statement Done by MySQL for Foreign Keys (FK). 
		 * The usual use case of this method is for dropdowns.
		 * params:
		 *  table <type:String>
		 * 
		 * return value:
		 * 	list <type:ArrayList<classObject> >
		 * */
		ArrayList<classObject> list = new ArrayList<classObject>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT id, Title FROM " + table);  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classObject object = new classObject();
				object.funcsetId(ojbResultSetObject.getInt("id"));
				object.funcsetTitle(ojbResultSetObject.getString("Title"));
				
				list.add(object);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;
	}
	
	public static ArrayList<classAssociate_MaterialAuthor> funcReadAssociate_MaterialAuthorObj () {
		/* Returns a LinkedList of type <classAssociate_MaterialAuthor>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object associate_materialauthor in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classAssociate_MaterialAuthor> >
		 * */
		
		ArrayList<classAssociate_MaterialAuthor> list = new ArrayList<classAssociate_MaterialAuthor>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM associate_materialauthor");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classAssociate_MaterialAuthor author = new classAssociate_MaterialAuthor();
				author.funcsetId(ojbResultSetObject.getInt("id"));
				author.funcsetMaterialId(ojbResultSetObject.getInt("MaterialId"));
				author.funcsetAuthorId(ojbResultSetObject.getInt("AuthorId"));
				list.add(author);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;

	}
}
