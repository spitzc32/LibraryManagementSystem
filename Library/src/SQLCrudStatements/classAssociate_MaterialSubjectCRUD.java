package SQLCrudStatements;

import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;


//getters and setters import
import values.classAssociate_MaterialSubject;
import values.classEntity;
import values.classObject;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by 
*    values.classAssociate_MaterialSubject.
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
		 * 	strfields <type:String>
		 * */
		String strfields ="(MaterialId,"  +
						  "SubjectId)";
					
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the classAssociate_MaterialSubject
		 * instance
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	strfields <type:String>
		 * */
		String strfields = "VALUES(?," +
							      "?)";
		return strfields;
	}

	public static int funcCreateSubjectObj (classAssociate_MaterialSubject author) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object associate_materialsubject in MySQL.  
		 * 
		 * params:
		 *  author <type:classAssociate_MaterialSubject> (values.classAssociate_MaterialSubject)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO associate_materialsubject " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, author.funcgetMaterialId());
			objPreparedStatementObject.setInt(2, author.funcgetSubjectId());

			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classEntity> funcRetrieveAssociate_MaterialSubjectObj (String table) {
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
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM " + table);  
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
	
	public static ArrayList<classObject> funcRetrieveObjectAssociate_MaterialSubjectObj (String table) {
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
	
	public static classEntity funcRetrieveDisplayEntityAMSObj (String table, int id) {
		/* Returns a classEntity of the A retrieve statement 
		 * Done by MySQL for Foreign Keys (FK). 
		 * The usual use case of this method is for the display
		 * of JTable.
		 * params:
		 *  table <type:String>
		 *  id <type:Strings>
		 * 
		 * return value:
		 * 	entity classEntity
		 * */
		classEntity entity = new classEntity();
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT FirstName, MiddleName, LastName FROM " + table + " WHERE id=" + Integer.toString(id));  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				entity.funcsetFirstName(ojbResultSetObject.getString("FirstName"));
				entity.funcsetMiddleName(ojbResultSetObject.getString("MiddleName"));
				entity.funcsetLastName(ojbResultSetObject.getString("LastName"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

	public static classObject funcRetrieveDisplayObjectAMSObj (String table, int id) {
		/* Returns a classObject of the A retrieve statement 
		 * Done by MySQL for Foreign Keys (FK). 
		 * The usual use case of this method is for the display
		 * of JTable.
		 * params:
		 *  table <type:String>
		 * 
		 * return value:
		 * 	list <type:ArrayList<classObject> >
		 * */
		classObject obj = new classObject();
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT Title FROM " + table + " WHERE id=" + Integer.toString(id));  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				obj.funcsetTitle(ojbResultSetObject.getString("Title"));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public static ArrayList<classAssociate_MaterialSubject> funcReadAssociate_MaterialSubjectObj () {
		/* Returns a LinkedList of type <classAssociate_MaterialSubject>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object associate_materialsubject in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classAssociate_MaterialSubject> >
		 * */
		
		ArrayList<classAssociate_MaterialSubject> list = new ArrayList<classAssociate_MaterialSubject>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM associate_materialsubject");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classAssociate_MaterialSubject author = new classAssociate_MaterialSubject();
				author.funcsetId(ojbResultSetObject.getInt("id"));
				author.funcsetMaterialId(ojbResultSetObject.getInt("MaterialId"));
				author.funcsetSubjectId(ojbResultSetObject.getInt("SubjectId"));
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
