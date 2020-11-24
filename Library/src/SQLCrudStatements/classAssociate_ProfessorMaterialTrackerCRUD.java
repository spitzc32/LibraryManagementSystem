package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;

//getters and setters import
import values.classAssociate_ProfessorMaterialTracker;

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
		String strfields = "(id,"                +
						"professorId,"        +
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
			objPreparedStatementObject.setInt(1, tracker.funcgetId());
			objPreparedStatementObject.setInt(2, tracker.funcgetProfessorId());
			objPreparedStatementObject.setInt(3, tracker.funcgetSubjectId());
			objPreparedStatementObject.setInt(4, tracker.funcgetlibririanId());
			objPreparedStatementObject.setInt(5, tracker.funcgetMaterialId());
			objPreparedStatementObject.setDate(6, tracker.funcgetDateBorrowed());
			objPreparedStatementObject.setDate(7, tracker.funcgetDateReturned());
			objPreparedStatementObject.setDate(8, tracker.funcgetAssignedDateReturn());
			objPreparedStatementObject.setInt(9, tracker.funcgetIsDue());
			objPreparedStatementObject.setInt(10, tracker.funcgetIsReturned());

	
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
}
