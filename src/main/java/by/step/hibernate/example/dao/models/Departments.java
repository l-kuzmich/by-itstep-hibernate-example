package by.step.hibernate.example.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_department")
    private int id;

    @Column(name = "building")
    private int building;

    @Column(name = "financing")
    private double financing;

    @Column(name = "floors")
    private double floor;

    @Column(name = "name_department")
    private String nameDepartment;

    public Departments(){}

    public Departments(int id, int building, double financing, double floor, String nameDepartment) {
        this.id = id;
        this.building = building;
        this.financing = financing;
        this.floor = floor;
        this.nameDepartment = nameDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public double getFinancing() {
        return financing;
    }

    public void setFinancing(double financing) {
        this.financing = financing;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", building=" + building +
                ", financing=" + financing +
                ", floor=" + floor +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
