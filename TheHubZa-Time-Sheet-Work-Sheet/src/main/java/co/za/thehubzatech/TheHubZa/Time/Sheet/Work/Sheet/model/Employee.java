package co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Entity
@Table(name = "EMPLOYEE")

public class Employee {

@Id
@Column (name = "id")
    private long id;

@Column(name = "firstName")
    private String firstName;

@Column (name = "lastName")
    private String lastName;

@Column (name = "email")
    private String email;
}
