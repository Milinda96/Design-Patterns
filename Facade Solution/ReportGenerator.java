public class ReportGenerator {

    public void htmlGenrator(Report report) {
        System.out.println("Generate " + Type.HTML + " Report\n");
    }

    public void pdfGenrator(Report report) {
        System.out.println("Generate " + Type.PDF + " Report");
    }
}