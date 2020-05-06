import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) {
        System.out.println("Enter your selection:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String selection = null;
        try {
            selection = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MainCreater maincreater = StatementCreater.getInstance();
        StatementType objStmtType = maincreater.createStatements(selection);
        System.out.println(objStmtType.print());
    }
 
}
