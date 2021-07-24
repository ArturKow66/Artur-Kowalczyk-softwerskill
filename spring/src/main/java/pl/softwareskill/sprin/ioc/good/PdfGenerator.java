package pl.softwareskill.sprin.ioc.good;

public class PdfGenerator implements DocumentGenerator {

    @Override
    public String generate() {
        return "Generate Pdf";
    }
}
