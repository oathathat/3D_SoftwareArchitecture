package creational;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public Exporter createExport() {
        return new CSV_concrete();
    }
}
