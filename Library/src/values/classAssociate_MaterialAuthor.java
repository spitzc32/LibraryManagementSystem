package values;

public class classAssociate_MaterialAuthor {
	private static int intId, 
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
