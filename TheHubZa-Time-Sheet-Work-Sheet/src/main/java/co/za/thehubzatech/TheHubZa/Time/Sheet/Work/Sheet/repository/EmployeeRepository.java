package co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.repository;

import co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //all crud database methods
}
