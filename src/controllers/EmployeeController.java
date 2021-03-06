/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EmployeeDAO;
import daos.RegionDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Department;
import model.Employee;
import model.Job;

/**
 *
 * @author Nitani
 */
public class EmployeeController {
    
    /*
    tot buat apa?
    */
    private Connection connection;
    private EmployeeDAO edao;
    private Employee employee;
    int tot = 0;
    List<Employee> datas = new ArrayList<>();
    

    public EmployeeController() {
    }

    public EmployeeController(Connection connection) {
        this.connection = connection;
        this.edao = new EmployeeDAO(connection);
    }

    public int hitung() {
        return edao.getAllEmployee().size();
    }

    /**
     * gets() --> to get all data
     * @return 
     */
    public List<Employee> gets() {
        return edao.getAllEmployee();
    }

    /**
     * find(Object data) --> function search by object
     * @param data
     * @return 
     */
    public List<Employee> find(Object data) {
        return edao.searchByEmployees(data);
    }
    
    /**
     * getid(int id) --> function search by id
     * @param id
     * @return 
     */
    public  List<Employee> getid(String id){
        int idEmp = Integer.parseInt(id);
        return edao.getEmployeeId(idEmp);
    }
    
    /**
     * delete(int id) --> function delete by id
     * @param id
     * @return 
     */
    public boolean delete(String id) {
        int idEmp = Integer.parseInt(id);
        return edao.deleteEmployees(idEmp);
    }
    
    public String lastId(){
        return String.valueOf(edao.lastId());
    }
    
    public void getname() {
        System.out.println(employee.getFirstName());
    }

    /**
     * update --> function for update employee
     * @param empFN
     * @param empLN
     * @param email
     * @param phoneNum
     * @param hireNum
     * @param jobId
     * @param sal
     * @param comm
     * @param managerId
     * @param departmentId
     * @param ID
     * @return 
     */
    public boolean update(String empFN, String empLN, String email, String phoneNum, String hireNum, String jobId, int sal, double comm, String managerId, String departmentId, int ID) {
        Employee employee = new Employee(empFN, empLN, email, phoneNum, hireNum, jobId, sal, comm, Integer.valueOf(managerId), Integer.valueOf(departmentId), ID);
        return edao.updateEmployee(employee);
    }
    
    /**
     * insert --> function for add new data employee
     * @param employeeid
     * @param firstname
     * @param lastname
     * @param email
     * @param phonenumber
     * @param hiredate
     * @param jobid
     * @param salary
     * @param commissionpct
     * @param managerid
     * @param departmentid
     * @return 
     */
     public boolean insert( String firstname, String lastname, String email, String phonenumber, String hiredate, String jobid, String salary, String commissionpct, String managerid, String departmentid, String employeeid) {
        boolean result = false;
        int empid =Integer.valueOf(employeeid);
        int empSal =Integer.valueOf(salary);
        double empCom =Double.valueOf(commissionpct);
        int empmanager =Integer.valueOf(managerid);
        int empdepartment =Integer.valueOf(departmentid);
        Employee employee = new Employee(firstname,
                lastname,email,
                phonenumber,hiredate,
                jobid,empSal,
                empCom,empmanager,
                empdepartment, empid);
        result = edao.insertEmployee(employee);
        return result;
    }
     
    public List<Job> selectJobId() {
        List<Job> result = new ArrayList<>();
        result = edao.selectJobId();
        return result;
    }
    
    public List<Department> selectDepartmentId() {
        List<Department> result = new ArrayList<>();
        result = edao.selectDepartmentId();
        return result;
    }
    public List<Employee> getManagerId(String id){
        return edao.getManagerId(Integer.parseInt(id));
    }
}
    
    