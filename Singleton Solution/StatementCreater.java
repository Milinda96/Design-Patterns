public class StatementCreater extends MainCreater {
    private static StatementCreater instance;
 
    private StatementCreater() {
    }
 
    public static StatementCreater getInstance() {
        if (instance == null) {
            instance = new StatementCreater();
            System.out.println("Creating a new StatementCreater Instance");
        }
        return instance;
 
    }
 
    public StatementType createStatements(String selection) {
        if (selection.equalsIgnoreCase("detailedStmt")) {
            return new DetailedStatement();
        } else if (selection.equalsIgnoreCase("miniStmt")) {
            return new MiniStatement();
        }
        throw new IllegalArgumentException("Selection does not exist");
    }
}