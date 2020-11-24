package values;

//For Date Field
import java.sql.Date;

/* This is the value getter and setter for Librarian Obj.
* fields:
* 	id           <type:Int>
*  FirstName    <type:String>
*  LastName     <type:String>
*  MiddleName   <type:String>
*  Webmail      <type:String>
*  DateOfBirth  <type:Date>
*  Address      <type:String>
*  City         <type:String>
*  Province     <type:String>
*  isWorking    <type:Int> this is a special case since this is a boolean field and we are looking to input this as tinyint
*  shift        <type:String>
*  isActive     <type:Int> this is a special case since this is a boolean field and we are looking to input this as tinyint
*  isResigned   <type:Int> this is a special case since this is a boolean field and we are looking to input this as tinyint
*  
* This class' main purpose is to store and get the values from the database and input fields
* */

public class classLibrarian {
	private static int intId, 
						intIsWorking, 
						intIsActive,
						intIsResigned;

	private static String strFirstName, 
						  strLastName, 
						  strMiddleName,
						  strWebmail,
						  strAddress,
						  strCity,
						  strProvince,
						  strShift;

	private static Date dateDateOfBirth;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	
	public int funcgetIsWorking () {
		return intIsWorking;
	}
	
	public void funcsetIsWorking (int working) {
		intIsWorking = working;
	}
	
	public int funcgetIsActive () {
		return intIsActive;
	}
	
	public void funcsetIsActive (int active) {
		intIsActive = active;
	}
	
	public int funcgetIsResigned () {
		return intIsResigned;
	}
	
	public void funcsetIsResigned (int resigned) {
		intIsResigned = resigned;
	}

	// String Fields : FirstName to Course
	public String funcgetFirstName () {
		return strFirstName;
	}
	
	public void funcsetFirstName (String data) {
		strFirstName = data;
	}
	
	public String funcgetLastName () {
		return strLastName;
	}
	
	public void funcsetLastName (String data) {
		strLastName = data;
	}
	
	public String funcgetMiddleName () {
		return strMiddleName;
	}
	
	public void funcsetMiddleName (String data) {
		strMiddleName = data;
	}
	
	public String funcgetWebmail () {
		return strWebmail;
	}
	
	public void funcsetWebmail (String data) {
		strWebmail = data;
	}
	
	public String funcgetAddress () {
		return strAddress;
	}
	
	public void funcsetAddress (String data) {
		strAddress = data;
	}
	
	public String funcgetCity () {
		return strCity;
	}
	
	public void funcsetCity (String data) {
		strCity = data;
	}
	
	public String funcgetProvince () {
		return strProvince;
	}
	
	public void funcsetProvince (String data) {
		strProvince = data;
	}
	
	public String funcgetShift () {
		return strShift;
	}
	
	public void funcsetShift (String data) {
		strShift = data;
	}
	
	public Date funcgetDateOfBirth () {
		return dateDateOfBirth;
	}
	
	public void funcsetDateOfBirth (Date date) {
		dateDateOfBirth = date;
	}
}
