import java.sql.*;

public class GenerateReport {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/company2_employeedb";
    private static final String PASSWORD = "password";
    private static final String USERNAME = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    public static void generateReportAllEmployees() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT CONCAT(e.FirstName, \" \", e.LastName) AS \"Name\", e.EmployeeID, e.SSN, e.Salary, p.Amount, p.PayDate FROM employees e LEFT JOIN paystatements p ON e.EmployeeID = p.EmployeeID");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount - 1; i++) {
                    if (i == columnCount - 1) {
                        System.out.println("Pay History:");
                        System.out.println("- " + rs.getString(i + 1) + ": $" + rs.getString(i));
                        System.out.println();
                        break;
                    } else {
                        System.out.println(metaData.getColumnLabel(i) + ": " + rs.getString(i));
                    }
                }
            }
            rs.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void generateReportByJobTitle() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT JobTitle, SUM(Salary) FROM employees GROUP BY JobTitle");
            while (rs.next()) {
                System.out.println(rs.getString(1) + ": $" + rs.getString(2));
            }
            System.out.println();
            rs.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void generateReportByDepartmentID() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT DepartmentID, SUM(Salary) FROM employees GROUP BY DepartmentID");
            while (rs.next()) {
                System.out.println(rs.getString(1) + ": $" + rs.getString(2));
            }
            System.out.println();
            rs.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
