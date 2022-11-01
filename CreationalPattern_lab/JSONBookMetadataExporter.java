package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public Exporter createExport() {
        return new JSON_concrete();
    }
}
