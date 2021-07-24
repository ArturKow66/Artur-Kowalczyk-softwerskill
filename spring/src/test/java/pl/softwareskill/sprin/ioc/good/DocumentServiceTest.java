package pl.softwareskill.sprin.ioc.good;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DocumentService Test Suite")
class DocumentServiceTest {

    private static int testCounter = 0;

    private DocumentService givenDocumentService(final DocumentGenerator generator) {
        return new DocumentService(generator);
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Test Case: #" + testCounter + " begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Test: generate Jason")
    @Test
    public void testGenerateJason() {
        //given
        DocumentService documentService = givenDocumentService(new JasonGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assertions.assertThat(result).contains("Jason");
    }

    @DisplayName("Test: generate pdf")
    @Test
    public void testGeneratePdf() {
        //given
        DocumentService documentService = givenDocumentService(new PdfGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assertions.assertThat(result).contains("Pdf");
    }

    @DisplayName("Test: generate txt")
    @Test
    public void testGenerateTxt() {
        //given
        DocumentService documentService = givenDocumentService(new TxtGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assertions.assertThat(result).contains("Txt");
    }

    @DisplayName("Test: generate Xml")
    @Test
    public void testGenerateXml() {
        //given
        DocumentService documentService = givenDocumentService(new XmlGenerator());

        //when
        final String result = documentService.generate();

        //then
        Assertions.assertThat(result).contains("Xml");
    }
}