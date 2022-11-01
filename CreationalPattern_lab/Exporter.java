package creational;

import java.util.Set;

public interface Exporter {
    String getMetadataString(Set<Book> books);
}
