package creational;

import java.io.IOException;
import java.util.Set;

public class CSV_concrete implements Exporter{
    private CSVBookMetadataFormatter formatter;

    @Override
    public String getMetadataString(Set<Book> books) {
        try {
            formatter = new CSVBookMetadataFormatter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Book b:books) {
            formatter.append(b);
        }
        return formatter.getMetadataString();
    }
}
