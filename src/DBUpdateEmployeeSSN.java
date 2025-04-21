import java.sql.*;
import java.util.Date;

public class DBUpdateEmployeeSSN {
    public static void updateEmployeeFirstName(int ssnToUpdate, String newFirstName) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET FirstName = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newFirstName);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee first name updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeLastName(int ssnToUpdate, String newLastName) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET LastName = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newLastName);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee last name updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeSSN(int ssnToUpdate, String newSSN) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET SSN = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newSSN);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee SSN updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeJobTitle(int ssnToUpdate, String newJobTitle) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET JobTitle = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newJobTitle);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee job title updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeDepartmentID(int ssnToUpdate, int newDepartmentID) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET DepartmentID = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newDepartmentID);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee department ID updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeSalary(int ssnToUpdate, float newSalary) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET Salary = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1, newSalary);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee salary updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeHireDate(int ssnToUpdate, Date newHireDate) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET HireDate = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(newHireDate.getTime()));
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee hire date updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeManagerID(int ssnToUpdate, int newManagerID) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET ManagerID = ? WHERE SSN = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newManagerID);
            preparedStatement.setInt(2, ssnToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee manager ID updated successfully.");
            } else {
                System.out.println("No employee found with the given SSN.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
