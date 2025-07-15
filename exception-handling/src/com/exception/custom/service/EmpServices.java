package com.exception.custom.service;

import com.exception.custom.admin.EmpAdminDto;
import com.exception.custom.exception.AccessDeniedException;

public class EmpServices {
    public void accessAdminPanel(EmpAdminDto emp) throws AccessDeniedException {
        if (!"ADMIN".equalsIgnoreCase(emp.getEmpRole())) {
            throw new AccessDeniedException("Access Denied! Only ADMIN can access the admin panel.");
        }
        System.out.println("Welcome to the Admin Panel, " + emp.getEmpName() + "!");
    }
}
