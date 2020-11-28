package executioner;

import values.classAuthor;
import SQLCrudStatements.classAuthorCRUD;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classAuthorExe {
	public static void setValues(classAuthor aut, String FirstName, String LastName, 
			String MiddleName,String Address, String City, String Province, String Country) {
		aut.funcsetFirstName(FirstName);
		aut.funcsetLastName(LastName);
		aut.funcsetMiddleName(MiddleName);
		aut.funcsetAddress(Address);
		aut.funcsetCity(City);
		aut.funcsetProvince(Province);
		aut.funcsetCountry(Country);
	}
	
	public static String exeInsertStatements (classAuthor aut) {
		int intRes = classAuthorCRUD.funcCreateAuthorObj(aut);
		
		if (intRes > 0) {
			return "Saved Changes. Please exit then reload this window.";
		} else {
			return "Changes failed to reflect in the database. Try Again";
		}
	}
	
	public static void exeReadStatements (DefaultTableModel table) {
		/* TODO: need an execute statement that returns a list of values so that we can
		 * incorporate the values returned from our statement to this table.  
		 * */
		ArrayList<classAuthor> authors =  classAuthorCRUD.funcReadAuthorObj(); 
		
		for (classAuthor author : authors) {
			Object objList[] = {
					author.funcgetId(),
					author.funcgetFirstName(), 
					author.funcgetLastName(),
					author.funcgetMiddleName(),
					author.funcgetAddress(),
					author.funcgetCity(),
					author.funcgetProvince(),
					author.funcgetCountry(),
							   };
			table.addRow(objList);
		}
	}

}
