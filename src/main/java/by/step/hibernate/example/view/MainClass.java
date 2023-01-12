package by.step.hibernate.example.view;

import by.step.hibernate.example.dao.models.Departments;
import by.step.hibernate.example.dao.models.Doctors;
import by.step.hibernate.example.dao.models.Wards;
import by.step.hibernate.example.service.DepartmentService;
import by.step.hibernate.example.service.DoctorService;
import by.step.hibernate.example.service.WardsService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {

    static DepartmentService departmentService = new DepartmentService();
    static WardsService wardService = new WardsService();


    public static void main(String[] args) {
        Set<Wards> wards = new HashSet<>();

        Departments dep = new Departments();

        showTables();

        dep.setBuilding(5);
        dep.setFinancing(3000);
        dep.setFloor(4);
        dep.setNameDepartment("Детское");

        Wards w1 = new Wards();
        w1.setBuilding(5);
        w1.setFloors(4);
        w1.setName_ward("Палата № 115");
        w1.setDepartment(dep);
        Wards w2 = new Wards();
        w1.setBuilding(5);
        w1.setFloors(4);
        w1.setName_ward("Палата № 125");
        w1.setDepartment(dep);
        Wards w3 = new Wards();
        w1.setBuilding(5);
        w1.setFloors(4);
        w1.setName_ward("Палата № 135");
        w1.setDepartment(dep);

        wards.add(w1);
        wards.add(w2);
        wards.add(w3);

        dep.setWards(wards);

        departmentService.saveDepartment(dep);

        showTables();
    }

    public static void showTables() {

        List<Wards> wards = wardService.getAllWards();
        wards.forEach(ward -> System.out.println(ward.toString()));
        List<Departments> departments = departmentService.getAllDepartment();
        departments.forEach(dept -> System.out.println(dept.toString()));
    }
}
