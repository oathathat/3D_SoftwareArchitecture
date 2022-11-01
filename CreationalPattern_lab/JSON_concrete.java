package creational;

import java.io.IOException;
import java.util.Set;

public class JSON_concrete implements Exporter{
    private JSONBookMetadataFormatter formatter;

    JSON_concrete(){
    }
    @Override
    public String getMetadataString(Set<Book> books) {
        try {
            formatter = new JSONBookMetadataFormatter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Book b:books) {
            formatter.append(b);
        }
        return formatter.getMetadataString();
    }


}
