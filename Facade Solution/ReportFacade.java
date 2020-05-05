public class ReportFacade {
   
    public static void generateReport(Type type) {
        String data="custom report";
       
        if (type == null) {
            // throw exception
        }
        // Create report
        Report report = new Report();

        report.setHeader(new Header());
        report.setFooter(new Footer());
        report.setContent(data);

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