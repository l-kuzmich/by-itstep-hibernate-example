package by.step.hibernate.example.dao.models;

import javax.persistence.*;

@Entity
public class Wards {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_wards")
    private int id;

    @Column(name = "building")
    private int building;

    @Column(name = "floors")
    private int floors;

    @Column(name = "name_ward")
    private String name_ward;

    @Column(name = "depart_id", insertable = false, updatable = false)
    private int depart_id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name="depart_id", nullable=false)
    private Departments department;

    public Wards (){}

    public Wards(int building, int floors, String name_ward, int depart_id) {
        this.building = building;
        this.floors = floors;
        this.name_ward = name_ward;
        this.depart_id = depart_id;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName_ward() {
        return name_ward;
    }

    public void setName_ward(String name_ward) {
        this.name_ward = name_ward;
    }

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Wards{" +
                "id=" + id +
                ", building=" + building +
                ", floors=" + floors +
                ", name_ward='" + name_ward + '\'' +
                ", depart_id=" + depart_id +
                '}';
    }
}
