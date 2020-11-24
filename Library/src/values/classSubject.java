package values;

/* This is the value getter and setter for Subject Obj.
* fields:
* 	id           <type:Int>
*  Title    	 <type:String>
*  Description   <type:String>
*  Code          <type:String>
*  
* This class' main purpose is to store and get the values from the database and input fields
* */

public class classSubject {
	private static int intId;
	
	private static String strTitle, 
						  strDescription, 
					      strCode;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	
	// String Fields : FirstName to Country
	public String funcgetTitle () {
		return strTitle;
	}
	
	public void funcsetTitle (String data) {
		strTitle = data;
	}
	
	public String funcgetDescription () {
		return strDescription;
	}
	
	public void funcsetDescription (String data) {
		strDescription = data;
	}
	
	public String funcgetCode () {
		return strCode;
	}
	
	public void funcsetCode (String data) {
		strCode = data;
	}
}
