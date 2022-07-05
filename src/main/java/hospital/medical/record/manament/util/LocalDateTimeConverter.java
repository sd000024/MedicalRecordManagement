package hospital.medical.record.manament.util;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.threeten.bp.LocalDateTime;


public class LocalDateTimeConverter implements Formatter<LocalDateTime> {
    

	@Override
	public String print(LocalDateTime object, Locale locale) {
		 if (object == null)
	            return null;
	        return object.toString();
	}

	@Override
	public LocalDateTime parse(String text, Locale locale) throws ParseException {
		if (text == null || text.isEmpty())
            return null;
		
        return LocalDateTime.parse(text);
	}
    
}
