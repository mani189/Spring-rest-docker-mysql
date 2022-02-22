package com.example.SpringRest.demo.services;

import com.example.SpringRest.demo.entities.Department;

import java.util.List;

public interface deptInterService {
     List<Department>dList();
     Department getD(long dl);
     List<Department> postDept(Department department);
    void putDept(Long id, Department department);
    void deleteDep(Long id);
}
