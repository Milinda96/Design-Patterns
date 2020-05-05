class Report {
    String hearder;
    String footer;
    String data;

    public void setHeader() {
        System.out.println("Set Header");
    }

    public void setData() {
        System.out.println("Set Data");
    }

    public void setFooter() {
        System.out.println("Set Footer");
    }

    public void printPDF() {
        System.out.println("Print PDF");
    }

    public void printHTML() {
        System.out.println("Print HTML");
    }
}

class Main {
    public static void main(String[] args) {
        final Report report = new Report();

        report.setHeader();
        report.setData();
        report.setFooter();
        report.printPDF();
        report.printHTML();
    }
}