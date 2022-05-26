package kpo.lab6;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class PatientValidator {

    public static void validate (final String xml, final String xsd) {

        //Проверка входных данных
        if (xml == null || xml.isEmpty()) {
            System.out.println("ERROR: путь/имя XML не должно быть null");
            return;
        }
        if (xsd == null ) {
            System.out.println("ERROR: Для проверки XML требуется XSD");
            return;
        }
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try {
            //Создаем схему из xsd
            final Schema schema = schemaFactory.newSchema(new File(xsd));
            final Validator validator = schema.newValidator();
            System.out.println("Валидация " + xml + " XSD " + xsd);
            //Производим валидацию
            validator.validate(new StreamSource(new File(xml)));
        }
        catch (IOException | SAXException exception) {
            System.out.println("ERROR: Не удалось провести валидацию " + xml + " XSDs " + xsd + " - " + exception);
            return;
        }
        System.out.println("Валидация завершена.");
    }
}
