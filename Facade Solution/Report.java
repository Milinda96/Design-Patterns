public class Report {

    private Header header;
    private String data;
    private Footer footer;
    private Type type;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
        System.out.println("Set Report Header");
    }

    public String getContent() {
        return data;
    }

    public void setContent(String data) {
        this.data = data;
        System.out.println("Set Report Data:"+ this.data);
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
        System.out.println("Set Report Footer");
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
        System.out.println("Set Report Type");
    }

}