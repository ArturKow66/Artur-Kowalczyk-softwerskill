package pl.softwareskill.sprin.ioc.good;

public class DocumentService {

    private final DocumentGenerator documentGenerator;

    public DocumentService(DocumentGenerator documentGenerator) {
        this.documentGenerator = documentGenerator;
    }

    public String generate() {
        return documentGenerator.generate();
    }
}
