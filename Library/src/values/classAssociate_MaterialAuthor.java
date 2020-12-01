package values;

/* This is the value getter and setter for StudentMaterialTracker Obj.
 * fields:
 * 	id           		<type:Int>
 *  MaterialId     	    <type:Int>
 *  AuthorId     		<type:Int>
 *  
 * This class' main purpose is to store and get the values from the database and input fields
 * */

public class classAssociate_MaterialAuthor {
	private int intId, 
			   		   intMaterialId, 
			   		   intAuthorId;

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
	
	public int funcgetAuthorId () {
		return intAuthorId;
	}
	
	public void funcsetAuthorId (int param) {
		intAuthorId  = param;
	}
}
