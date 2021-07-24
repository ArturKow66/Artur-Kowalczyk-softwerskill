package pl.softwareskill.sprin.ioc.bad;

import java.util.Objects;

public class DocumentService {

    private final PdfGenerator pdfGenerator = new PdfGenerator();
    private final TxtGenerator txtGenerator = new TxtGenerator();
    private final JasonGenerator jasonGenerator = new JasonGenerator();
    private final XmlGenerator xmlGenerator = new XmlGenerator();

    public String generate(final DocumentType documentType) {
        if (Objects.isNull(documentType)) {
            throw new BadDocumentTypeException("Bad document type!");
        }

        if (documentType.equals(DocumentType.PDF)) {

            return pdfGenerator.generate();
        } else if (documentType.equals(DocumentType.TXT)) {

            return txtGenerator.generate();
        } else if (documentType.equals(DocumentType.JSON)) {

            return jasonGenerator.generate();
        } else if (documentType.equals(DocumentType.XML)) {

            return xmlGenerator.generate();
        } else {
            throw new BadDocumentTypeException("Bad document type!");
        }
    }
}
