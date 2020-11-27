package executioner;

import java.sql.Date;
import values.classStudent;
import SQLCrudStatements.classStudentCRUD;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classStudentExe {
	
	public static void setValues(classStudent stu, String FirstName, String LastName, String MiddleName, String Webmail, 
			Date date, String Address, String City, String Province, String Course, int isGraduated, int isEnrolled) {
		stu.funcsetFirstName(FirstName);
		stu.funcsetLastName(LastName);
		stu.funcsetMiddleName(MiddleName);
		stu.funcsetWebmail(Webmail);
		stu.funcsetDateOfBirth(date);
		stu.funcsetAddress(Address);
		stu.funcsetCity(City);
		stu.funcsetProvince(Province);
		stu.funcsetCourse(Course);
		stu.funcsetIsGraduated(isGraduated);
		stu.funcsetIsEnrolled(isEnrolled);
	}
	
	public static String exeInsertStatements (classStudent stu) {
		int intRes = classStudentCRUD.funcCreateStudentObj(stu);
		
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
		ArrayList<classStudent> students =  classStudentCRUD.funcReadStudentObj(); 
		
		for (classStudent student : students) {
			Object objList[] = {
								student.funcgetId(),
								student.funcgetFirstName(), 
								student.funcgetLastName(),
								student.funcgetMiddleName(),
								student.funcgetWebmail(),
								student.funcgetDateOfBirth(),
								student.funcgetAddress(),
								student.funcgetCity(),
								student.funcgetProvince(),
								student.funcgetCourse(),
								student.funcgetIsGraduated(),
								student.funcgetIsEnrolled()
							   };
			table.addRow(objList);
		}
	}
}
