package by.step.hibernate.example.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "diseases")
public class Diseases {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_diseases")
    private int id;

    @Column(name = "diseases_name")
    private String diseasesName;

    @Column(name = "severity")
    private int severity;

    public Diseases(){}

    public Diseases(int id, String diseasesName, int severity) {
        this.id = id;
        this.diseasesName = diseasesName;
        this.severity = severity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiseasesName() {
        return diseasesName;
    }

    public void setDiseasesName(String diseasesName) {
        this.diseasesName = diseasesName;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Diseases{" +
                "id=" + id +
                ", diseasesName='" + diseasesName + '\'' +
                ", severity=" + severity +
                '}';
    }
}
