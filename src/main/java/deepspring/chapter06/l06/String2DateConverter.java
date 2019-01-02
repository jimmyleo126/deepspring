package deepspring.chapter06.l06;

import org.springframework.core.convert.converter.Converter;

public class String2DateConverter implements Converter<String, String> {

	@Override
	public String convert(String source) {
		return source + "liu";
	}


}
