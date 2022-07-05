package hospital.medical.record.manament.util;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.threeten.bp.LocalDate;


public class LocalDateConverter implements Formatter<LocalDate> {

	@Override
	public String print(LocalDate object, Locale locale) {
		if (object == null)
			return null;
		return object.toString();
	}

	@Override
	public LocalDate parse(String text, Locale locale) throws ParseException {
		if (text == null)
			return null;

		return LocalDate.parse(text);
	}
}
