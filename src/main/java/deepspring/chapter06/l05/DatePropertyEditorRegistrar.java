package deepspring.chapter06.l05;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {

	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM/dd"), true));
	}

}
