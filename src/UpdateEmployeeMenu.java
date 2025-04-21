import java.sql.Date;
import java.util.Scanner;

public class UpdateEmployeeMenu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void updateEmployeeMenuID(Integer empIDToUpdate) {
        try {
            System.out.println("=============================");
            System.out.println("     Employee Information    ");
            System.out.println("=============================");
            System.out.println();
            System.out.println("[1] Update employee first name");
            System.out.println("[2] Update employee last name");
            System.out.println("[3] Update employee SSN");
            System.out.println("[4] Update employee job title");
            System.out.println("[5] Update employee department ID");
            System.out.println("[6] Update employee salary");
            System.out.println("[7] Update employee hire date");
            System.out.println("[8] Update employee manager ID");
            System.out.println("[9] Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int updateFieldChoiceID = scanner.nextInt();
            scanner.nextLine();
            switch (updateFieldChoiceID) {
                case 1:
                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    DBUpdateEmployeeEmpID.updateEmployeeFirstName(empIDToUpdate, newFirstName);
                    break;
                case 2:
                    System.out.print("Enter new last name: ");
                    String newLastName = scanner.nextLine();
                    DBUpdateEmployeeEmpID.updateEmployeeLastName(empIDToUpdate, newLastName);
                    break;
                case 3:
                    System.out.print("Enter new SSN: ");
                    String newSSN = scanner.nextLine();
                    DBUpdateEmployeeEmpID.updateEmployeeSSN(empIDToUpdate, newSSN);
                    break;
                case 4:
                    System.out.print("Enter new job title: ");
                    String newJobTitle = scanner.nextLine();
                    DBUpdateEmployeeEmpID.updateEmployeeJobTitle(empIDToUpdate, newJobTitle);
                    break;
                case 5:
                    System.out.print("Enter new department ID: ");
                    int newDepartmentID = scanner.nextInt();
                    DBUpdateEmployeeEmpID.updateEmployeeDepartmentID(empIDToUpdate, newDepartmentID);
                    break;
                case 6:
                    System.out.print("Enter new salary: ");
                    float newSalary = scanner.nextFloat();
                    DBUpdateEmployeeEmpID.updateEmployeeSalary(empIDToUpdate, newSalary);
                    break;
                case 7:
                    System.out.print("Enter new hire date (yyyy-mm-dd): ");
                    Date newHireDate = Date.valueOf(scanner.next());
                    DBUpdateEmployeeEmpID.updateEmployeeHireDate(empIDToUpdate, newHireDate);
                    break;
                case 8:
                    System.out.print("Enter new manager ID: ");
                    int newManagerID = scanner.nextInt();
                    DBUpdateEmployeeEmpID.updateEmployeeManagerID(empIDToUpdate, newManagerID);
                    break;
                case 9:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void updateEmployeeMenuSSN(Integer ssnToUpdate) {
        try {
            System.out.println("=============================");
            System.out.println("     Employee Information    ");
            System.out.println("=============================");
            System.out.println();
            System.out.println("[1] Update employee first name");
            System.out.println("[2] Update employee last name");
            System.out.println("[3] Update employee SSN");
            System.out.println("[4] Update employee job title");
            System.out.println("[5] Update employee department ID");
            System.out.println("[6] Update employee salary");
            System.out.println("[7] Update employee hire date");
            System.out.println("[8] Update employee manager ID");
            System.out.println("[9] Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int updateFieldChoiceID = scanner.nextInt();
            scanner.nextLine();
            switch (updateFieldChoiceID) {
                case 1:
                    System.out.print("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    DBUpdateEmployeeSSN.updateEmployeeFirstName(ssnToUpdate, newFirstName);
                    break;
                case 2:
                    System.out.print("Enter new last name: ");
                    String newLastName = scanner.nextLine();
                    DBUpdateEmployeeSSN.updateEmployeeLastName(ssnToUpdate, newLastName);
                    break;
                case 3:
                    System.out.print("Enter new SSN: ");
                    String newSSN = scanner.nextLine();
                    DBUpdateEmployeeSSN.updateEmployeeSSN(ssnToUpdate, newSSN);
                    break;
                case 4:
                    System.out.print("Enter new job title: ");
                    String newJobTitle = scanner.nextLine();
                    DBUpdateEmployeeSSN.updateEmployeeJobTitle(ssnToUpdate, newJobTitle);
                    break;
                case 5:
                    System.out.print("Enter new department ID: ");
                    int newDepartmentID = scanner.nextInt();
                    DBUpdateEmployeeSSN.updateEmployeeDepartmentID(ssnToUpdate, newDepartmentID);
                    break;
                case 6:
                    System.out.print("Enter new salary: ");
                    float newSalary = scanner.nextFloat();
                    DBUpdateEmployeeSSN.updateEmployeeSalary(ssnToUpdate, newSalary);
                    break;
                case 7:
                    System.out.print("Enter new hire date (yyyy-mm-dd): ");
                    Date newHireDate = Date.valueOf(scanner.next());
                    DBUpdateEmployeeSSN.updateEmployeeHireDate(ssnToUpdate, newHireDate);
                    break;
                case 8:
                    System.out.print("Enter new manager ID: ");
                    int newManagerID = scanner.nextInt();
                    DBUpdateEmployeeSSN.updateEmployeeManagerID(ssnToUpdate, newManagerID);
                    break;
                case 9:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
