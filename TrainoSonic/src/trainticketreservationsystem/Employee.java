/* add-update-list-search-delete*/
package trainticketreservationsystem;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person implements Serializable {

    final private String EmployeeFileName = "Employee.bin";

    public static ArrayList<Employee> Employees = new ArrayList<Employee>();

    private String gender;
    private Date dateOfBirth;
    private String address;
    private String qualifications;
    private int phoneNumber;
    private Date dateOfJoining;

    /**
     *
     * @param UserName
     * @param password
     * @param Name
     */
    public Employee() {
    }

    public Employee(String userName, String password, String name, Date dateOfJoining, int phoneNumber, String qualifications, String address, Date dateOfBirth, String gender) {
        super(userName, password, name);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.qualifications = qualifications;
        this.phoneNumber = phoneNumber;
        this.gender = gender;

    }

    /**
     * *********SETTERS**************
     */
    public void SetEmployeeName(String name) {
        this.name = name;
    }

    public void SetEmployeeGender(String gender) {
        this.gender = gender;
    }

    public void SetEmployeeDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }

    public void SetEmployeeAddress(String address) {
        this.address = address;
    }

    public void SetEmployeeQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public void SetEmployeePhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void SetEmployeeDateOfJoining(Date date) {
        this.dateOfJoining = date;
    }

    /**
     * ****GETTERS******************
     */
    public String GetEmployeeName() {
        return (this.name);
    }

    public String GetEmplyeeGender() {
        return (this.gender);
    }

    public Date GetEmployeeDateOfBirth() {
        return this.dateOfBirth;
    }

    public String GetEmployeeAddress() {
        return (this.address);
    }

    public String GetEmployeeQualifications() {
        return (this.qualifications);
    }

    public int GetEmployeePhoneNumber() {
        return (this.phoneNumber);
    }

    public Date GetEmployeeDateOfJoining() {
        return (this.dateOfJoining);
    }

    private int getEmployeeIndex(String UserName) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).GetUserName().equals(UserName)) {
                return i;
            }
        }

        return -1;
    }

    public void LoadFromFile() {
        File f = new File(EmployeeFileName);
        if (f.exists() && !f.isDirectory()) {
            Employees = (ArrayList<Employee>) FM.Read(EmployeeFileName);
        }
    }

    public boolean commitToFile() {

        return FM.Write(Employees, EmployeeFileName);
    }

    public boolean AddEmployee() {
        LoadFromFile();
        Employees.add(this);
        return commitToFile();
    }

    public Employee SearchByEmployeeUserName(String UserName) {
        LoadFromFile();
        int index = getEmployeeIndex(UserName);
        if (index != -1) {
            return Employees.get(index);
        } else {
            return new Employee();
        }
    }

    public ArrayList<Employee> ListEmployees() {
        LoadFromFile();
        return Employees;
    }

    public boolean UpdateEmployee() {
        LoadFromFile();
        int index = getEmployeeIndex(this.userName);

        if (index != -1) {
            Employees.set(index, this);

            return commitToFile();
        }

        return false;
    }

    public boolean DeleteEmployee(String UserName) {
        LoadFromFile();
        int index = getEmployeeIndex(UserName);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public Boolean LogIn(String userName, String passWord) {

        LoadFromFile();
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).GetUserName().equals(userName)
                    && Employees.get(i).GetPassWord().equals(passWord)) {
                return true;
            }
        }

        return false;

    }

    public boolean repeatedUserName(String employeeUserName) {
        LoadFromFile();
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).GetUserName().equals(employeeUserName)) {
                return true;
            }
        }

        return false;

    }

}
