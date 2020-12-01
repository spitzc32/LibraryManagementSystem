package values;

import java.sql.Date;

/* This is the value getter and setter for Materials Obj.
* fields:
* 	id           	  <type:Int>
*  Title    	 	  <type:String>
*  Description   	  <type:String>
*  Edition       	  <type:String>
*  YearOfPublication  <type:Date>
*  DatePublished      <type:Date>
*  TypeOfMaterial     <type:String>
*  
* This class' main purpose is to store and get the values from the database and input fields
* */

public class classMaterials {
	private int intId;
	
	private String strTitle, 
				  strDescription, 
				  strEdition,
				  strTypeOfMaterial;
	
	private Date dateYearOfPublication,
				dateDatePublished;
	
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
	
	public String funcgetDescription () {
		return strDescription;
	}
	
	public void funcsetDescription (String data) {
		strDescription = data;
	}
	
	public String funcgetEdition () {
		return strEdition;
	}
	
	public void funcsetEdition (String data) {
		strEdition = data;
	}
	
	public String funcgetTypeOfMaterial () {
		return strTypeOfMaterial;
	}
	
	public void funcsetTypeOfMaterial (String data) {
		strTypeOfMaterial = data;
	}
	
	//Date Fields: From YearOfPublication to DatePublished
	public Date funcgetYearOfPublication () {
		return dateYearOfPublication;
	}
	
	public void funcsetYearOfPublication (Date date) {
		dateYearOfPublication = date;
	}
	
	public Date funcgetDatePublished () {
		return dateDatePublished;
	}
	
	public void funcsetDatePublished (Date date) {
		dateDatePublished = date;
	}
}
