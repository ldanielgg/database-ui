import java.sql.*;
import java.util.Date;

public class DBUpdateEmployeeEmpID {
    public static void updateEmployeeFirstName(int empIDToUpdate, String newFirstName) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET FirstName = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newFirstName);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee first name updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeLastName(int empIDToUpdate, String newLastName) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET LastName = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newLastName);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee last name updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeSSN(int empIDToUpdate, String newSSN) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET SSN = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newSSN);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee SSN updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeJobTitle(int empIDToUpdate, String newJobTitle) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET JobTitle = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newJobTitle);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee job title updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeDepartmentID(int empIDToUpdate, int newDepartmentID) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET DepartmentID = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newDepartmentID);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee department ID updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeSalary(int empIDToUpdate, float newSalary) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET Salary = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setFloat(1, newSalary);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee salary updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeHireDate(int empIDToUpdate, Date newHireDate) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET HireDate = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, new java.sql.Date(newHireDate.getTime()));
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee hire date updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeManagerID(int empIDToUpdate, int newManagerID) {
        try {
            Connection connection = DBOperations.getConnection();
            String sql = "UPDATE employees SET ManagerID = ? WHERE EmployeeID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newManagerID);
            preparedStatement.setInt(2, empIDToUpdate);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee manager ID updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
