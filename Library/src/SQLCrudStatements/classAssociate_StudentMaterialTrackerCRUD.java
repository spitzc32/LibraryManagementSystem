package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;


//getters and setters import
import values.classAssociate_StudentMaterialTracker;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by 
*    values.Associate_StudentMaterialTracker.
*
* */

public class classAssociate_StudentMaterialTrackerCRUD {

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
		String strfields = "(studentId,"          +
							"subjectId,"          +
							"libririanId ,"       +
							"MaterialId,"		  +
							"dateReturned,"       +
							"dateBorrowed,"       +
							"assignedDateReturn," +
							"isDue,"              +
							"isReturned)";
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
							  "?)";
		return strfields;
	}

	public static int funcCreateMaterialsObj (classAssociate_StudentMaterialTracker tracker) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object associate_studentmaterialtracker in MySQL.  
		 * 
		 * params:
		 *  tracker <type:classAssociate_StudentMaterialTracker> (values.classAssociate_StudentMaterialTracker)
		 * 
		 * return value:
		 * 	intResult <type:Int>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO associate_studentmaterialtracker " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setInt(1, tracker.funcgetStudentId());
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
	
	public static ArrayList<classAssociate_StudentMaterialTracker> funcReadAssociate_ProfessorMaterialTrackerObj () {
		/* Returns a LinkedList of type <classAssociate_StudentMaterialTracker>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object associate_studentmaterialtracker in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classAssociate_StudentMaterialTracker> >
		 * */
		
		ArrayList<classAssociate_StudentMaterialTracker> list = new ArrayList<classAssociate_StudentMaterialTracker>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM associate_studentmaterialtracker");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classAssociate_StudentMaterialTracker material = new classAssociate_StudentMaterialTracker();
				material.funcsetId(ojbResultSetObject.getInt("id"));
				material.funcsetStudentId(ojbResultSetObject.getInt("studentId"));
				material.funcsetSubjectId(ojbResultSetObject.getInt("subjectId"));
				material.funcsetlibririanId(ojbResultSetObject.getInt("libririanId"));
				material.funcsetMaterialId(ojbResultSetObject.getInt("MaterialId"));
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
