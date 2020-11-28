package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

//getters and setters import
import values.classAssociate_ProfessorMaterialTracker;
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
*    values.Associate_ProfessorMaterialTracker.
*
* */

public class classAssociate_ProfessorMaterialTrackerCRUD {
	
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
		String strfields ="(professorId,"         +
							"psubjectId,"          +
							"plibririanId,"       +
							"pMaterialId,"		  +
							"dateReturned,"       +
							"dateBorrowed,"       +
							"assignedDateReturn," +
							"isDue,"              +
							"isReturned)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the associate_professormaterialtracker
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
							  "?)";
		return strfields;
	}

	public static int funcCreateMaterialsObj (classAssociate_ProfessorMaterialTracker tracker) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object associate_professormaterialtracker in MySQL.  
		 * 
		 * params:
		 *  tracker <type:classAssociate_ProfessorMaterialTracker> (values.classAssociate_ProfessorMaterialTracker)
		 * 
		 * return value:
		 * 	intResult <type:int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO associate_professormaterialtracker " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, tracker.funcgetProfessorId());
			objPreparedStatementObject.setInt(2, tracker.funcgetSubjectId());
			objPreparedStatementObject.setInt(3, tracker.funcgetlibririanId());
			objPreparedStatementObject.setInt(4, tracker.funcgetMaterialId());
			objPreparedStatementObject.setDate(5, tracker.funcgetDateBorrowed());
			objPreparedStatementObject.setDate(6, tracker.funcgetDateReturned());
			objPreparedStatementObject.setDate(7, tracker.funcgetAssignedDateReturn());
			objPreparedStatementObject.setInt(8, tracker.funcgetIsDue());
			objPreparedStatementObject.setInt(9, tracker.funcgetIsReturned());

	
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classEntity> funcRetrieveAssociate_ProfessorMaterialTrackerObj (String table) {
		/* Returns a LinkedList of type <classAssociate_ProfessorMaterialTracker>
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
	
	public static ArrayList<classObject> funcRetrieveObjectAssociate_ProfessorMaterialTrackerObj (String table) {
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
	
	public static ArrayList<classAssociate_ProfessorMaterialTracker> funcReadAssociate_ProfessorMaterialTrackerObj () {
		/* Returns a LinkedList of type <classAssociate_ProfessorMaterialTracker>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object associate_materialsubject in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classAssociate_ProfessorMaterialTracker> >
		 * */
		
		ArrayList<classAssociate_ProfessorMaterialTracker> list = new ArrayList<classAssociate_ProfessorMaterialTracker>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM associate_professormaterialtracker");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classAssociate_ProfessorMaterialTracker material = new classAssociate_ProfessorMaterialTracker();
				material.funcsetId(ojbResultSetObject.getInt("id"));
				material.funcsetProfessorId(ojbResultSetObject.getInt("professorId"));
				material.funcsetSubjectId(ojbResultSetObject.getInt("psubjectId"));
				material.funcsetlibririanId(ojbResultSetObject.getInt("plibririanId"));
				material.funcsetMaterialId(ojbResultSetObject.getInt("pMaterialId"));
				material.funcsetDateReturned(ojbResultSetObject.getDate("dateReturned"));
				material.funcsetDateBorrowed(ojbResultSetObject.getDate("dateBorrowed"));
				material.funcsetAssignedDateReturn(ojbResultSetObject.getDate("assignedDateReturn"));
				material.funcsetIsDue(ojbResultSetObject.getInt("isDue"));
				material.funcsetIsReturned(ojbResultSetObject.getInt("isReturned"));
				
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
