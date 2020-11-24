package values;

//For Date Field
import java.sql.Date;

public class classMaterialReviews {
	private static int intId, 
					   intMaterialId, 
					   intStudentId,
					   intProfessorId;
	
	private static String strComment;
	
	private static Date dateTimestamp;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	
	public int funcgetMaterialId () {
		return intMaterialId;
	}
	
	public void funcsetMaterialId (int param) {
		intMaterialId = param;
	}
	
	public int funcgetStudentId () {
		return intStudentId;
	}
	
	public void funcsetStudentId (int param) {
		intStudentId = param;
	}
	
	public int funcgetProfessorId () {
		return intProfessorId;
	}
	
	public void funcsetProfessorId (int param) {
		intProfessorId = param;
	}
	
	// String Fields : comment
	public String funcgetComment () {
		return strComment;
	}
	
	public void funcsetComment (String data) {
		strComment = data;
	}
	
	//Date Fields: DateOfBirth
	public Date funcgetTimestamp () {
		return dateTimestamp;
	}
	
	public void funcsetTimestamp (Date date) {
		dateTimestamp = date;
	}
}
