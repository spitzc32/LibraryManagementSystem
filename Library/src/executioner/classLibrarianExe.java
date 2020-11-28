package executioner;

import java.sql.Date;
import values.classLibrarian;
import SQLCrudStatements.classLibrarianCRUD;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classLibrarianExe {
	
	public static void setValues(classLibrarian lib, String FirstName, String LastName, String MiddleName, String Webmail, 
			Date date, String Address, String City, String Province, int isWorking, String Shift, int isActive, int isResigned) {
		lib.funcsetFirstName(FirstName);
		lib.funcsetLastName(LastName);
		lib.funcsetMiddleName(MiddleName);
		lib.funcsetWebmail(Webmail);
		lib.funcsetDateOfBirth(date);
		lib.funcsetAddress(Address);
		lib.funcsetCity(City);
		lib.funcsetProvince(Province);
		lib.funcsetIsWorking(isWorking);
		lib.funcsetShift(Shift);
		lib.funcsetIsActive(isActive);
		lib.funcsetIsResigned(isResigned);
	}
	
	public static String exeInsertStatements (classLibrarian lib) {
		int intRes = classLibrarianCRUD.funcCreateLibrarianObj(lib);
		
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
		ArrayList<classLibrarian> librarians =  classLibrarianCRUD.funcReadLibrarianObj(); 
		
		for (classLibrarian librarian : librarians) {
			Object objList[] = {
					librarian.funcgetId(),
					librarian.funcgetFirstName(), 
					librarian.funcgetLastName(),
					librarian.funcgetMiddleName(),
					librarian.funcgetWebmail(),
					librarian.funcgetDateOfBirth(),
					librarian.funcgetAddress(),
					librarian.funcgetCity(),
					librarian.funcgetProvince(),
					librarian.funcgetIsWorking(),
					librarian.funcgetShift(),
					librarian.funcgetIsActive(),
					librarian.funcgetIsResigned()
							   };
			table.addRow(objList);
		}
	}

}
