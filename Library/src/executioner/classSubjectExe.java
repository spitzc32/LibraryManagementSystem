package executioner;


import values.classSubject;
import SQLCrudStatements.classSubjectCRUD;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classSubjectExe {
	public static void setValues(classSubject sub, String Title, String Description, String Code)
	{
		sub.funcsetTitle(Title);
		sub.funcsetDescription(Description);
		sub.funcsetCode(Code);
	}
	
	public static String exeInsertStatements (classSubject sub) {
		int intRes = classSubjectCRUD.funcCreateSubjectObj(sub);
		
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
		ArrayList<classSubject> subjects =  classSubjectCRUD.funcReadSubjectObj(); 
		
		for (classSubject subject : subjects) {
			Object objList[] = {
					subject.funcgetTitle(),
					subject.funcgetDescription(), 
					subject.funcgetCode(),
							   };
			table.addRow(objList);
		}
	}

}
