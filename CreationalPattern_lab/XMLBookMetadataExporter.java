package creational;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public Exporter createExport() {
        return new XML_concrete();
    }
}
