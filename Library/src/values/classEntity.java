package values;

/* This class is intended to be for general use
 * of retrieval values for FK(Foreign Keys)
 * Fields:
 * id <type:Int>
 * FirstName <type:String>
 * LastName <type:String>
 * MiddleName <type:String>
 * */
public class classEntity {
	private  int intId;
	
	private  String strFirstName, 
					strLastName, 
					strMiddleName;
	
	public  int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
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
}
