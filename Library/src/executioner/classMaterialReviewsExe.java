package executioner;

import SQLCrudStatements.classMaterialReviewsCRUD;
import values.classEntity;
import values.classObject;
import values.classMaterialReviews;
import general.classComboItem;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class classMaterialReviewsExe {
	
	public static void funcRetrieveEntityVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classEntity> entities = classMaterialReviewsCRUD.funcRetrieveMaterialReviewsObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classEntity entity: entities) {
			String name = entity.funcgetLastName() + ", " + 
						  entity.funcgetFirstName() + " " +
						  entity.funcgetMiddleName();
			comboBox.addItem(new classComboItem(name, entity.funcgetId()));
		}
	}
	
	public static void funcRetrieveObjectVal (String table, JComboBox<classComboItem> comboBox) {
		ArrayList<classObject> objects = classMaterialReviewsCRUD.funcRetrieveObjectMaterialReviewsObj(table);
		
		comboBox.addItem(new classComboItem("select", 0));
		
		for (classObject object: objects) {
			comboBox.addItem(new classComboItem(object.funcgetTitle(), object.funcgetId()));
		}
	}
	
	public static void setValues(classMaterialReviews matrev, int MaterialId, int StudentId, int ProfessorId, 
			String Comment, Date Timestamp) {
		matrev.funcsetMaterialId(MaterialId);
		matrev.funcsetStudentId(StudentId);
		matrev.funcsetProfessorId(ProfessorId);
		matrev.funcsetComment(Comment);
		matrev.funcsetTimestamp(Timestamp);
	}
	
	public static String exeInsertStatements (classMaterialReviews matrev) {
		int intRes = classMaterialReviewsCRUD.funcCreateMaterialsObj(matrev);
		
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
		ArrayList<classMaterialReviews> materialreviews =  classMaterialReviewsCRUD.funcReadMeterialReviewsObj(); 
		
		for (classMaterialReviews material : materialreviews) {
			classObject MaterialId = classMaterialReviewsCRUD.funcRetrieveDisplayObjectMRObj("materials", material.funcgetMaterialId());
			classEntity StudentId = classMaterialReviewsCRUD.funcRetrieveDisplayEntityMRObj("student", material.funcgetStudentId());
			classEntity ProfessorId = classMaterialReviewsCRUD.funcRetrieveDisplayEntityMRObj("professor", material.funcgetProfessorId());
			
			Object objList[] = {
								material.funcgetId(),
								MaterialId.funcgetTitle(),
								StudentId.funcgetLastName() + ", " + StudentId.funcgetFirstName(),
								ProfessorId.funcgetLastName() + ", " + ProfessorId.funcgetFirstName(),
								material.funcgetComment(),
								material.funcgetTimestamp()
							   };
			table.addRow(objList);
		}
	}
	
}
