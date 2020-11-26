package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;

//getters and setters import
import values.classProfessor;

/* This Class is for executing the CRUD statements in SQL. 
* 	- As predefined by our professor, the only thing 
*    we need to do is for Data Entry. So the main 
*    requirements fulfilled by this class is more
*    on  CREATE and READ statements in MySQL.
*    
* 	  Fields gathered in this requirement is the 
*    same as the fields fetched by values.Professor.
*
* */

public class classProfessorCRUD {

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
		String strfields ="(FirstName,"     +
						"LastName,"         +
						"MiddleName,"       +
						"Webmail,"          +
						"DateOfBirth,"      +
						"StreetAddress,"    +
						"City,"             +
						"Province,"         +
						"Course,"           +
						"isWorking,"        +
						"shift,"            +
						"isActive,"         +
						"isResigned)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Professor
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
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?,"  +
							  "?)";
		return strfields;
	}

	public static int funcCreateProfessorObj (classProfessor professor) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Student in MySQL.  
		 * 
		 * params:
		 *  student <type:Student> (values.Professor)
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO professor " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setString(1, professor.funcgetFirstName());
			objPreparedStatementObject.setString(2, professor.funcgetLastName());
			objPreparedStatementObject.setString(3, professor.funcgetMiddleName());
			objPreparedStatementObject.setString(4, professor.funcgetWebmail());
			objPreparedStatementObject.setDate(5, professor.funcgetDateOfBirth());
			objPreparedStatementObject.setString(6, professor.funcgetAddress());
			objPreparedStatementObject.setString(7, professor.funcgetCity());
			objPreparedStatementObject.setString(8, professor.funcgetProvince());
			objPreparedStatementObject.setString(9, professor.funcgetCourse());
			objPreparedStatementObject.setInt(10, professor.funcgetIsWorking());
			objPreparedStatementObject.setString(11, professor.funcgetShift());
			objPreparedStatementObject.setInt(12, professor.funcgetIsActive());
			objPreparedStatementObject.setInt(13, professor.funcgetIsResigned());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classProfessor> funcReadProfessorObj () {
		/* Returns a LinkedList of type <classProfessor>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object professor in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classProfessor> >
		 * */
		
		ArrayList<classProfessor> list = new ArrayList<classProfessor>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM professor");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classProfessor Professor = new classProfessor();
				Professor.funcsetId(ojbResultSetObject.getInt("id"));
				Professor.funcsetFirstName(ojbResultSetObject.getString("FirstName"));
				Professor.funcsetLastName(ojbResultSetObject.getString("LastName"));
				Professor.funcsetMiddleName(ojbResultSetObject.getString("MiddleName"));
				Professor.funcsetWebmail(ojbResultSetObject.getString("Webmail"));
				Professor.funcsetDateOfBirth(ojbResultSetObject.getDate("DateOfBirth"));
				Professor.funcsetAddress(ojbResultSetObject.getString("StreetAddress"));
				Professor.funcsetCity(ojbResultSetObject.getString("City"));
				Professor.funcsetProvince(ojbResultSetObject.getString("Province"));
				Professor.funcsetCourse(ojbResultSetObject.getString("Course"));
				Professor.funcsetShift(ojbResultSetObject.getString("shift"));
				Professor.funcsetIsWorking(ojbResultSetObject.getInt("isWorking"));
				Professor.funcsetIsActive(ojbResultSetObject.getInt("isActive"));
				Professor.funcsetIsResigned(ojbResultSetObject.getInt("isResigned"));
				list.add(Professor);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;

	}
}
