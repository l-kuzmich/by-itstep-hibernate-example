package by.step.hibernate.example.dao.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "doctors")
public class Doctors {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private int id;

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "premium")
    private double premium;

    @Column(name = "salary")
    private double salary;

    @Column(name = "surname")
    private String surname;

    public Doctors() { }

    public Doctors(int id, String doctorName, String phone, double premium, double salary, String surname) {
        this.id = id;
        this.doctorName = doctorName;
        this.phone = phone;
        this.premium = premium;
        this.salary = salary;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", phone='" + phone + '\'' +
                ", premium=" + premium +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                '}';
    }
}
