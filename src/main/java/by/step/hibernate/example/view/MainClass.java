package by.step.hibernate.example.view;

import by.step.hibernate.example.dao.models.Departments;
import by.step.hibernate.example.dao.models.Doctors;
import by.step.hibernate.example.service.DepartmentService;
import by.step.hibernate.example.service.UserService;

import java.util.List;

public class MainClass {

    static UserService userService = new UserService();
    static DepartmentService departmentService = new DepartmentService();

    public static void main(String[] args) {

        showTables();

        Doctors doc = new Doctors();

        doc.setDoctorName("John");
        doc.setPhone("295471425");
        doc.setPremium(20.4);
        doc.setSalary(2000);
        doc.setSurname("Dou");

        userService.saveDoctor(doc);

        Departments dep = new Departments();

        dep.setBuilding(1);
        dep.setFinancing(5000);
        dep.setFloor(2);
        dep.setNameDepartment("new");

        departmentService.saveDepartment(dep);

        showTables();
    }

    public static void showTables() {

        List<Doctors> doctors = userService.getAllDoctors();

        doctors.forEach(user -> System.out.println(user.toString()));

        List<Departments> departments = departmentService.getAllDepartment();

        departments.forEach(user -> System.out.println(user.toString()));
    }
}
