package creational;

import java.io.PrintStream;

//creator
public abstract class BookMetadataExporter extends BookCollection {
    public abstract Exporter createExport();

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        Exporter e = createExport() ;
        stream.println(e.getMetadataString(books));
    }
}
