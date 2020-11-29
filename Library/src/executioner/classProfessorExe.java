package executioner;

import java.sql.Date;
import values.classProfessor;
import SQLCrudStatements.classProfessorCRUD;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classProfessorExe {
	public static void setValues(classProfessor prof, String FirstName, String LastName, String MiddleName, String Webmail, 
			Date date, String Address, String City, String Province, String Course, int isWorking, String shift, int isActive, int isResigned) {
		prof.funcsetFirstName(FirstName);
		prof.funcsetLastName(LastName);
		prof.funcsetMiddleName(MiddleName);
		prof.funcsetWebmail(Webmail);
		prof.funcsetDateOfBirth(date);
		prof.funcsetAddress(Address);
		prof.funcsetCity(City);
		prof.funcsetProvince(Province);
		prof.funcsetCourse(Course);
		prof.funcsetIsWorking(isWorking);
		prof.funcsetShift(shift);
		prof.funcsetIsActive(isActive);
		prof.funcsetIsActive(isResigned);
	}
	
	public static String exeInsertStatements (classProfessor prof) {
		int intRes = classProfessorCRUD.funcCreateProfessorObj(prof);
		
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
		ArrayList<classProfessor> professors =  classProfessorCRUD.funcReadProfessorObj(); 
		
		for (classProfessor professor : professors) {
			Object objList[] = {
								professor.funcgetId(),
								professor.funcgetFirstName(), 
								professor.funcgetLastName(),
								professor.funcgetMiddleName(),
								professor.funcgetWebmail(),
								professor.funcgetDateOfBirth(),
								professor.funcgetAddress(),
								professor.funcgetCity(),
								professor.funcgetProvince(),
								professor.funcgetCourse(),
								professor.funcgetIsWorking() == 1 ? "Yes" : "No",
								professor.funcgetShift(),
								professor.funcgetIsActive() == 1 ? "Yes" : "No",
								professor.funcgetIsResigned() == 1 ? "Yes" : "No",
							   };
			table.addRow(objList);
		}
	}
}
