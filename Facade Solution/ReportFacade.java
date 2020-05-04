public class ReportFacade {
    public static void generateReport(Type type) {
        if (type == null) {
            // throw exception
        }
        // Create report
        Report report = new Report();

        report.setHeader(new Header());
        report.setFooter(new Footer());
        report.setContent(new Content());

        // Generate report
        ReportGenerator generator = new ReportGenerator();
        switch (type) {
            case HTML:
                generator.htmlGenrator(report);
                break;

            case PDF:
                generator.pdfGenrator(report);
                break;
        }
    }
}