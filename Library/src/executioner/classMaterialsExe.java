package executioner;

import java.sql.Date;
import values.classMaterials;
import SQLCrudStatements.classMaterialsCRUD;

import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class classMaterialsExe {
	public static void setValues(classMaterials mat, String MaterialTitle, String Description, String Edition,
			Date YearOfPublication, Date DatePublished, String TypeOfMaterial) {
		mat.funcsetTitle(MaterialTitle);
		mat.funcsetDescription(Description);
		mat.funcsetEdition(Edition);
		mat.funcsetYearOfPublication(YearOfPublication);
		mat.funcsetDatePublished(DatePublished);
		mat.funcsetTypeOfMaterial(TypeOfMaterial);
	}
	
	public static String exeInsertStatements (classMaterials mat) {
		int intRes = classMaterialsCRUD.funcCreateMaterialsObj(mat);
		
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
		ArrayList<classMaterials> materials =  classMaterialsCRUD.funcReadMeterialsObj(); 
		
		for (classMaterials material : materials) {
			Object objList[] = {
								material.funcgetId(),
								material.funcgetTitle(),
								material.funcgetDescription(), 
								material.funcgetEdition(),
								material.funcgetYearOfPublication(),
								material.funcgetDatePublished(),
								material.funcgetTypeOfMaterial(),
							
							   };
			table.addRow(objList);
		}
	}
}
