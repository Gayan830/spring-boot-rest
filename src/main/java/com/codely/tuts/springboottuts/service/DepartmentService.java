package com.codely.tuts.springboottuts.service;

import com.codely.tuts.springboottuts.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    Department fetchDepartment(Long departmentId);
}
