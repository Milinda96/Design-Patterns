public class Main {
    public static void main(final String[] args) throws Exception {
        ReportFacade.generateReport(Type.HTML);
        ReportFacade.generateReport(Type.PDF);
    }
}