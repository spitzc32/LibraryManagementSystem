package executioner;

import SQLCrudStatements.classAssociate_ProfessorMaterialTrackerCRUD;
import values.classEntity;
import values.classObject;
import values.classAssociate_ProfessorMaterialTracker;
import general.classComboItem;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class classProfessorBookFormExe {
//retrives 
	public static void funcRetrieveEntityVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classEntity> entities = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveAssociate_ProfessorMaterialTrackerObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classEntity entity: entities) {
			String name = entity.funcgetLastName() + ", " + 
						  entity.funcgetFirstName() + " " +
						  entity.funcgetMiddleName();
			comboBox.addItem(new classComboItem(name, entity.funcgetId()));
		}
	}
	
	public static void funcRetrieveObjectVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classObject> objects = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveObjectAssociate_ProfessorMaterialTrackerObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classObject object: objects) {
			comboBox.addItem(new classComboItem(object.funcgetTitle(), object.funcgetId()));
		}
	}
	
	public static void setValues(classAssociate_ProfessorMaterialTracker professor, int professorId, int subjectId, int librarianId, int materialId, 
			Date dateBorrowed, Date dateReturned, int isDue, int isReturned, Date assignedDateReturn) {
		professor.funcsetProfessorId(professorId);
		professor.funcsetSubjectId(subjectId);
		professor.funcsetlibririanId(librarianId);
		professor.funcsetMaterialId(materialId);
		professor.funcsetDateBorrowed(dateBorrowed);
		professor.funcsetDateReturned(dateReturned);
		professor.funcsetIsDue(isDue);
		professor.funcsetIsReturned(isReturned);
		professor.funcsetAssignedDateReturn(assignedDateReturn);
	}
	
	public static String exeInsertStatements (classAssociate_ProfessorMaterialTracker professor) {
		int intRes = classAssociate_ProfessorMaterialTrackerCRUD.funcCreateAssociate_ProfessorMaterialTrackerObj(professor);
		
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
		ArrayList<classAssociate_ProfessorMaterialTracker> professors =  classAssociate_ProfessorMaterialTrackerCRUD.funcReadAssociate_ProfessorMaterialTrackerObj(); 
		
		for (classAssociate_ProfessorMaterialTracker professor : professors) {
			classObject subjectId = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveDisplayObjectAPMTObj("subject", professor.funcgetSubjectId());
			classEntity librarianId = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveDisplayEntityAPMTObj("librarian", professor.funcgetlibririanId());
			classEntity professorId = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveDisplayEntityAPMTObj("professor", professor.funcgetProfessorId());
			classObject materialId = classAssociate_ProfessorMaterialTrackerCRUD.funcRetrieveDisplayObjectAPMTObj("materials", professor.funcgetMaterialId());
			
			Object objList[] = {
								professor.funcgetId(),
								subjectId.funcgetTitle(), 
								librarianId.funcgetLastName() + ", " + librarianId.funcgetFirstName(),
								professorId.funcgetLastName() + ", " + professorId.funcgetFirstName(),
								materialId.funcgetTitle(),
								professor.funcgetDateBorrowed(),
								professor.funcgetDateReturned(),
								professor.funcgetIsDue() == 1 ? "Yes" : "No",
								professor.funcgetIsReturned() == 1 ? "Yes" : "No",
								professor.funcgetAssignedDateReturn()
							   };
			table.addRow(objList);
		}
	}

}
