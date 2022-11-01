package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.util.Set;

public class XML_concrete implements Exporter{
    private XMLBookMetadataFormatter formatter;

    @Override
    public String getMetadataString(Set<Book> books) {
        try {
            formatter =new XMLBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        for (Book b:books) {
            formatter.append(b);
        }
        return formatter.getMetadataString();
    }
}
