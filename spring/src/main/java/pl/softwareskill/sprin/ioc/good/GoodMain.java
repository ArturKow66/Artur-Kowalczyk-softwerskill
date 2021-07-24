package pl.softwareskill.sprin.ioc.good;

public class GoodMain {

    public static void main(String[] args) {

        //3
        System.out.println(new DocumentService(new XmlGenerator()).generate());

        //2
        /*
        final DocumentService documentService = new DocumentService(new XmlGenerator());
        System.out.println(documentService.generate());
         */

        //1
        /*
        final DocumentGenerator documentGenerator = new XmlGenerator();
        final DocumentService documentService = new DocumentService(documentGenerator);
        System.out.println(documentService.generate());
         */
    }
}
