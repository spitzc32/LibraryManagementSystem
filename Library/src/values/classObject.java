package values;

/* This class is intended to be for general use
 * of retrieval values for FK(Foreign Keys)
 * Fields:
 * id <type:Int>
 * FirstName <type:String>
 * LastName <type:String>
 * MiddleName <type:String>
 * */

public class classObject {
	private  int intId;
	
	private static String strTitle;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	
	// String Fields : Title to TypeOfMaterial
	public String funcgetTitle () {
		return strTitle;
	}
	
	public void funcsetTitle (String data) {
		strTitle = data;
	}
}
