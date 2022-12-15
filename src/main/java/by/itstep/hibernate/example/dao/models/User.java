package by.itstep.hibernate.example.dao.models;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "User")
public class User {

    @Id
    private int id;
}
