package by.step.hibernate.example.dao.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Departments {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_department")
    private int id;

    @Column(name = "building")
    private int building;

    @OneToMany (mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Wards> wards;

    @Column(name = "financing")
    private double financing;

    @Column(name = "floors")
    private double floor;

    @Column(name = "name_department")
    private String nameDepartment;

    public Departments(){}

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

    public Set<Wards> getWards() {
        return wards;
    }

    public void setWards(Set<Wards> wards) {
        this.wards = wards;
    }

    public double getFinancing() {
        return financing;
    }

    public void setFinancing(double financing) {
        this.financing = financing;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", building=" + building +
                ", financing=" + financing +
                ", floor=" + floor +
                ", wards=" + wards +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }
}
