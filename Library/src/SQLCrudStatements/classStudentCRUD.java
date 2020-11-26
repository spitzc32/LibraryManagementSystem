package SQLCrudStatements;

//SQL imports
import connection.DbConnection;
import java.sql.*;
import java.util.ArrayList;


//getters and setters import
import values.classStudent;

/* This Class is for executing the CRUD statements in SQL. 
 * 	- As predefined by our Student, the only thing 
 *    we need to do is for Data Entry. So the main 
 *    requirements fulfilled by this class is more
 *    on  CREATE and READ statements in MySQL.
 *    
 * 	  Fields gathered in this requirement is the 
 *    same as the fields fetched by values.Student.
 *
 * */


public class classStudentCRUD {

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
		 * by the insert statement
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		String strfields = "(FirstName,"       +
						"LastName,"        +
						"MiddleName,"      +
						"Webmail,"         +
						"DateOfBirth,"     +
						"StreetAddress,"   +
						"City,"            +
						"Province,"        +
						"Course,"          +
						"isGraduated,"     +
						"isEnrolled)";
		return strfields;
	}
	
	public static  String funcSetValues() {
		/* Return the fields that are filled
		 * by the fetched data from the Student
		 * instance
		 * 
		 * params:
		 * 	none
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		String strfields = "VALUES(?,"+
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

	public static int funcCreateStudentObj (classStudent student) {
		/* Returns the Status of the INSERT statement
		 * Done by MySQL. This is for creating a new 
		 * instance of the object Student in MySQL.  
		 * 
		 * params:
		 *  student <type:Student> (values.Student)
		 * 
		 * return value:
		 * 	Fields <type:String>
		 * */
		conn =   DbConnection.getConnection();
		int intResult = 0;

		try {
			objPreparedStatementObject = conn.prepareStatement("INSERT INTO student " + funcSetFields()
					+ funcSetValues());
			objPreparedStatementObject.setString(1, student.funcgetFirstName());
			objPreparedStatementObject.setString(2, student.funcgetLastName());
			objPreparedStatementObject.setString(3, student.funcgetMiddleName());
			objPreparedStatementObject.setString(4, student.funcgetWebmail());
			objPreparedStatementObject.setDate(5, student.funcgetDateOfBirth());
			objPreparedStatementObject.setString(6, student.funcgetAddress());
			objPreparedStatementObject.setString(7, student.funcgetCity());
			objPreparedStatementObject.setString(8, student.funcgetProvince());
			objPreparedStatementObject.setString(9, student.funcgetCourse());
			objPreparedStatementObject.setInt(10, student.funcgetIsGraduated());
			objPreparedStatementObject.setInt(11, student.funcgetIsEnrolled());
			
			intResult = objPreparedStatementObject.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return intResult;
	}
	
	public static ArrayList<classStudent> funcReadStudentObj () {
		/* Returns a LinkedList of type <classStudent>
		 * of the READ statementDone by MySQL. This is for creating a 
		 * new instance of the object student in MySQL.  
		 * 
		 * params:
		 *  none
		 * 
		 * return value:
		 * 	list <type:ArrayList<classStudent> >
		 * */
		
		ArrayList<classStudent> list = new ArrayList<classStudent>();
		
		try {
			conn =   DbConnection.getConnection();
			objPreparedStatementObject = conn.prepareStatement("SELECT * FROM student");  
			ojbResultSetObject = objPreparedStatementObject.executeQuery();
			
			while(ojbResultSetObject.next()) {
				classStudent Student = new classStudent();
				Student.funcsetId(ojbResultSetObject.getInt("id"));
				Student.funcsetFirstName(ojbResultSetObject.getString("FirstName"));
				Student.funcsetLastName(ojbResultSetObject.getString("LastName"));
				Student.funcsetMiddleName(ojbResultSetObject.getString("MiddleName"));
				Student.funcsetWebmail(ojbResultSetObject.getString("Webmail"));
				Student.funcsetDateOfBirth(ojbResultSetObject.getDate("DateOfBirth"));
				Student.funcsetAddress(ojbResultSetObject.getString("StreetAddress"));
				Student.funcsetCity(ojbResultSetObject.getString("City"));
				Student.funcsetProvince(ojbResultSetObject.getString("Province"));
				Student.funcsetCourse(ojbResultSetObject.getString("Course"));
				Student.funcsetIsGraduated(ojbResultSetObject.getInt("isGraduated"));
				Student.funcsetIsEnrolled(ojbResultSetObject.getInt("isEnrolled"));
				
				list.add(Student);
			}
		}
		catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return list;

	}
}
