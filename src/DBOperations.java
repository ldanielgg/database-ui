import java.sql.*;
import java.util.Date;

public class DBOperations {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/company2_employeedb";
    private static final String PASSWORD = "password";
    private static final String USERNAME = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    public static void displayEmployees() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println(rs.getString(1) + ": " + rs.getString(2) + " " + rs.getString(3));
            }
            rs.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void searchEmployeeByName(String name) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String[] nameParts = name.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE FirstName = '" + firstName + "' AND LastName = '" + lastName + "'");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (metaData.getColumnName(i).equals("Salary")) {
                        System.out.println("Salary: $" + rs.getString(i));
                    } else {
                        System.out.println(metaData.getColumnName(i) + ": " + rs.getString(i));
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

    public static void searchEmployeeBySSN(String ssn) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE ssn = " + ssn);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(metaData.getColumnName(i) + ": " + rs.getString(i));
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

    public static void searchEmployeeById(Integer empID) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE EmployeeID = " + empID);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println(metaData.getColumnName(i) + ": " + rs.getString(i));
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

    public static void addEmployee(Integer empID, String firstName, String lastName, String ssn, String jobTitle, Integer departmentID, Float salary, Date date, Integer managerID) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            // Insert the employee into the database
            String sql = "INSERT INTO employees (EmployeeID, FirstName, LastName, ssn, JobTitle, DepartmentID, Salary, HireDate, ManagerID) " +
                    "VALUES (" + empID + ", '" + firstName + "', '" + lastName + "', '" + ssn + "', '" + jobTitle + "', " +
                    departmentID + ", " + salary + ", '" + date + "', " + managerID + ")";
            statement.executeUpdate(sql);
            statement.close();
            connection.close();
            System.out.println(firstName + " " + lastName + " has been successfully added.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void removeEmployee(Integer empID) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees WHERE EmployeeID = " + empID);
            if (!rs.next()) {
                System.out.println("Employee with ID " + empID + " not found.");
            } else {
                String sql = "DELETE FROM employees WHERE EmployeeID = " + empID;
                statement.executeUpdate(sql);
                System.out.println("Employee with ID " + empID + " has been removed.");
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateSalaries(Float percentageIncrease, Float lowerBound, Float upperBound) {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            String sql = "UPDATE employees SET Salary = Salary * (1 + " + percentageIncrease + ") WHERE Salary BETWEEN " + lowerBound + " AND " + upperBound;
            int rowsAffected = statement.executeUpdate(sql);
            if (rowsAffected > 0) {
                System.out.println("Salaries updated successfully.");
            } else {
                System.out.println("No salaries were updated.");
            }
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
