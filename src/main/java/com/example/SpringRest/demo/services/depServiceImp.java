package com.example.SpringRest.demo.services;

import com.example.SpringRest.demo.entities.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class depServiceImp implements deptInterService{
    List<Department>l;
    public depServiceImp() {
        l=new ArrayList<>();
        l.add(new Department(3245656l,"Tech",290));
        l.add(new Department(245635363l,"Operations",110));
    }
    @Override
    public List<Department> dList() {
        System.out.println(l);
        return l;
    }

    @Override
    public Department getD(long dl) {
        Department d=null;
        for (Department da:l){
            if(da.getdId()==dl){
                d=da;
                break;
            }
        }
        System.out.println("D is here: "+d);
        return d;
    }

    @Override
    public List<Department> postDept(Department department) {
        l.add(department);
        return l;
    }

    @Override
    public void putDept(Long id, Department department) {

         l=l.stream().map(b->{
            if(b.getdId()==id)
            {
                b.setName(department.getName());
                b.setSno(department.getSno());
            }
            return b;
        }).collect(Collectors.toList());
    }

    @Override
    public void deleteDep(Long id) {
        l=l.stream().filter(b->b.getdId()!=id).collect(Collectors.toList());
    }
}
