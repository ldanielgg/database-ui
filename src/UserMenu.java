import java.util.Scanner;
import java.sql.Date;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("=============================");
            System.out.println("     Employee Management     ");
            System.out.println("=============================");
            System.out.println();
            System.out.println("[1] View employees");
            System.out.println("[2] Search for an employee");
            System.out.println("[3] Update an employee's information");
            System.out.println("[4] Add an employee");
            System.out.println("[5] Remove an employee");
            System.out.println("[6] Generate a report");
            System.out.println("[7] Update salaries");
            System.out.println("[8] Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("        Employee List        ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("Employee ID: Full name");
                    System.out.println();
                    DBOperations.displayEmployees();
                    break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("     Search for Employee     ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("[1] By name");
                    System.out.println("[2] By SSN");
                    System.out.println("[3] By employee ID");
                    System.out.println("[4] Back to main menu");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int searchChoice = scanner.nextInt();
                    System.out.println();
                    scanner.nextLine();
                    switch (searchChoice) {
                        case 1:
                            System.out.print("Enter employee name: ");
                            String name = scanner.nextLine();
                            System.out.println();
                            System.out.println("=============================");
                            System.out.println("     Employee Information    ");
                            System.out.println("=============================");
                            System.out.println();
                            DBOperations.searchEmployeeByName(name);
                            break;
                        case 2:
                            System.out.print("Enter employee SSN: ");
                            String ssn = scanner.nextLine();
                            System.out.println();
                            System.out.println("=============================");
                            System.out.println("     Employee Information    ");
                            System.out.println("=============================");
                            System.out.println();
                            DBOperations.searchEmployeeBySSN(ssn);
                            break;
                        case 3:
                            System.out.print("Enter employee ID: ");
                            int empID = scanner.nextInt();
                            System.out.println();
                            System.out.println("=============================");
                            System.out.println("     Employee Information    ");
                            System.out.println("=============================");
                            System.out.println();
                            DBOperations.searchEmployeeById(empID);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("    Update Employee Info     ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("[1] By employee ID");
                    System.out.println("[2] By SSN");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int updateChoice = scanner.nextInt();
                    System.out.println();
                    scanner.nextLine();
                    switch (updateChoice) {
                        case 1:
                            System.out.print("Enter employee ID: ");
                            int empIDToUpdate = scanner.nextInt();
                            UpdateEmployeeMenu.updateEmployeeMenuID(empIDToUpdate);
                            break;
                        case 2:
                            System.out.print("Enter employee SSN: ");
                            Integer ssnToUpdate = scanner.nextInt();
                            UpdateEmployeeMenu.updateEmployeeMenuSSN(ssnToUpdate);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("=============================");
                    System.out.println("       Add an Employee      ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.print("Enter employee's ID #: ");
                    int empID = scanner.nextInt();
                    System.out.print("Enter employee's first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter employee's last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter employee's SSN: ");
                    String ssn = scanner.next();
                    System.out.print("Enter employee's job title: ");
                    String jobTitle = scanner.next();
                    System.out.print("Enter employee's department ID #: ");
                    int departmentID = scanner.nextInt();
                    System.out.print("Enter employee's salary: ");
                    float salary = scanner.nextFloat();
                    System.out.print("Enter employee's hire date (yyyy-mm-dd): ");
                    Date hireDate = Date.valueOf(scanner.next());
                    scanner.nextLine();
                    System.out.print("Enter employee's manager ID #: ");
                    String input = scanner.nextLine();
                    Integer managerID = null;
                    if (!input.trim().isEmpty()) {
                        try{
                            managerID = Integer.parseInt(input);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Manager ID must be an integer.");
                        }
                    }
                    DBOperations.addEmployee(empID, firstName, lastName, ssn, jobTitle, departmentID, salary, hireDate, managerID);
                    break;
                case 5:
                    System.out.println("=============================");
                    System.out.println("      Remove an Employee    ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.print("Enter employee's ID #: ");
                    int empIDToRemove = scanner.nextInt();
                    DBOperations.removeEmployee(empIDToRemove);
                    break;
                case 6:
                    System.out.println("=============================");
                    System.out.println("       Generate Report       ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.println("[1] All employee info with pay history");
                    System.out.println("[2] Total monthly pay by job title");
                    System.out.println("[3] Total monthly pay by department ID");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int reportChoice = scanner.nextInt();
                    System.out.println();
                    switch (reportChoice) {
                        case 1: 
                            System.out.println("=============================");
                            System.out.println("       Employee Report       ");
                            System.out.println("=============================");
                            System.out.println();
                            DBOperations.generateReportAllEmployees();
                            continue;
                        case 2:
                            System.out.println("=============================");
                            System.out.println("      Job Title Report      ");
                            System.out.println("=============================");
                            System.out.println();
                            System.out.println("Job Title: Total Yearly Pay");
                            System.out.println();
                            DBOperations.generateReportByJobTitle();
                            continue;
                        case 3:
                            System.out.println("=============================");
                            System.out.println("    Department ID Report     ");
                            System.out.println("=============================");
                            System.out.println();
                            System.out.println("Department ID: Total Yearly Pay");
                            System.out.println();
                            DBOperations.generateReportByDepartmentID();
                            continue;
                    }
                    break;
                case 7:
                    System.out.println("=============================");
                    System.out.println("      Update Salaries       ");
                    System.out.println("=============================");
                    System.out.println();
                    System.out.print("Enter the percentage increase (e.g., 10 for 10%): ");
                    float salaryIncreasePercentage = (scanner.nextFloat() / 100);
                    System.out.print("Enter the lower bound of the salary range: ");
                    float lowerBound = scanner.nextFloat();
                    System.out.print("Enter the upper bound of the salary range: ");
                    float upperBound = scanner.nextFloat();
                    System.out.println("Updating salaries...");
                    DBOperations.updateSalaries(salaryIncreasePercentage, lowerBound, upperBound);
                    break;
                case 8:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
