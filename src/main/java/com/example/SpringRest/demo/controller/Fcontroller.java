package com.example.SpringRest.demo.controller;

import com.example.SpringRest.demo.entities.Department;
import com.example.SpringRest.demo.services.depServiceImp;
import com.example.SpringRest.demo.services.deptInterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Fcontroller {
    @Autowired
    private deptInterService depService;
    @GetMapping("/hey")
    public String h1(){
        System.out.println("ddfd");
        return "hello";
    }

    @GetMapping("/deps")
    public List<Department>departmentList(){
        return this.depService.dList();
    }

    @GetMapping("/deps/{lk}")
    public Department getDept(@PathVariable("lk") Long lka){
        System.out.println(lka);
        Department department=this.depService.getD(lka);
        return department;
    }

    @PostMapping(path ="/deps",consumes = MediaType.ALL_VALUE)
    public List<Department> postDept(@RequestBody Department department) {
        List<Department> departmentList = depService.postDept(department);
        System.out.println(departmentList);
        return departmentList;
    }

    @PutMapping("/deps/{deId}")
    public Department putDep(@PathVariable("deId") Long di,@RequestBody Department department){
        depService.putDept(di,department);
        return department;
    }

    @DeleteMapping("/deps/{depId}")
    public void delDep(@PathVariable("depId") Long dep){
        depService.deleteDep(dep);
    }

}
