package values;


/* This is the value getter and setter for Author Obj.
* fields:
* 	id           <type:Int>
*  FirstName    <type:String>
*  LastName     <type:String>
*  MiddleName   <type:String>
*  Address      <type:String>
*  City         <type:String>
*  Province     <type:String>
*  Country      <type:String>
*  
* This class' main purpose is to store and get the values from the database and input fields
* */

public class classAuthor {
	private int intId;
	
	private String strFirstName, 
			      strLastName, 
			      strMiddleName,
			      strAddress,
			      strCity,
			      strProvince,
			      strCountry;
	
	public int funcgetId () {
		return intId;
	}
	
	public void funcsetId (int paramId) {
		intId = paramId;
	}
	

	// String Fields : FirstName to Country
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
	
	public String funcgetCountry () {
		return strCountry;
	}
	
	public void funcsetCountry (String data) {
		strCountry = data;
	}
}
