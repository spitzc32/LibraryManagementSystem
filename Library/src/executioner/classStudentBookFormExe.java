package executioner;

import SQLCrudStatements.classAssociate_StudentMaterialTrackerCRUD;
import values.classEntity;
import values.classObject;
import values.classAssociate_StudentMaterialTracker;
import general.classComboItem;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class classStudentBookFormExe {
	
	public static void funcRetrieveEntityVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classEntity> entities = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveAssociate_StudentMaterialTrackerObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classEntity entity: entities) {
			String name = entity.funcgetLastName() + ", " + 
						  entity.funcgetFirstName() + " " +
						  entity.funcgetMiddleName();
			comboBox.addItem(new classComboItem(name, entity.funcgetId()));
		}
	}
	
	public static void funcRetrieveObjectVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classObject> objects = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveObjectAssociate_StudentMaterialTrackerObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classObject object: objects) {
			comboBox.addItem(new classComboItem(object.funcgetTitle(), object.funcgetId()));
		}
	}
	
	public static void setValues(classAssociate_StudentMaterialTracker student, int studentId, int subjectId, int librarianId, int materialId, 
			Date dateBorrowed, Date dateReturned, int isDue, int isReturned, Date assignedDateReturn) {
		student.funcsetStudentId(studentId);
		student.funcsetSubjectId(subjectId);
		student.funcsetlibririanId(librarianId);
		student.funcsetMaterialId(materialId);
		student.funcsetDateBorrowed(dateBorrowed);
		student.funcsetDateReturned(dateReturned);
		student.funcsetIsDue(isDue);
		student.funcsetIsReturned(isReturned);
		student.funcsetAssignedDateReturn(assignedDateReturn);
	}
	
	public static String exeInsertStatements (classAssociate_StudentMaterialTracker student) {
		int intRes = classAssociate_StudentMaterialTrackerCRUD.funcCreateAssociate_StudentMaterialTrackerObj(student);
		
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
		ArrayList<classAssociate_StudentMaterialTracker> students =  classAssociate_StudentMaterialTrackerCRUD.funcReadAssociate_StudentMaterialTrackerObj(); 
		
		for (classAssociate_StudentMaterialTracker student : students) {
			classObject subjectId = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveDisplayObjectASMTObj("subject", student.funcgetSubjectId());
			classEntity librarianId = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveDisplayEntityASMTObj("librarian", student.funcgetlibririanId());
			classEntity studenttId = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveDisplayEntityASMTObj("student", student.funcgetStudentId());
			classObject materialId = classAssociate_StudentMaterialTrackerCRUD.funcRetrieveDisplayObjectASMTObj("materials", student.funcgetMaterialId());
			
			Object objList[] = {
								student.funcgetId(),
								subjectId.funcgetTitle(), 
								librarianId.funcgetLastName() + ", " + librarianId.funcgetFirstName(),
								studenttId.funcgetLastName() + ", " + studenttId.funcgetFirstName(),
								materialId.funcgetTitle(),
								student.funcgetDateBorrowed(),
								student.funcgetDateReturned(),
								student.funcgetIsDue() == 1 ? "Yes" : "No",
								student.funcgetIsReturned() == 1 ? "Yes" : "No",
								student.funcgetAssignedDateReturn()
							   };
			table.addRow(objList);
		}
	}
	
}
