package pl.kownacki.funds.backend.model.jpa;

import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter
public class LocalDateToStringConverter implements AttributeConverter<LocalDate, String>{

    private static final DateTimeFormatter START_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public String convertToDatabaseColumn(LocalDate attribute) {
        if(attribute == null) {
            return null;
        } else {
            return attribute.format(START_DATE_FORMAT);
        }
    }

    @Override
    public LocalDate convertToEntityAttribute(String dbData) {
        if(StringUtils.isEmpty(dbData)) {
            return null;
        } else {
            return LocalDate.parse(dbData, START_DATE_FORMAT);
        }
    }
}
