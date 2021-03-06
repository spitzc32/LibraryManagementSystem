package values;

//For Date Field
import java.sql.Date;

/* This is the value getter and setter for StudentMaterialTracker Obj.
 * fields:
 * 	id           		<type:Int>
 *  professorId     	<type:Int>
 *  subjectId     		<type:Int>
 *  libririanId   		<type:Int>
 *  MaterialId      	<type:Int>
 *  dateReturned  		<type:Date>
 *  dateBorrowed        <type:Date>
 *  assignedDateReturn  <type:Date>
 *  isDue     			<type:Int> this is a special case since this is a boolean field and we are looking to input this as tinyint
 *  isReturned      	<type:Int> this is a special case since this is a boolean field and we are looking to input this as tinyint
 *  
 * This class' main purpose is to store and get the values from the database and input fields
 * */

public class classAssociate_ProfessorMaterialTracker {
	private int intId, 
					   intProfessorId, 
					   intSubjectId,
					   intLibririanId,
					   intMaterialId,
					   intIsDue,
					   intIsReturned;

	private Date dateDateBorrowed,
						dateDateReturned,
						dateAssignedDateReturn;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	
	public int funcgetProfessorId  () {
		return intProfessorId ;
	}
	
	public void funcsetProfessorId  (int param) {
		intProfessorId  = param;
	}
	
	public int funcgetSubjectId () {
		return intSubjectId;
	}
	
	public void funcsetSubjectId (int param) {
		intSubjectId = param;
	}
	
	public int funcgetlibririanId () {
		return intLibririanId;
	}
	
	public void funcsetlibririanId (int param) {
		intLibririanId = param;
	}
	
	public int funcgetMaterialId () {
		return intMaterialId;
	}
	
	public void funcsetMaterialId (int param) {
		intMaterialId = param;
	}
	
	public int funcgetIsDue () {
		return intIsDue;
	}
	
	public void funcsetIsDue (int param) {
		intIsDue = param;
	}
	
	public int funcgetIsReturned () {
		return intIsReturned;
	}
	
	public void funcsetIsReturned (int param) {
		intIsReturned = param;
	}
	
	//Date Fields: From YearOfPublication to DatePublished
	public Date funcgetDateBorrowed () {
		return dateDateBorrowed;
	}
	
	public void funcsetDateBorrowed (Date date) {
		dateDateBorrowed = date;
	}
	
	public Date funcgetDateReturned () {
		return dateDateReturned;
	}
	
	public void funcsetDateReturned (Date date) {
		dateDateReturned = date;
	}
	
	public Date funcgetAssignedDateReturn () {
		return dateAssignedDateReturn;
	}
	
	public void funcsetAssignedDateReturn (Date date) {
		dateAssignedDateReturn = date;
	}

}
