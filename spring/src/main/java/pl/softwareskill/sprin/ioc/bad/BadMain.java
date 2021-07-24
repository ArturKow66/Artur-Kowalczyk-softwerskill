package pl.softwareskill.sprin.ioc.bad;

public class BadMain {

    public static void main(String[] args){

        final DocumentService documentService = new DocumentService();
        System.out.println(documentService.generate(DocumentType.XML));
    }
}
