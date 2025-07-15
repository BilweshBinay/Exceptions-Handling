package com.exception.custom;

import com.exception.custom.service.EmpServices;
import com.exception.custom.admin.EmpAdminDto;
import com.exception.custom.exception.AccessDeniedException;

public class EmpAdmin {
    public static void main(String[] args) {

        EmpAdminDto emp = new EmpAdminDto();
        emp.setEmpId(101);
        emp.setEmpName("Raju");
//        emp.setEmpRole("USER");
        emp.setEmpRole("Admin");
        emp.setEmpSalary(50000);

        EmpServices services = new EmpServices();

        try {
            services.accessAdminPanel(emp);
        }
        catch (AccessDeniedException e) {
            System.out.println("Employee: " + emp.getEmpName() + " | Role: " + emp.getEmpRole());
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
